package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {

/*      Task 6
        Given a String (grade)
        if grade is "A" then ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"
        if grade is "B" print "You're good"
        else (meaning if not "A" or "B") print "You need to work hard"
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 6 / Grade");
        System.out.print("Enter grade = ");
        char grade = scan.next().charAt(0);
        char A = 'A';
        char B = 'B';

        if (grade == A){
            System.out.print("enter average = ");
            int average = scan.nextInt();

            if (average > 90 ){
                System.out.println("Congrats");
            }
            else{
                System.out.println("Invalid average");
            }
        }
        if (grade == B){
            System.out.println("You're good");
        }
        if (grade != A && grade != B ){
            System.out.println("You need to work hard");
        }
    }
}
