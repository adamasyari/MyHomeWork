package Modul_2;

class Node {
    Node next;
    public Object name;
    Node(Object name){
        this.name = name;
    }
}
class Nomor1{
    /*Mendeklarasikan tipe variabel top dan tail dengan tipe data Node. 
     * 
    */
    Node Top;
    Node tail;
    public void Push(Object name){
        /*method push berguna untuk menambahkan object nama pada stack
         * atribut-atribut dari class node, method push sama seperti method AddFirst dimana method push akan menambahkan object nama
         */
        Node newName = new Node(name);
        /*membuat kondisi ketika push masih belum terisi node. */
        if(Top == null){
            /*menginisialisasikan nailai dari node top dengan node yang baru dimasukkan
             * hanya baru diisi oleh satu node
            */
            Top = tail = newName;
            /*kondisi lainnya yaitu katika push terisi oleh node */
        }else{
            newName.next = Top;
            /*mengubah status dari node baru menjadi top karena node yang baru digabungkan sekarang menjadi node yang berada di posisi toop pada link list */
            Top = newName;
        }
    }
    Node Top(){
        /*method top() berfungsi untuk menunjuk ke arah node yag berada paling atas*/
        return Top;
    }
    public Object pop(){
        /*method pop() berfungsi untuk mengambil nilai yang terisi terakhir*/
        Node temp = Top;
        /*Node temp berfungsi untuk menunjuk ke Top*/
        Top = Top.next;
        /*top = top.next akan mengabaikan nilai top dan memindahkan top ke node selanjutnya */
        return temp.name;
        /*scrip return temp.name mengembalikan nilai name */
    }
    public void save(Nomor1 obj1, Nomor1 obj2, String string){
        /*method save() berfungsi untuk menghapus objek yang berada d tengah */
        Node current = obj1.Top;
        while(current != null){
            /*scrip while berfungsi untuk menentukan kondisi apakah current != null*/
            obj2.Push(obj1.pop());
            /*jika kondisi while terpenuhi maka akan mengeksekusi obj2.Push(obj1.pop());*/
            if(current.next.name.equals(string)){
                Top = current.next;
                break;
            }
            current = current.next;
        }
    }
    public void margerlist(Nomor1 list1, Nomor1 list2){
        /*method margerlist berfungsi untuk menyambung stack yang terpisah */
        while(list2.Top != null){
            /*scrip while berfungsi untuk menentukan kondisi apakah list2.top != null*/
            list1.Push(list2.pop());
            /*jika scrip while berfungsi untuk menentukan konidisi maka akan mengeksekusi statement"list1.Push(list2.pop());"*/
        }
    }
    public void PrintAll(){
        /*method printAll berfungsi untuk menampilkan object yantg telah dimasukkan di method push()*/
        Node current = Top;
        while(current.next != null){
            System.out.println(current.name + " ");
            /*method System.out.println berfungsi untuk meampilkan name */
            if(current != null){
                System.out.println(" ^ ");
                /*method System.out.println berfungsi untuk meampilkan "^"*/
            }
            current = current.next;
        }
        System.out.print(current.name + " ");
        System.out.println(" ");
    }
}
public class JurnalModul2_Nomor1 {
    public static void main(String[] args){
        Nomor1 obj1 = new Nomor1();
        Nomor1 obj2 = new Nomor1();
        /*membuat tumpukan stack yang terdiri objek-objek dengan menggunakan method push() untuk memasukkan objek  */
        obj1.Push("Goku");
        obj1.Push("Anya");
        obj1.Push("Nagato");
        obj1.Push("Denji");
        obj1.Push("Loid");
        /*menampilkan stack element sebelum dihapus */
        System.out.println("Stack Sebelum Elemen Dihapus");
        obj1.PrintAll();
        /*menentukan stack element yang akan dihapus */
        obj1.save(obj1, obj2, "Anya");
        System.out.println("Stactk Setelah Dihapus");
        obj1.PrintAll();
        obj1.pop();
        /*meampilkan stack yang sudah dihapus */
        System.out.println("Output Akhir ");
        obj1.margerlist(obj1, obj2);
        obj1.PrintAll();
    }
}