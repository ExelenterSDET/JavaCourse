package UdemySebahattin.EmailApp;

public class EmailApp {
    public static void main(String[] args) {

        Email email = new Email("Sebahattin", "Beycur");

        email.setAlternateEmail("beycur@gmail.com");
        System.out.println(email.getAlternateEmail());
        System.out.println(email.print());
        System.out.println("=========================================");
        System.out.println(email.toString());

    }
}
