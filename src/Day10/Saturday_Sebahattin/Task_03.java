package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

        /*      Task 3
        Given an int  ,
        if the int is 1 print Monday
        if the int is 2 print Tuesday
        if the int is 3 print Wednesday
        if the int is 4 print Thursday
        if the int is 5 print Friday
        if the int is 6 print Saturday
        if the int is 7 print Sunday
        if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 3 / Which day");
        System.out.print("Enter number = ");
        int i = scan.nextInt();

        if (i == 1){
            System.out.println("Monday");
        }
        if (i == 2) {
            System.out.println("Tuesday");
        }
        if (i == 3) {
            System.out.println("Wednesday");
        }
        if (i == 4) {
            System.out.println("Thursday");
        }
        if (i == 5) {
            System.out.println("Friday");
        }
        if (i == 6) {
            System.out.println("Saturday");
        }
        if (i == 7) {
            System.out.println("Sunday");
        }
        if (i<1 || i>=8) {
            System.out.println("This is not a valid day.");
        }
    }
}
