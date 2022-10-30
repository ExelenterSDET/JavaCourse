package Day58.Practice.Dilnoza.SaturdayProject;

public class EmailApp {
    public static void main(String[] args) {
        Email eml = new Email("John", "Smith");
        eml.changePassword("ADVCNMI254$$%#");

        eml.setAlternativeEmail("abcd@gmail.com");

        eml.setMailboxCapacity(4000);

    }


}
