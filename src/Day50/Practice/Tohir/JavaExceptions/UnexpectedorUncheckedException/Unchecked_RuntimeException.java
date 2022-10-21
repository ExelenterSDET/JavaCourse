package Day50.JavaExceptions.UnexpectedorUncheckedException;

import java.util.Scanner;

public class Unchecked_RuntimeException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb1 = 0;
        boolean isnotcorrect = true;
        System.out.println("Please enter number 1: ");

        while (isnotcorrect) {

            try {
                numb1 = Integer.parseInt(scan.nextLine());
                isnotcorrect = false;
            } catch (RuntimeException e) {//or Exception is parent for all exceptions: checked and unchecked, RuntimeException is parant for all unchecked errors
                System.out.println("Wrong number formar, enter only numeric values: ");
            }
        }

        System.out.println("Please enter number 2: ");

        int numb2 = Integer.parseInt(scan.nextLine());

        System.out.println("Total is: "+(numb1+numb2));
    }
}
