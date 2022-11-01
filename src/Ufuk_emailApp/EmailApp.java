package emailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1=new Email("Ufuk","Sarac");

//        em1.setAlternateEmail("saracufuk77@gmail.com");
//        System.out.println("alternative email = " + em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
}
