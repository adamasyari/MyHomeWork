package Modul_2;
public class Jurnal {
    static int priority(char operator) {
        /*method priority berfungsi untuk menentukan kondisi char operator  */
        if (operator == '+' || operator == '-') {
            return 1;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        if (operator == '^') {
            return 3;
        }
        return -1;
    }
    static void toPrefix(String operasi) {
        /*method toPrefix berfungsi untuk mengoperasikan nilai prefix */
        String tmp = "";
        Stack temp = new Stack();
        /*membuat kondisi ketika temp masih belum terisi */
        for (Character now : operasi.toCharArray()) {
            if (now == '+' || now == '-' || now == '/' || now == '*') {
                /*scrip if() berfungsi unutk menentukan kondisi apakah kondisi tersebut terpenuhi atau idak */
                String opand1 = temp.pop();
                String opand2 = temp.pop();
                tmp = "";
                tmp += now;
                tmp += opand2;
                tmp += opand1;
                temp.push(tmp);
                /*jika kondisi if terpenuhi, maka akan mengeksekusi nilai tersebut */
            } 
            else {
                /*jika nilai if tersebut tidak memenuhi maka akan beralih ke kondisi else */
                tmp = "";
                tmp += now;
                temp.push(tmp);
            }
        }
        System.out.println("Notasi Prefix : " + temp.top.elemen);
    }
    public static void main(String[] args) {
        Stack operator = new Stack();
        Stack operand = new Stack();
        
        String operasi = "(A+B)*C-(D-E)*(F+G)";
        String hasil = "";
        String tmp = "";

        for (int i = 0; i < operasi.length(); i++) {
            /*scrip for() merupakan bentuk penulisan serta menentukan nilai awal serta nilai akhir perulangan */
            char ok = operasi.charAt(i);
            if (ok == ('+') || ok == ('*') || ok == ('-') || ok == ('/')) {
                /*scrip berfungsi untuk menentukan kondisi apakah kondisi tersebut terpenuhi atau tidak. Jika kondisi tersebut terpenuhi maka akan beralih ke kondisi while */
                while (operator.top != null && priority(operator.gettop().charAt(0)) >= priority(ok)) {
                    hasil += operator.pop();
                }
                tmp = "";
                tmp += ok;
                operator.push(tmp);
            }
            else if (ok == '(') {
                /*jika kondisi if tidak terpenuhi maka akan beralih ke kondisi else if dan mengeksekusi objek tersebut di dalam kondisi else if*/
                tmp = "";
                tmp += ok;
                operator.push(tmp);
            } 
            else if (ok == ')') {
                while (operator.gettop().charAt(0) != '(') {
                    hasil += operator.pop();
                }
                operator.pop();
            } 
            else {
                /*jika kondisi else if tidak terpenuhi maka akan beralih ke kondisi else dan akan mengeksekusi objek tersebut di dalam kondisi else*/
                hasil += ok;
            }
        }
        while (operator.top != null) {
            /*scrip while berfungsi untuk menentukan kondisi apakah kondisi tersebut terpenuhi atau tidak, Jika kondisi tersebut terpenuhi, maka akan mengeksekusi objek tersebut*/
            hasil = hasil + operator.pop();
        }
        /*menampilkan objek yang telah di proses di dalam method */
        System.out.println("====Convert Infix to Prefix and PostFix====");
        System.out.println ("----------------------------------------------------");
        System.out.println ("Notasi infix : (A+B)*C-(D-E)*(F+G)");
        System.out.println ("----------------------------------------------------");
        System.out.println("Notasi Postfix : " + hasil);
        toPrefix(hasil);
        System.out.println ("----------------------------------------------------");
    }
}