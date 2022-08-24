package Day12.Practice.Mentoring_08_24_2022;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        /*HomeWork
        * /*
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

        System.out.print("Enter one of these symbols\n # $ % &: ");
        String input = scan.nextLine(); // # - 35 $ - 36 , 37 38

        String result ="";
        char c = input.charAt(0);

        switch (c){
            case 35:
             result = "HASHTAG";
             break;
            case 36:
                result = "DOLLAR";
                break;
            case 37:
                result = "PERCENT";
                break;
            case 39:
                result = "AND";
                break;
            default:
                result = "WRONG INPUT";
        }
        System.out.println("result =>" + result);
    }
}
