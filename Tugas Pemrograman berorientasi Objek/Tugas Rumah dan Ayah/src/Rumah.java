class Rumah{
    private double pajak;
    private double harga;
    private int tipeRumah;

    public setPajak(double pajak){
        return this.pajak = pajak;
    }
    public setHarga(double harga){
        return this.harga = harga;
    }
    public setTipeRumah(int tipeRumah){
        return this.tipeRumah = tipeRumah;
    }

    public rumah(int tipeRumah, double harga, double pajak){
        return this.tipeRumah = tipeRumah;
        return this.pajak = pajak;
    }
    public double getPajak(){
        if(tipeRumah >= 36){
            this.pajak = (harga * 4 / 100); 
        }
        else if(tipeRumah == 45){
            this.pajak = (harga * 6 / 100);
        }
        else if(tipeRumah > 45){
            this.pajak = (harga * 9 / 100);
        }
        else{
            System.out.println("Tipe rumah tidak ditemukan !!!");
        }
    }
}