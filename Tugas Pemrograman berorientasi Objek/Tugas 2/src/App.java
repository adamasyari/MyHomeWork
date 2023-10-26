public class App {
    public static void main(String[] args) throws Exception {
        //Rumah Akbar
        Rumah rumahAkbar = new Rumah();
        Ayah akbar = new Ayah("Akbar", rumahAkbar);
        double pajakAkbar = akbar.hitungPbb(36, 100000);
        System.out.println("Pajak yang harus dibayar oleh " + akbar.getNama() +  " adalah " + pajakAkbar);

        //Rumah Bambang
        Rumah rumahBambang = new Rumah();
        Ayah bambang = new Ayah("Bambang", rumahBambang);
        double pajakBambang = bambang.hitungPbb(45, 200000);
        System.out.println("Pajak yang harus dibayar oleh " + bambang.getNama() + " adalah " + pajakBambang);
        
        //Rumah Charlie 
        Rumah rumahCharlie = new Rumah();
        Ayah charlie = new Ayah("Charlie", rumahCharlie);
        double pajakCharlie = charlie.hitungPbb(90, 300000);
        System.out.println("Pajak yang harus dibayar oleh " + charlie.getNama() + " adalah " + pajakCharlie);
    }
}
