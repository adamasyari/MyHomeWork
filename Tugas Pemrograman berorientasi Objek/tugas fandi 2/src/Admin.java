import java.util.Scanner;
public class Admin {
    String adminUsername;
    String adminPassword;
    Student student;
    
    public void displayStudent() {
        for (String student : userStudent) {
            System.out.println("Nama: " + student.name);
            System.out.println("NIM: " + student.faculty);
            System.out.println("Jurusan: " + student.programStudi + "\n");
        }
    }
    public void addStudent(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nama mahasiswa: ");
        student.name = input.nextLine();
        System.out.println("Masuukan Fakultas mahasiswa");
        student.faculty = input.nextLine();
        System.out.println("Masukkan NIM mahasiswa: ");
        student.nim = input.nextLine();
        System.out.println("Masukkan Jurusan mahasiswa: ");
        student.programStudi = input.nextLine();

        // Membuat objek Student baru
        Student newStudent = new Student();
        newStudent.name = student.name;
        newStudent.faculty = student.faculty;
        newStudent.nim = student.nim;
        newStudent.programStudi = student.programStudi;

        // Menambahkan objek Student baru ke dalam array studentList
        addStudentToList(newStudent);
        System.out.println("Data mahasiswa berhasil ditambahkan.");
        input.close();
    }
    private void addStudentToList(Student newStudent) {
        if (studentList == null) {
            studentList = new Student[1];
            studentList[0] = newStudent;
        } else {
            Student[] newStudentList = new Student[studentList.length + 1];
            for (int i = 0; i < studentList.length; i++) {
                newStudentList[i] = studentList[i];
            }
            newStudentList[studentList.length] = newStudent;
            studentList = newStudentList;
        }
    }
}
