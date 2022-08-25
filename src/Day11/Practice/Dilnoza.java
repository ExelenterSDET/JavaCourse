package Day11.Practice;

import java.util.Scanner;

public class Dilnoza {

        /*   you may not use the scanner.

             using switch statement
             have below outputs:
             # - HASHTAG
             $ - DOLLAR
             % - PERCENT
             & - AND
             ELSE - WRONG INPUT
             */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Name a char: ");
            String str = scan.nextLine();

            char ch= str.charAt(0);

            String input = "";

            //  char ch = '#';

            switch (ch) {
                case '#':
                    input = "HASHTAG";
                    break;
                case '$':
                    input = "DOLLAR";
                    break;
                case '%':
                    input = "PERCENT";
                    break;
                case '&':
                    input = "AND";
                default:
                    input="wrong input";
            }
            System.out.println(input);
            System.out.println("Test");
        }
    }


