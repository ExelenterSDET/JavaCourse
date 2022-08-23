package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        /**Task13
         * Create a string and a number. Convert number to char.
         * if string contains char, return the character itself.
         * if string doesn't contain char, return "Character doesn't exist in the string"
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string=> ");
        String str=scan.nextLine(); //Exelenter
        System.out.print("Enter integer=> ");
        int num=scan.nextInt();  //E=69
        char ch= (char) num;

        if (str.contains(String.valueOf(ch))) {
            System.out.println("Given char character exists in string and it is "+ch);
        }
        if (!str.contains(String.valueOf(ch))) {
            System.out.println("Given char character doesn't exist in string");
        }




    }

}
