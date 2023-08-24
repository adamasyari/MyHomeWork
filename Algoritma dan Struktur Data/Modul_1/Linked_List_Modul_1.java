package Modul_1;
class Node {
    Node next, prev;
    public String name;
    public int height, power;
    Node(String name, int height, int power){
        this.height = height;
        this.power  = power;
        this.name   = name;
    }
    Node(String name){
        this.name = name;
    }
}
class Modul_1{
    Node head, tail, temp;
     //Mendeklarasikan tipe variabel head, tail, dan temp dengan tipe data Node. Variabel Head akan menampung nilai berupa
    //Node yang paling awal di dalam linked list, tail akan menampung nilai simpul yang paling akhir, sedangkan temp akan
    //Menampung nilai dari node yang bersifat sementara ketika user memanggil method getTemp.
    public void Add(String name, int height, int power){
         //Method add berguna untuk menambahkan simpul atau node pada linked list. Method add menggunakan parameter berupa
    //Atribut-atribut dari class node, method add sama seperti method addFirst dimana method add akan menambahkan simpul
    //baru ke dalam linkedlist melalui head atau node terdepan dari linkedlist tersebut.
        var newName = new Node(name, height, power);
        //Membuat kondisi ketika linked-list masih belum terisi dengan node.
        if(cek()){
            //Menginisialisasikan nilai dari node head, dan tail dengan node yang baru dimasukkan karena linked list
            //hanya baru diisi oleh satu node.
            head = tail = newName;
            //Kondisi lainnya yaitu ketika linked-list sudah terisi oleh node
        }else{
            //Menyambungkan pointer prev dari node yang baru dibuat ke node terakhir dari linked list.
            newName.prev = tail;
            //Menyambungkan pointer next dari node terakhir dari linked list ke node yang baru dibuat
            tail.next = newName;
            //mengubah status dari node bari menjadi tail karena node yang baru digabungkan sekarang menjadi node yang
            //berada di posisi terakhir dari linked list.
            tail = newName;
        }
    }
    //Membuat method add yang merupakan method overloading dari method sebelumnya, hanya saja method kali ini digunakan
    //untuk persoalan nomor 2 dari linked list, dimana pengguna tidak harus memasukkan semua atribut-atribut objek dari
    //kelas nodenya.
    public void AddAfter(Object target,String name, int height, int power ){
        //Mendeklarasikan current dengan tipe data berupa class node dan menginisialisasikan nilainya dengan node head.
        //atau memposisikan posisi current di node awal dari linked list tersebut.
        Node current = head;
         //Membuat objek baru dari class Node dengan menggunakan parameter yang mengoper argument dari parameter method-
        //nya
        var newName = new Node(name, height, power);
         //Membuat perulangan yang berfungsi untuk menggeser current ke posisi setelahya selagi kondisinya terpenuhi
        //yaitu nilai dari currentnya != null atau selagi current mempunyai nilai berupa node-node dari linkedlist tsb.
        while(current != null){
            //membuat percabangan dengan kondisi current.nama == posisi yang berarti bahwa ketika nilai nama dari curren
            //t sudah sesuai dengan posisi yang diinputkan, maka akan melakukan suatu statement tertentu
            if(current.name == target){
                //Menunjuk pointer next dari node baru ke arah yang sama dengan yang ditunjuk oleh current pada waktu
                //itu.
                newName.next = current.next;
                 //Mengakses pointer prev dari node setelah current dan menunjuk node baru dengan menggunakan pointer ter
                //sebut.
                current.next.prev = newName;
                //Menunjuk node baru dengan menggunakan pointer prev dari node yang beradad di posisi current
                current.next = newName;
                //Menunjuk node current dengan menggunakan pointer prev dari node barunya.
                newName.prev = current;
            }
            //Menggeser posisi current satu langkah ke arah node setelahnya.
            current = current.next;
        }
    }
     //Method remove berguna untuk menghapus node yang ada di dalam linked list dengan memasukkan acuan berupa posisi
    //dari node tersebut
    public void Remove(String name){
        //Mendeklarasikan current dengan tipe data berupa class node dan menginisialisasikan nilainya dengan node head.
        //atau memposisikan posisi current di node awal dari linked list tersebut.
        Node current = head;
        //Membuat perulangan yang berfungsi untuk menggeser current ke posisi setelahya selagi kondisinya terpenuhi
        //yaitu nilai dari currentnya != null atau selagi current mempunyai nilai berupa node-node dari linkedlist tsb.
        while(current != null){
             //membuat percabangan dengan kondisi current.nama == posisi yang berarti bahwa ketika nilai nama dari curren
            //t sudah sesuai dengan posisi yang diinputkan, maka akan melakukan suatu statement tertentu.
            if(current.name == name){
                 //Mengakses pointer next dari node sebelum current dan menginisialisasikan nilainya dengan node setelah
                //current.
                current.prev.next = current.next;
                //Mengakses pointer prev dari node setelah current dan menginisialisasikan nilainya dengan node sebelum
                //current.
                current.next.prev = current.prev;
                //keyword break berfungsi untuk keluar dari perulangan.
                return;
            }
            //Menggeser posisi current satu langkah ke arah node setelahnya.
            current = current.next;
        }
    }
    //Method printAll berfungsi untuk menampilkan setiap nilai dari node yang diakses atau dilewati oleh current.
    public void printAll(){
         //Mendeklarasikan current dengan tipe data berupa class node dan menginisialisasikan nilainya dengan node head.
        //atau memposisikan posisi current di node awal dari linked list tersebut.
        Node current = head;
        //Membuat perulangan yang berfungsi untuk menggeser current ke posisi setelahya selagi kondisinya terpenuhi
        //yaitu nilai dari currentnya != null atau selagi current mempunyai nilai berupa node-node dari linkedlist tsb.
        while(current != null){
            System.out.print(current.name + ", ");
            //menampilkan output berupa nilai dari attribut nama pada node yang diakses oleh current pada waktu itu. dan
            //menampilkan ", height : "
            System.out.print(current.height + "cm, ");
            //menampilkan output berupa nilai dari attribut tinggi pada node yang diakses oleh current pada waktu itu.
            //dan menampilkan ", power : "
            System.out.print(current.power + " ");
             //menampilkan output berupa nilai dari attribut power pada node yang diakses oleh current pada waktu itu.
            //dan menampilkan "  "
            //Menggeser posisi current satu langkah ke arah node setelahnya.
            if (current.next != null){
                System.out.print(" => ");
            }
            current = current.next;
        }
        System.out.println(" ");
        System.out.println(" ");
        
    }
    //Method printAll2 berfungsi untuk menampilkan output linked list pada persoalan nomor 2
    public  void printAll2() {
          //Mendeklarasikan current dengan tipe data berupa class node dan menginisialisasikan nilainya dengan node head.
           //atau memposisikan posisi current di node awal dari linked list tersebut.
        Node current = head;
        //Membuat perulangan yang berfungsi untuk menggeser current ke posisi setelahya selagi kondisinya terpenuhi
        //yaitu nilai dari currentnya != null atau selagi current mempunyai nilai berupa node-node dari linkedlist tsb.
        while(current != null){
            //Membuat percabangan dengan kondisi "current.next != null" atau ketika pointer next dari nodenya != null
            // maka akan melakukan suatu statement tertentu.
            System.out.print(current.name + ", ");
             //menampilkan atribut nama dari node pada posisi current tersebut
            System.out.print(current.height + " cm, ");
             //menampilkan atribut nama dari node pada posisi current tersebut
            System.out.print(current.power + " ");
             //menampilkan atribut nama dari node pada posisi current tersebut
            if (current.next != null){
                System.out.print(" => ");
            } 
            //Membuat kondisi percabangan yang lain yaitu ketika kondisi "current.next == null " atau ketika pointer
            //bexr dari nodenya == null, maka akan melakukan suatu statement tertentu.
            else{
                System.out.println(current.name);
                 //Menggeser posisi current satu langkah ke arah node setelahnya.
            }
            //Menggeser posisi current satu langkah ke arah node setelahnya.
            current = current.next;
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    //Method cek berfungsi untuk mengembalikan nilai (head == null) dan (tail == null) dengan tipe data boolean. Yang ak
    //an dipanggil ketika melakukan percabangan dengan kondisi linkedlist yang masih kosong atau belum terisi oleh data2
    public boolean cek(){
        return ((head == null) && (tail == null));
    }
    public void margerlist(Modul_1 m2, Modul_1 m1) {
        m1.tail.next = m2.head;
        m2.head.prev = m1.tail;
    }
}
public class Linked_List_Modul_1{
    public static void main(String[] args){
        Modul_1 obj = new Modul_1();
        //Membuat barisan yang terdiri dari objek-objek yang berteduk dengan menggunaka method add untuk memasukkan obj
        //ek ke dalam linked list, dan method print2 untuk menampilkan barisan tersebut.
        obj.Add("Putri", 138, 34);
        obj.Add("Alita", 155, 33);
        obj.Add("Devian", 160, 36);
        obj.Add("Dadi", 164, 37);
        obj.Add("Melki",165,40);
        obj.Add("Pande",168,51);
        obj.Add("Agus",169,54);
        obj.Add("Azzam",170,57);
        obj.Add("Weng",182,61);
        obj.Add("Jidan",183,62);

        //menampilkan semua data 
        System.out.println("Output barisan semula");
        obj.printAll();

        //Dadi dan Agus pergi hunting makanan
        obj.Remove("Dadi");
        obj.Remove("Agus");

        System.out.println("Output ketika penampilan Feast");
        obj.printAll();

        System.out.println("Output ketika Devian kelelahan dan keluar dari barisan semua");
        obj.Remove("Devian");

        System.out.println("Output ketika Dadi datang dan menggantikan Devian");
        obj.AddAfter("Melki","Dadi", 164, 37);
        obj.printAll();

        System.out.println("Output ketika Azzam menggalau dan keluar barisan");
        obj.Remove("Azzam");
        obj.printAll();

        System.out.println("Output ketika kedatangan Agus menggantikan Azzam ");
        obj.AddAfter("Weng", "Agus", 169, 54);
        obj.printAll();
        //Membuat objek m1 dan m2 dari class Modul_1 sebagai barisan pertama(Berteduh) dan barisan
        // ke-dua(Yang tetap menonton)
        Modul_1 m1 = new Modul_1();
        Modul_1 m2 = new Modul_1();
        //Membuat barisan yang terdiri dari objek-objek yang berteduk dengan menggunaka method add untuk memasukkan obj
        //ek ke dalam linked list, dan method print2 untuk menampilkan barisan tersebut.
        System.out.println("BERTEDUH");
        m1.Add("Dadi", 164, 37);
        m1.Add("Agus", 169, 54);
        m1.Add("Weng", 182, 61);
        m1.Add("Jidan", 183, 62);
        m1.printAll2();
        //Membuat barisan yang terdiri dari objek-objek yang berteduk dengan menggunaka method add untuk memasukkan obj
        //ek ke dalam linked list, dan method print2 untuk menampilkan barisan tersebut.
        System.out.println("TETAP MENONTON KONSER");
        m2.Add("Alita", 155, 33);
        m2. Add("Putri", 138, 34);
        m2. Add("Melki", 165, 40);
        m2. Add("Permadi", 168, 51);
        m2.printAll2();

        System.out.println("Output Akhir");
        //Menggabungkan kedua barisan dengan memanggil class Nomor2 dan method mergelist dengan mem-passing argumen
        //dengan menggunakan kedua objek dari class Modul_1
        margerlist(m2, m1);
        m1.printAll2();
        m2.printAll2();
        //Menampilkan barisan yang sudah digabung dengan menggunakan objek dair class Modul_1 dan menggunakan method
        //print2.
    }
}