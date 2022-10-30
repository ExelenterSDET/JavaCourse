package Day58.Practice.Dilnoza.SaturdayProject;

public class EmailApp {
    public static void main(String[] args) {
        Email eml = new Email("John", "Smith");
        eml.changePassword("ADVCNMI254$$%#");
        String password = eml.getPassword();
        System.out.println("password = " + password);
        eml.setAlternativeEmail("abcd@gmail.com");
        System.out.println(eml.getAlternativeEmail());
        eml.setMailboxCapacity(4000);

    }


}
