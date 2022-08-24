package Day11.Practice;

import java.util.Scanner;

public class Andrea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a letter grade (A-D or F): ");
        String grade = scan.nextLine();

        if (grade.equalsIgnoreCase("A")) {
            System.out.print("What is the average? ");
            int avg = scan.nextInt();
            if (avg >= 90) {
                System.out.println("You're good");
            }
            else {
                System.out.println("Invalid average");
            }
        }
        else if (grade.equalsIgnoreCase("B")) {
            System.out.println("You're good");
        }
        else {
            System.out.println("You need to work hard");
        }

    }

}
