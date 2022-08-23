package Day11.Java;

import java.util.Scanner;

public class Task1 {

    /*
    Task1:
    Create a string. If the string starts with Java, print "I love java"
    for any other options, print "Wrong input"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your text => ");
        String s = scan.nextLine();
        s = s.toLowerCase();

        if(s.startsWith("java")){
            System.out.println("I love java");
        }else{
            System.out.println("wrong input");
        }

    }
}
