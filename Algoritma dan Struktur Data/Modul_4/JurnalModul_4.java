package Modul_4;

import java.util.*;

class node {
    String nama;
    node left;
    node right;

    public node(String nama) {
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
        node nama = pencarian(root, parent);
        nama.left = new node(left);
        System.out.println(left + " ditambahkan sebagai left child dari " + parent);
        nama.right = new node(right);
        System.out.println(right + " ditambahkan sebagai left child dari " + parent);
    }

    node pencarian(node root, String Parent) {
        if (root == null) {
            return null;
        } else if (root.nama == Parent) {
            return root;
        }
        node tmp = pencarian(root.left, Parent);

        if (tmp != null) {
            return tmp;
        } else {
            return pencarian(root.right, Parent);
        }
    }

    int ceklevel(node node, String data, int level) {
        if (node == null)
            return 0;
        if (node.nama == data)
            return level;
        int lebihkecil = ceklevel(node.left, data, level + 1);
        if (lebihkecil != 0)
            return lebihkecil;

        lebihkecil = ceklevel(node.right, data, level + 1);
        return lebihkecil;
    }

    /*
     * void insertRoot(String nama) {
     * root = new Node(nama, 0);
     * }
     */

    String pencarianorangtua(node node, String baru, String parent) {
        if (node == null)
            return null;
        if (node.nama == baru) {
            return parent;
        }

        String tmp = pencarianorangtua(node.left, baru, node.nama);
        if (tmp != null) {
            return tmp;
        } else {
            return pencarianorangtua(node.right, baru, node.nama);
        }
    }

    // berikut merupakan method yang digunakan untuk mencari hubungan keluarga
    // antara dua orang, yang dimana method ini bertipe data void
    // maka method ini tidak perlu mengembalikan nilai yang masuk dan diolah pada
    // method ini
    void relasi(String nama1, String nama2) {
        String tmp = null, tmp2 = null;
        int nilai1 = ceklevel(root, nama1, 0);
        int nilai2 = ceklevel(root, nama2, 0);
        int selisih = nilai1 - nilai2;

        if (selisih == 0) {
            tmp = pencarianorangtua(root, nama1, null);
            tmp2 = pencarianorangtua(root, nama2, null);
            if (tmp.equalsIgnoreCase(tmp2)) {
                System.out.printf("%s adalah saudara dari %s\n", nama1, nama2);
            } else {
                System.out.printf("%s adalah saudara jauh dari %s\n", nama1, nama2);
            }
        } else if (selisih == 1) {
            if (pencarianorangtua(root, nama1, " ").equalsIgnoreCase(nama2)) {
                System.out.printf("%s adalah anak %s\n", nama1, nama2);
            } else {
                tmp = pencarianorangtua(root, nama1, null);
                tmp = pencarianorangtua(root, tmp, null);
                if (tmp.equalsIgnoreCase(pencarianorangtua(root, nama2, null))) {
                    System.out.printf("%s adalah keponakan dari %s\n", nama1, nama2);
                } else {
                    System.out.printf("%s adalah keponakan jauh dari %s\n", nama1, nama2);
                }
            }
        } else if (selisih == 2) {
            tmp = pencarianorangtua(root, nama1, null);
            tmp = pencarianorangtua(root, tmp, null);
            if (tmp.equalsIgnoreCase(nama2)) {
                System.out.printf("%s adalah cucu dari %s\n", nama1, nama2);
            } else {
                System.out.printf("%s adalah cucu jauh dari %s\n", nama1, nama2);
            }
        } else if (selisih == 3) {
            System.out.printf("%s adalah cicit dari %s\n", nama1, nama2);
        } else if (selisih == -1) {
            if (pencarianorangtua(root, nama2, " ").equalsIgnoreCase(nama1)) {
                System.out.printf("%s adalah anak %s\n", nama2, nama1);
            } else {
                tmp = pencarianorangtua(root, nama2, null);
                tmp = pencarianorangtua(root, tmp, null);
                if (tmp.equalsIgnoreCase(pencarianorangtua(root, nama1, null))) {
                    System.out.printf("%s adalah keponakan dari %s\n", nama2, nama1);
                } else {
                    System.out.printf("%s adalah keponakan jauh dari %s\n", nama2, nama1);
                }
            }
        } else if (selisih == -2) {
            tmp = pencarianorangtua(root, nama2, null);
            tmp = pencarianorangtua(root, tmp, null);
            if (tmp.equalsIgnoreCase(nama1)) {
                System.out.printf("%s adalah cucu dari %s\n", nama2, nama1);
            } else {
                System.out.printf("%s adalah cucu jauh dari %s\n", nama2, nama1);
            }
        } else if (selisih == -3) {
            System.out.printf("%s adalah cicit dari %s\n", nama2, nama1);
        } else {
            System.out.printf("%s dan %s tidak memiliki garis keturunan", nama1, nama2);
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

public class JurnalModul_4 {
    public static void main(String[] args) {
        tree tri = new tree();
        Scanner java = new Scanner(System.in);
        tri.insert("DAUS", "PUTRI", "DADEN");
        tri.insert("PUTRI", "ARI", "LILUL");
        tri.insert("DADEN", "ARSAN", "JIDAN");
        tri.insert("ARI", "UNO", "SHAFA");
        tri.insert("LILUL", "DIAZ", "MELKI");
        tri.insert("ARSAN", "MAHEN", "ALITA");
        tri.insert("JIDAN", "ROZAKI", "AGUNG");

        System.out.println("\n" + "HUBUNGAN" + "\n");
        tri.relasi("PUTRI", "DAUS");
        tri.relasi("DAUS", "SHAFA");
        tri.relasi("MAHEN", "ALITA");
        tri.relasi("MAHEN", "UNO");
        tri.relasi("DAUS", "LILUL");
        tri.relasi("MELKI", "DADEN");
        tri.relasi("ARSAN", "ROZAKI");
        tri.relasi("ROZAKI", "ARI");
        tri.relasi("DIAZ", "AGUNG");

        System.out.println("\n" + "PRE-ORDER" + "\n");
        tri.po();
        java.close();
    }
}
