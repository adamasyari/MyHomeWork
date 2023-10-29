package Modul_3;

class Node{
    /*class Node berfungsi untuk mendeklarasikan tipe data yang akan digunakan di dalam method sesuai kebutuhan yang akan digunakan */
    Node next, prev;
    String namaBarang;
    int harga, stok;
    
    Node(String namaBarang, int harga, int stok){
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }
}
class Modul_3{
    Node head, tail;

    public boolean isEmpty(){
        /*boolean isEmpety() berfungsi untuk menentukan kondisi head == null*/
        return head == null;
    }
    public void addFirst(String namaBarang, int harga, int stok){
        /*void addFirst berfungsi untuk menginput dan menambah data */
        Node data = new Node(namaBarang, harga, stok);
        if (isEmpty()){
            head = tail = data;
        } else{
            data.next = head;
            head.prev = data;
            head = data;
            head.prev = null;
        }
    }
    public void bubbleSort(){
        /*method bubbleSort berfungsi untuk mempermudah dalam mencari suatu nilai dalam elemen yang jumlahnya tak terhingga, dengan cara mengurutkan seluruh elemen yang ada mulai dari yang terkecil maupun dari yang terbesar.*/
        Node current = head;
        int i = 0;

        if (isEmpty()) {
            return;
        } else{
            while (current != null) {
                Node currentNext = current.next;
                while(currentNext != null){
                    while(current.namaBarang.charAt(i) == currentNext.namaBarang.charAt(i)){
                        i++;
                    }
                    if(current.namaBarang.charAt(i) != currentNext.namaBarang.charAt(i) && current.namaBarang.charAt(i) > currentNext.namaBarang.charAt(i)){
                        swapSort(current,currentNext);
                    }
                    i = 0;
                    currentNext = currentNext.next;
                }
                current = current.next;
            }
        }
    }
    public void swapSort(Node Notasi, Node node){
        /*method swapSort() berfungsi untuk mempermudah dalam menukar data sesuai method yang akan digunakan untuk menukar data*/
        String tempBarang;
        int tempHarga, tempStok;

        tempBarang = Notasi.namaBarang;
        tempStok = Notasi.stok;
        tempHarga = Notasi.harga;

        Notasi.namaBarang = node.namaBarang;
        Notasi.stok = node.stok;
        Notasi.harga = node.harga;

        node.namaBarang = tempBarang;
        node.harga = tempHarga;
        node.stok = tempStok;
    }
    public void insertion(){
        /*Insertion Sort merupakan sebuah teknik pengurutan dengan cara membandingkan dan mengurutkan dua data pertama pada array, kemudian membandingkan data para array berikutnya apakah sudah berada di tempat semestinya. */
        Node current = head;
        
        while(current != tail) {
            Node currentNext = current.next;
            if(current.harga < currentNext.harga){
                swapSort(current, currentNext);
                while(current.prev != null){
                    if(current.prev.harga < current.harga){
                        swapSort(current.prev, current);
                    }
                    current = current.prev;
                }
            }
            current = current.next;
        }
    }
    public Node mergeSort(Node start){
        /*method mergeSort() berfungsi untuk memecah masalah menjadi dua atau lebih sub-masalah dari jenis yang sama atau terkait, sampai ini menjadi cukup sederhana untuk diselesaikan secara langsung. Solusi untuk sub-masalah kemudian digabungkan untuk memberikan solusi untuk masalah aslinya. */
        if(start == null || start.next == null){
            return start;
        }
        Node result = middleSort(start);
        start = mergeSort(start);
        result = mergeSort(result);
        return merge(start, result);
    }
    public Node middleSort(Node first){
        /*method middleSort() berfungsi untuk menentukan middle pda method mergeSort()*/
        Node slow = first;
        Node fast = first.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public Node merge(Node first, Node second){
    if(first == null){
            return second;
        }
        if(second == null){
            return first;
        }
        if(first.stok < second.stok){
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        }else{
            second. next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }

    }
    public Node miiddleSearch(Node start, Node end){
        /*method middle search berfungsi untuk menentukan nilai middle pada method binarySearch */
        if(start == null){
            return null;
        }
        Node slow = start;
        Node fast = start.next;
        while(fast != end){
            fast = fast.next;
            if(fast != end){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
    public void binarySearch(String search){
        /*Binary Search merupakan sebuah teknik pencarian data dengancara berulang kali membagi separuh dari jumlah data yang dicari sampai sehingga memperkecil lokasi pencarian menjadi satu data. Dengan teknik ini kita akanmembuang setengah dari jumlah data. */
        Node start = head;
        Node end = null;

        System.out.println("MENCARI BARANG : " + search);
        while(end != start){
            Node mid = miiddleSearch(start,end);
            if(start.namaBarang.equals(search)){
                System.out.println("===== Barang Ditemukan =====");
                System.out.println("Nama Barang : " + mid.namaBarang);
                if(mid.prev != null && mid.next != null ){
                    System.out.println("Letak : Sebelum Barang "+ mid.next.namaBarang);
                    System.out.println("Letak : Setelah Barang " + mid.prev.namaBarang);
                    return;
                }else if(mid.prev == null){
                    System.out.println("Letak : Sebelum Barang " + mid.next.namaBarang);
                    return;
                }else if(mid.next == null){
                    System.out.println("Letak : Setelah Barang " + mid.prev.namaBarang);
                    return;
                }
            } else if (mid.namaBarang.compareTo(search) < 0){
                start = mid.next;
            } else{
                end = mid;
            }
        }
        System.out.println("===== BARANG TIDAK DITEMUKAN =====");
    }
    public void sequentialSearch(String search){
        /*Sequential search merupakan sebuah pencarian data secara berurutan dimulai dari data yang pertama hingga data yang dicari disebut dengan data kunci. Pencarian secara sekuensial ini dapat dilakukan terhadap data yang belum beruurut. */
        Node current = head;

        System.out.println("MENCARI BARANG : " + search);
        while(current != null){
            if(current.namaBarang.equals(search)){
                System.out.println("===== Barang Ditemukan =====");
                System.out.println("Nama Barang : " + current.namaBarang);
                if (current.prev != null && current.next == null  ){
                    System.out.println("Letak : Setelah Barang " + current.prev.namaBarang);
                    System.out.println("Letak : Sebelum Barang " + current.next.namaBarang);
                    return;
                } else if(current.prev == null){
                    System.out.println("Letak : Sebelum Barang " + current.next.namaBarang);
                    return;
                } else if(current.next == null){
                    System.out.println("Letak Setelah Barang " + current.prev.namaBarang);
                    return;
                }
            }
            current = current.next;
        }
        System.out.println("===== BARANG TIDAK DITEMUKAN =====");
    }
    
    public void printAll(){
       /*method printAll berfungsi untuk menampilkan data yang di input dan telah dioperasikan oleh method */
        Node current = head;
        while(current != null){
            System.out.println("Barang : " + current.namaBarang + ", Harga : Rp." + current.harga + ", Stok : " + current.stok);
            current = current.next;
        }
        System.out.println(" ");
    }
}
public class JurnalModul3 {
    public static void main(String[] args){
        Modul_3 obj = new Modul_3();
        System.out.println("===============================================");
        System.out.println("                DAFTAR BARANG                  ");
        System.out.println("===============================================");
        /*menginput data di dalam addFirst() */
        obj.addFirst("Mizon", 6000, 30);
        obj.addFirst("Indomie Goreng", 3500, 8);
        obj.addFirst("Pulpy", 3000, 17);
        obj.addFirst("Indomie Soto", 3000, 12);
        obj.addFirst("Kopikap", 1500, 40);
        obj.addFirst("Nabati Coklat", 2000, 34);
        obj.addFirst("Nabati Permen Karet", 2000, 39);
        obj.addFirst("Kuda Mas Original", 1000, 77);
        obj.printAll();

        /*menggunakan method bubbleSort() untuk mengurutkan data berdasarkan nama barang  */
        System.out.println("Urutkan berdasarkan nama  :");
        obj.bubbleSort();
        obj.printAll();
        /*menggunakan method insertion() untuk mengurutkan data berdasarkan harga barang*/
        System.out.println("Urutkan Berdasarkan Harga :");
        obj.insertion();
        obj.printAll();
        /* menggunakan method mergeSort untuk mengurutkan data berdasarkan stok barang*/
        System.out.println("Urutkan Berdasarkan Stok  :");
        obj.mergeSort(obj.head);
        /*mencari letak data nama barang dengan menggunakan method sequentialSearch() */
        obj.sequentialSearch("Indomie Goreng");
        /*mencari letak data nama barang dengan menggunakan method binarySearch() */
        obj.binarySearch("Nabati Coklat");
        obj.sequentialSearch("Pulpy");
        obj.binarySearch("Nabati Keju");
    }
}