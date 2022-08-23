package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
                /*Task7
        * Given a String ,
            if the number of the characters in the given String is odd then print true else print false
        * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any text: ");
        String str = scan.nextLine();

        if (str.length()%2 == 0){
            System.out.println(true);
        }

        if (str.length()%2 != 0){
            System.out.println(false);
        }
    }
}
