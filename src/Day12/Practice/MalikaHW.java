package Day12.Practice;

import java.util.Scanner;

public class MalikaHW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*you may not use the scanner.
     using switch statement
     have below outputs:
     # - HASHTAG
     $ - DOLLAR
     % - PERCENT
     & - AND
     ELSE - WRONG INPUT*/

        System.out.print("Enter symbols #,$,%,&: ");
        String symbol = scan.nextLine();

        String output = "";
        char charAt = symbol.charAt(0);

        switch (charAt){
            case 35:
                output = "HASHTAG";
                break;
            case 36:
                output = "DOLLAR";
                break;
            case 37:
                output = "PERCENT";
                break;
            case 38:
                output = "AND";
                break;
            default:
                output = "WRONG INPUT";
        }
        System.out.println("output => " + output);


    }
}
