public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(double sisi, String warna){
        super(warna);
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double hitungLuas(){
        double luas = sisi * sisi;
        return luas;
    }
    public void printInfo(){
        System.out.println("\nWarna bujursangkar : " + warna + "\nluas : " + hitungLuas());
    }
}
