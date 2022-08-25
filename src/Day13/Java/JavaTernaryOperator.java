package Day13.Java;

import java.util.Scanner;

public class JavaTernaryOperator {
    /*
    Ternary operator ? :
    Elvis Operator
    It is a shorthand way to check the condition. If the
    condition is true, the result of ? is returned. But, if the
    condition is false, the result of : is returned.
     */

    public static void main(String[] args) {

//        CONDITION ? OUTPUT IF TRUE : OUTPUT IF FALSE;

        int num1 = 5;
        int num2 = 10;

        System.out.println(num1>num2 ? "num1 is bigger then num2" : "num2 is bigger then num1");

        // Task2 Print the longest string
        String str1 = "Hello1";
        String str2 = "World";

        String result = str1.length()>str2.length() ? str1 : str2;
        System.out.println(result);

        // Task3  validate if your string contains " "
        // if true print you have multiple words, if false -> you have single word

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your string => ");
        String input = scan.nextLine();

        String output = "";
        output = input.contains(" ")
                ? " you have multiple words "
                : " you have single word";

        System.out.println(output);

        System.out.println(" Enter number 1 => ");
        System.out.println(" Enter number 2 => ");













    }
}
