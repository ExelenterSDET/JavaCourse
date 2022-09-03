package Day15.Practice.GroupProjectWeek3;

import java.util.Scanner;

public class Task8 {
    /*
    Task8.
Using scanner, create a number.
If number is palindromic, return true. else, return false.
Note: Palindromic number is the number, that remains the same when its digits are reversed.
Example:
12321 => true
12344321 => true
1236541 => false
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Palindromic number ==> ");

        int numb = scan.nextInt();
        int numb3 = numb;
        int bmun = 0;
        while (numb > 0) {
            bmun = (bmun + (numb % 10)) * 10;
            numb = numb / 10;
          //  System.out.println(numb + " " + bmun + " " + numb);
        }

        System.out.println((bmun / 10) == numb3 ? "Your number is palindromic" : "False");

//        int numb = scan.nextInt();
//        int numb3 = numb;
//        double numb2 = Math.log10(numb);
//        int bmun = 0;
//        while (numb2>=0)
//        {
//            bmun = (bmun +(numb%10))*10;
//            --numb2;
//            numb = numb/10;
//
//        }

      // System.out.println((bmun/10)==numb3?"Your number is palindromic":"False");
    }
}
