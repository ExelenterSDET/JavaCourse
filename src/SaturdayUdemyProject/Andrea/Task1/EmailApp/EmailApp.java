package SaturdayUdemyProject.Andrea.Task1.EmailApp;

public class EmailApp {
    public static void main(String[] args) {

        Email e1 = new Email("Andrea", "Mikulin");
        e1.setEmailCapacity(1000);
        e1.setNewPassword("Shadow");
        e1.setAltEmail("andreamikulin@gmail.com");
        System.out.println(e1.showInfo());

    }
}
