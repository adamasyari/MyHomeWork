package Modul_4;

class treeNode {
    String nama;
    treeNode left;
    treeNode right;

    public treeNode(String nama) {
        this.nama = nama;
        right = null;
        left = null;
    }
}

class tree {
    node root;

    void insert(String parent, String left, String right) {
        if (root == null) {
            root = new node(parent);
            System.out.println(parent + " Dibuat Sebagai Root");
        }
        node nama = search(root, parent);
        nama.left = new node(left);
        System.out.println(left + " ditambahkan sebagai left dari " + parent);
        nama.right = new node(right);
        System.out.println(right + " ditambahkan sebagai left dari " + parent);
    }

    node search(node root, String Parent) {
        if (root == null) {
            return null;
        } else if (root.nama == Parent) {
            return root;
        }
        node tmp = search(root.left, Parent);

        if (tmp != null) {
            return tmp;
        } else {
            return search(root.right, Parent);
        }
    }

    void po() {
        preorder(root);
    }

    void preorder(node root) {
        if (root != null) {
            if (root.left != null) {
                System.out.println(root.nama + ": " + root.left.nama + " & " + root.right.nama);
                preorder(root.left);
                preorder(root.right);
            } else {
                System.out.println(root.nama + ": -");
            }
        }
    }
}

public class ResponModul_4 {
    public static void main(String[] args) {
        tree tri = new tree();

        tri.insert("X", "X1", "X2");
        tri.insert("X2", "X5", "X6");
        tri.insert("X1", "X3", "X4");

        tri.po();
    }
}
