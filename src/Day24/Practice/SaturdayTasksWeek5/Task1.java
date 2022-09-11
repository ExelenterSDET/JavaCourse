package Day24.Practice.SaturdayTasksWeek5;

import java.util.Scanner;

public class Task1 {

//      1. Create a method named as reversedData. The method accepts a non-null or non-empty String as a parameter. Return a reverse of the String.
//      2. Create a method named as isPalindrome. The method returns boolean and checks if the given String as parameter is Palindrome or not.
//      3. Create a method named as reversedData. The method accepts an int as a parameter. Return a reverse of the int.
//      4. Create a method named as reversedData. The method returns boolean and checks if the given int as parameter is Palindrome or not.
//          notes:
//          1.Palindrome means a word or number reads the same backward as forward like "mom" ,     "refer" ,     "131" , "1221", 37573, 200002.
//          2. Use method overloading.
//          3. Reuse created methods.

    public static void main(String[] args) {

        Task1 t1 = new Task1();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string to be reversed: ");
        String str = scan.nextLine();
        System.out.println(t1.reversedData(str));

        System.out.print("Enter a string to check if it is a palindrome: ");
        String str2 = scan.nextLine();
        System.out.println("This is a palindrome: " + t1.isPalindrome(str2));

        System.out.print("Enter an integer to be reversed: ");
        int num = scan.nextInt();
        System.out.println(t1.reversedData(num));

        System.out.print("Enter an integer to check if it is a palindrome: ");
        int num2 = scan.nextInt();
        System.out.println("This is a palindrome: " + t1.isPalindrome(num2));
    }
    public static String reversedData(String input) {
        String output = "";
        char ch = 0;
        for (int i = input.length()-1; i >= 0; i--) {
            ch = input.charAt(i);
            output = output + input.charAt(i);
        }
        return output;
    }
    public static boolean isPalindrome(String input) {
        boolean result = reversedData(input).equalsIgnoreCase(input);
        return result;
    }
    public static int reversedData(int input) {
        int output = 0;
        while(input != 0)
        {
            int remainder = input % 10;
            output = output * 10 + remainder;
            input = input/10;
        }
        return output;
    }
    public static boolean isPalindrome(int input) {
        boolean result = reversedData(input) == input;
        return result;
    }
}
