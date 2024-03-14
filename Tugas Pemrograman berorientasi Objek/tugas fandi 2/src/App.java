import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.menu();
    }

    String[] bookList;
    Admin admin = new Admin();
    Student student;
    Scanner input = new Scanner(System.in);

    public void menu(){
        System.out.println("==== Library System =====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        
        System.err.print("Choose option (1-3): ");
        Scanner inputMenu = new Scanner(System.in);
        String option = inputMenu.nextLine();

        switch (option) {
            case "1":
                System.out.print("Enter your NIM (inputMenu 99 untuk back): ");
                String nim = inputMenu.nextLine();
                if(nim.equals(student.getNim())){
                    menuStudent();
                } else if(nim.equals("99")){
                    menu();
                } else {
                    System.out.println("NIM yang anda masukkan salah !!!");
                }
                break;
            case "2":
                System.out.print("Enter your username (admin) : ");
                admin.adminUsername = inputMenu.nextLine();
                System.out.print("Enter your password (admin) : ");
                admin.adminPassword = inputMenu.nextLine();
                if(admin.adminUsername.equals("admin") && admin.adminPassword.equals("admin")) {
                    menuAdmin();
                } else {
                    System.out.println("Invalid username or password");
                }
                break;
            case "3":
                
                break;
            default:
                System.out.println("Invalid option, please choose again.");
                break;
        }
        inputMenu.close();
    }
    public void menuAdmin(){
        System.out.println("==== Admin Menu =====");
        System.out.println("1. Add Student");
        System.out.println("2. Display Registered Student");
        System.out.println("3. Logout");

        System.out.print("Choose option (1-3): ");
        String option = input.nextLine();

        switch (option) {
            case "1":
                admin.addStudent();
                break;
            case "2":
                admin.displayStudent();
                break;
            case "3":
                student.Logout();
                break;
            default:
                System.out.println("Invalid option, please choose again.");
                break;
        }
        input.close();
    }
    public void menuStudent(){
        System.out.println("==== Student Menu =====");
        System.out.println("1. Buku terpinjam");
        System.out.println("2, Pinjam buku");
        System.out.println("3. Logout");

        System.out.print("Choose option (1-3): ");
        String option = input.nextLine();

        switch (option) {
            case "1":
                
                break;
            case "2":

                break;
            case "3":
                student.Logout();
                break;
            default:
                System.out.println("Invalid option, please choose again."); 
                break;
        }
        input.close();
    }
}
// public void inputNim(){
//     System.out.println("Input Id buku yang ingin dipinjam (input 99 untuk back)");
//     System.out.print("Input : ");
//     Scanner inputNim = new Scanner(System.in);
//     String nim = inputNim.nextLine();
//     inputNim.close();
//     checkNim(nim);
// }
// public Object checkNim(String nim){
//     if(nim.equals("99")){
//         return null;
//     } else {
//         return nim;
//     }
// }
