public class App {
    public static void main(String[] args) throws Exception {
        BujurSangkar bs = new BujurSangkar(7, "biru");
        bs.printInfo();

        Bentuk btk = new Bentuk("biru");
        btk.printInfo();

        Lingkaran lkn = new Lingkaran(5.0, "biru");
        lkn.printInfo();

        Silinder slr = new Silinder(7, 7, "biru");
        slr.printInfo();
    }
}
