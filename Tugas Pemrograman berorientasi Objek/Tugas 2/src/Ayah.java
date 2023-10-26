public class Ayah {
    private String nama;
    private Rumah rumah;
    
    public Ayah(String nama, Rumah rumah){
        this.nama = nama;
        this.rumah = rumah;
    }
    public Rumah getRumah(){
        return rumah;
    }
    public String getNama(){
        return nama;
    }
    
    public double hitungPbb(int tipeRumah, double harga){
        double pajak = 0.0;
        if(tipeRumah == 36){
            pajak = harga * 0.04; 
        }
        else if(tipeRumah == 45){
            pajak = harga * 0.06;
        }
        else if(tipeRumah > 45){
            pajak = harga * 0.09;
        }
        else{
            System.out.println("Tipe rumah tidak ditemukan !!!");
        }
        return pajak;
    } 
}
