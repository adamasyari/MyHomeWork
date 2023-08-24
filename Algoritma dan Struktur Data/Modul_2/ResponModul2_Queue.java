package Modul_2;

class Node {
    Node next, prev;
    public Object benda;
    Node(Object benda){
        this.benda = benda;
    }
}
class responQueue{
    Node top, tail;

    public boolean isEmpty(){
        return tail == null || top == null;
    }
    public void enqueue(Object benda){
        Node newBenda = new Node(benda);
        if(isEmpty()){
            top = tail = newBenda;
        }else{
            newBenda.next = top; 
            top= newBenda;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("data kosong");
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public Object peek(){
        return tail.benda;
    }
    public void printAll(){
        Node current = top;
        while(current != null){
            System.out.println("Nama : " + current.benda);
            current = current.next;
        }
    }
}
public class ResponModul2_Queue {
    public static void main(String[] args){
        responQueue data = new responQueue();

        data.enqueue("yuan");
        data.enqueue("adam");
        data.enqueue("nopal");
        data.enqueue("asad");
        data.enqueue("ali");
        data.enqueue("fikar");
        System.out.println("Daftar yang mengantri untuk beli tiket bioskop :");
        data.printAll();

        data.dequeue();
        System.out.println ("Daftar yang mengantri untuk beli tiket bioskop : ");
        data.printAll();
    }
}
