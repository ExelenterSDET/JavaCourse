package Day15.Practice;

import java.util.Scanner;

public class Said {
    public static void main(String[] args) {
        System.out.println("-- FOR LOOP ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World " + i);
        }

        System.out.println("-- WHILE LOOP ---");
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello World " + i);
            i++;
        }

        //Todo: both codes return same result, which bears the question when to use which?
        /**
         * FOR LOOP is better when we know exactly how many times we want to iterate/loop.
         * WHILE LOOP is good when we don't know exact number of iteration, but rather depend on the given condition.
         * For example, keep looping until you find an employee with the name "Mike" from the list in Database.
         */

        //Todo: First run as-is, then remove ! mark to see real difference between while and do while.
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) { // remove ! mark in front of input to see real difference ==> while (input.equals("quit"))
            System.out.println("I will keep asking from inside WHILE until you enter \"quit\": ");
            input = scanner.next().toLowerCase();
        }

        /**
         * In contrast to WHILE, with DO WHILE we check condition at the end.
         * Do While always gets executed at least once.
         * It is best used when at least one iteration is required. RARELY USED.
          */
        do {
            System.out.println("I will keep asking from inside DO WHILE until you enter \"quit\": ");
            input = scanner.next().toLowerCase();
        } while (!input.equals("quit")); // remove ! mark in front of input to see real difference ==> while (input.equals("quit"))

    }
}
