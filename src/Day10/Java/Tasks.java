package Day10.Java;

import java.util.Scanner;

public class Tasks {
    /*
    Create a scanner
    enter two strings
    if the length of the strings are equal, print "The lengths are equal"
    if the length of the string are not equal, print "The lengths are not equal"
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string 1 ");
        String s = scan.nextLine();
        System.out.print("Enter string 2 ");
        String s1 = scan.nextLine();
        if(s.length()== s1.length()){
            System.out.println("The lengths are equal");
        }
        if(s.length() != s1.length()){
            System.out.println("The lengths are not equal");
        }
    }
}
