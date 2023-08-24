package Modul_1;
import java.util.LinkedList;

public class TugasModul1 {
    static void print(LinkedList<String> list, String name){
        System.out.println("\n" + name);
        for(int i = 0; i <list.size(); i++){
            System.out.print(list.get(i));
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void main(String args[]){
        LinkedList <String> list = new LinkedList<String>();
        System.out.println("===NOMOR 1===");
        list.add("Alita");
        list.add("Putri");
        list.add("Devian");
        list.add("Melki");
        list.add("Pande");
        list.add("Azzam");
        list.add("Weng");
        list.add("jidan");

        print(list, "Ketika Penampilan FEST");
        
        list.remove("Devian");
        print(list, "Ketika Devian Keluar Barisan");

        list.add(2, "Dadi");
        print(list, "Setelah Dadi Gantikan Devian");

        list.remove("Azzam");
        print(list, "Ketika Azzam Keluar Barisan");

        list.add(5, "Agus");
        print(list, "Setelah Agus Gantikan Azzam");

        LinkedList <String> list2 = new LinkedList<String>();
        list2.add("Jidan");
        list2.add("Weng");
        list2.add("Agus");
        list2.add("Dadi");
        print(list2, "Berteduh");

        LinkedList <String> list3 = new LinkedList<String>();
        list3.add("Pande");
        list3.add("Melki");
        list3.add("Putri");
        list3.add("Alita");
        print(list3, "Stay Nonton");

        list3.addAll(list2);
        print(list3, "Digabung");
    }
    
}
