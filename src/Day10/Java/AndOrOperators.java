package Day10.Java;

import java.util.Scanner;

public class AndOrOperators {

    public static void main(String[] args) {

        // And or Or operators helps to use for multiple conditions in if statements

        // And is represented by &&
        // When we use And conditional operator, all of the conditions must be true

        // Or is represented by ||
        // when we use Or conditional operator, one of the condition should be true

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string => ");
        String s = scan.nextLine();
        System.out.print("Enter the number => ");
        int i = scan.nextInt();

        if(i>s.length() || i<=0){
            String substring = s.substring(s.length() - 3);
            System.out.println("substring = " + substring);
        }

        if(i<=s.length() && i>0) {
            String substring = s.substring(0, i);
            System.out.println("substring = " + substring);
        }


    }
}
