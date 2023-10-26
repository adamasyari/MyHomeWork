class Ayah{
    private String nama;
    private Rumah rumah;
    
    public Ayah(String nama, Rumah rumah){
        this.nama = nama;
        this.rumah=rumah;
    }

    public double hitungPbb(){
        return rumah.getPajak();
    } 
}