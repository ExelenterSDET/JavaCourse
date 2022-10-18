package Day50.Practice;

public class Malika {
    /*Task 1.
    Create any Exception scenario with String.
    Handle exception with try catch blocks.*/
    public static void main(String[] args) {


        try {
            String namesOfStudents = "123";
            System.out.println(namesOfStudents.substring(1, 4));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Try again");

        }

    }
}