public class Student {
    String name;
    String faculty;
    String nim;
    String programStudi;
    App app;
    
    public void Logout(){
        System.out.println("System logout...");
        try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        app.menu();
    }
    public void displayBook(){
        
    }
}
