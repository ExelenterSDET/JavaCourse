package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task9 {

    /*
    Given a String and a number.
    Get the character at the given index with the String.
     If number is greater then the length of the String, return 0
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string==>");
        String str = scan.nextLine();

        System.out.print("enter int==>");
        int iNum = scan.nextInt();


        if (str.length()>=iNum){
            System.out.println(str.charAt(iNum));
        }
      if (str.length()<iNum){
          System.out.println("o");
        }

    }
}
