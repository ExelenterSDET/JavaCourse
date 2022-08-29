package Day15.Practice.Sebahattin;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
/*        Using scanner create a string.
          Return reverse of a string.
          Example: str = Java, result should be = avaJ
*/
        //Task6
        System.out.print("Enter string to be reversed: ");
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        String s2 = "";

        int iter = s1.length()-1;
        while (iter>=0){
            s2 = s2 + s1.charAt(iter);
            --iter;
        }
        System.out.println(s2);
    }
}
