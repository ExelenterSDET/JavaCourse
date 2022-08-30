package Day15.Practice.GroupProjectWeek3;

import java.util.Scanner;

public class Task6 {
    /*
Task6.
Using scanner create a string.
Return reverse of a string.

Example: str = Java, result should be = avaJ
     */
    public static void main(String[] args) {
        System.out.print("Enter string to be reversed: ");
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        String s2 = "";

        int iter = s1.length()-1;
        while (iter>=0){
            s2 = s2 + s1.charAt(iter);
          //  System.out.println("s2 = " + s2);
            --iter;
        }
        System.out.println("s2 = " + s2);
    }
}
