public class Silinder extends Lingkaran{
    public double tinggi;

    public Silinder(double tinggi, double radius, String warna){
        super(radius, warna);
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double t){
        this.tinggi = t;
    }
    public double hitungVolume(){
        return (Math.PI * Math.pow((this.getRadius()), 2) * this.getTinggi());
    }
    public void printInfo(){
        System.out.println("\nWarna Silinder : " + warna + "\nluas silinder : " + hitungVolume());
    }
}
