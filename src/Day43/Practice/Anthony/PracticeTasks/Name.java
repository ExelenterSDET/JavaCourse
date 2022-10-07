package Day43.Practice.Anthony.PracticeTasks;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter First name (Please capitalize first Letter): ");

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter Middle name (Please capitalize first Letter):");

        Scanner obj3 = new Scanner(System.in);
        System.out.println("Enter Last name (Please capitalize first Letter): ");

        String firstName = obj1.nextLine();
        System.out.println("First Name is: "+firstName);

        String  middleName = obj2.nextLine();
        System.out.println("Middle Name is: "+middleName);

        String  lastName = obj2.nextLine();
        System.out.println("Last Name is: "+ lastName);

        System.out.println("Name of Person = " +firstName+ " " +middleName + " "+lastName);

    }
}
