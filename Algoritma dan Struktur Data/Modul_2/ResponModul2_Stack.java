package Modul_2;

class Node{
    Node next;
    public Object nameBook;
    Node(Object nameBook){
        this.nameBook = nameBook;
    }
}

class responStack{
    Node Top;
    Node tail;
    public void push(Object nameBook){
        Node newName = new Node(nameBook);
        if(Top == null){
            Top = tail = newName;
            newName.next = Top;
            Top = newName;
        }
    }
    Node Top(){
        return Top;
    }
    public Object pop(){
        Node temp = Top;
        Top = Top.next;
        return temp.nameBook;
    }
    public void save(responStack obj1, responStack obj2, String string){
        Node current = obj1.Top;
        while(current != null){
            obj2.push(obj1.pop());

            if(current.next.nameBook.equals(string)){
                Top = current.next;
                break;
            }
            current = current.next;
        }
    }
    public void margerlist(responStack list1, responStack list2){
        while(list2.Top != null){
            list1.push(list2.pop());
        }
    }
    public void PrintAll(){
        
        Node current = Top;
        while(current != null){
            System.out.println("Nama Buku : " + current.nameBook);
            
            current = current.next;
        }
        
    }
}
public class ResponModul2_Stack {
    public static void main(String[] args){
        responStack obj1 = new responStack();
        responStack obj2 = new responStack();

        obj1.push("Bahasa Indonesia");
        obj1.push("Penjas Orkes");
        obj1.push("Kewarganegaraan");
        obj1.push("Kesenian");
        obj1.push("Matematika");
        obj1.push("Biologi");
        obj1.push("Kimia");
        obj1.push("Fisika");

        System.out.println("Daftar Nama Buku di Perpustakaan : ");
        obj1.PrintAll();

        obj1.save(obj1, obj2, "kewarganegaraan" );
        System.out.println ("Daftar Nama Buku yang tersisa di Perpustakaan : ");
        obj1.PrintAll();
        obj1.pop();

        System.out.println ("Daftar Nama Buku yang tersisa di Perpustakaan :");
        obj1.margerlist(obj1, obj2);
        obj1.PrintAll();
    }
}