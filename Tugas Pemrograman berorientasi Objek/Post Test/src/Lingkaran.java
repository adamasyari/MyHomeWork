public class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius, String warna){
        super(warna);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double hitungLuas(){
        double PHI = 3.14;
        double luas = 0.25 * PHI * (radius * radius);
        return luas;
    }
    public void printInfo(){
        System.out.println("\nWarna lingkaran : " + warna + "\nluas : " + hitungLuas());
    }
}
