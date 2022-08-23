package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_05 {

    public static void main(String[] args) {
        /**Task5
         *  Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
         *         i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987"
         *         remove all the non-numeric characters.
         *         parse the Strings to int
         *         and print the total
         *         Example:
         *         String num1 = "$15";
         *         String num2 = "$20";
         *         String num3 = "$30";
         *         output should be ==> 65;
         *         NOTE : if the output is less than 0 change the output to -1
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string==> ");
        String str = scan.nextLine();
        String str1 = str.replaceAll("[^0-9]", "");
        System.out.println("str1 = " + str1);
        int num1 = Integer.parseInt(str1.substring(0, 2));
        System.out.println("num1 = " + num1);
        int num2 = Integer.parseInt(str1.substring(2, 4));
        System.out.println("num2 = " + num2);
        int num3 = Integer.parseInt(str1.substring(4));
        System.out.println("num3 = " + num3);
        int num4=num1+num2+num3;
        System.out.println("Total of given numbers are = " + num4);

        if (num4==65) {
            System.out.println("Given number is true");
        }



    }
}
