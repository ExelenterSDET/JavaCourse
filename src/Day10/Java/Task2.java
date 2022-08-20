package Day10.Java;

import java.util.Scanner;

public class Task2 {

    /*
    use scanner
    enter 1 string
    enter 1 int

    if int is within string length, then substring from beginning to the number provided
    if int is not within the string length, then substring last 3 characters.

    Example1: World, 3 ===> output should be Worl
    Example2: World, 6 ===> output should be rld
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string => ");
        String s = scan.nextLine();
        System.out.print("Enter the number => ");
        int i = scan.nextInt();

        if(i>s.length()){
            String substring = s.substring(s.length() - 3);
            System.out.println("substring = " + substring);
        }
        if(i<0){
            String substring = s.substring(s.length() - 3);
            System.out.println("substring = " + substring);
        }
        if(i<=s.length()) {
            String substring = s.substring(0, i);
            System.out.println("substring = " + substring);
        }

    }
}
