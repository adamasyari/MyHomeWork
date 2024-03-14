import java.util.Scanner;
public class Admin {
    String adminUsername;
    String adminPassword;
    Student student;
    Student[] userStudent;
    
    public void displayStudent() {
        App app = new App();
        StringBuilder result = new StringBuilder();
        for (Student student : userStudent) { 
            result.append("\nNama: ").append(student.getName())
            .append("\nNIM: ").append(student.getNim())
            .append("\nFakultas: ").append(student.getFaculty())
            .append("\nJurusan: ").append(student.getProgramStudi())
            .append("\n");
        }
        app.menuAdmin();
        System.out.println(result.toString());
    }
    public void addStudent() {
        App app = new App();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama mahasiswa: ");
        String name = input.nextLine();
        System.out.print("Masukkan Fakultas mahasiswa: ");
        String faculty = input.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jurusan mahasiswa: ");
        String programStudi = input.nextLine();

        // Membuat objek Student baru
        Student newStudent = new Student(name, faculty, nim, programStudi);

        // Menambahkan objek Student baru ke dalam array userStudent
        addStudentToList(newStudent);
        System.out.println("Data mahasiswa berhasil ditambahkan.");
        app.menuAdmin();
        input.close();
    }
    private void addStudentToList(Student newStudent) {
        if (userStudent == null) {
            userStudent = new Student[1];
            userStudent[0] = newStudent;
        } else {
            Student[] newuserStudent = new Student[userStudent.length + 1];
            System.arraycopy(userStudent, 0, newuserStudent, 0, userStudent.length);
            newuserStudent[userStudent.length] = newStudent;
            userStudent = newuserStudent;
        }
    }
}
