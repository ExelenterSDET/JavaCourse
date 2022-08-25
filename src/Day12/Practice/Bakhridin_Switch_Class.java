package Day12.Practice;

import java.util.Scanner;

public class Bakhridin_Switch_Class {

    public static void main(String[] args) {

        /**
         you may not use the scanner.

         using switch statement
         have below outputs:
         # - HASHTAG
         $ - DOLLAR
         % - PERCENT
         & - AND
         ELSE - WRONG INPUT
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Decimal code: ");
        String ss = scan.nextLine();  //#=35, $=36, %=37, &=38
        String result = "Wrong Input";
        if (ss.length() == 1) {
            char ch = ss.charAt(0);
            switch (ch) {
                case '#':
                    result = "= HASHTAG";
                    break;
                case '$':
                    result = "DOLLAR";
                    break;
                case '%':
                    result = "PERCENT";
                    break;
                case '&':
                    result = "AND";
                    break;
            }
        }
        System.out.println(result);

        System.out.println("Test");


    }
}

