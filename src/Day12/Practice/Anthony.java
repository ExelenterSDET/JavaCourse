package Day12.Practice;

import java.util.Scanner;

public class Anthony {

    public static void main(String[] args) {


        /*
        using switch statement have below outputs:
        #- HASHTAG
        $ - DOLLAR
        % - PERCENT
        & - AMPERSAND
        ELSE - WRONG INPUT
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Range 1-4 => ");
        byte b1 = (byte) scan.nextByte();
        String numericalSigns = "";

        b1 += 48;
        char ch = (char) b1;

        switch (ch) {
            case '1':
                numericalSigns = " # - HASHTAG";
                break;
            case '2':
                numericalSigns = "$ - DOLLAR";
                break;
            case '3':
                numericalSigns = " % PERCENT";
                break;
            case '4':
                numericalSigns = " & AND";
                break;
            default:
                numericalSigns = "WRONG INPUT";
        }
        System.out.println("TASK TRY 1 = " +numericalSigns);
        System.out.println("----------------------------------------------------");


        Scanner scan2 = new Scanner(System.in);
        System.out.print("Special character #, $, % , & => ");
        char ch1 = scan2.next().charAt(0);
        String results = "";

        switch (ch1) {
            case 35:
                results = "HASHTAG";
                break;
            case 36:
                results = "DOLLAR";
                break;
            case 37:
                results = "PERCENT";
                break;
            case 38:
                results = "AND";
                break;
            default:
                results = "WRONG INPUT";

        }
        System.out.println("TASK TRY 2 = "+results);
        System.out.println("----------------------------------------------------");

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Special character #, $, % , & => ");
        String str = scan3.nextLine();

        char ch3 = str.charAt(0);
        String output = "";

        switch (ch3) {

            case '#':
                output = "HASHTAG";
                break;
            case '$':
                output = "DOLLAR";
                break;
            case '%':
                output = "PERCENT";
                break;
            case '&':
                output = "AND";
                break;
            default:
                output = "WRONG INPUT";
        }
        System.out.println("TASK TRY 3 = " +output);


    }
}
