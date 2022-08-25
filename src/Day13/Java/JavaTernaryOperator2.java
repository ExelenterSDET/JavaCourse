package Day13.Java;

import java.util.Scanner;

public class JavaTernaryOperator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print(" Enter number 1 => ");
        int num1 = scan.nextInt();
        System.out.print(" Enter number 2 => ");
        int num2 = scan.nextInt();
        scan.nextLine();
        System.out.print(" What do you want to do? => ");
        String action = scan.nextLine();

        int result = action.equalsIgnoreCase("plus") ? (num1+num2)
                : action.equalsIgnoreCase("minus") ? num1>num2 ? num1 - num2 : num2-num1
                : action.equalsIgnoreCase("multiply") ? num1 * num2
                : action.equalsIgnoreCase("divide") ? num1>num2 ? num2 == 0 ? -1 : num1 / num2 : num2 / num1
                : -1;

        System.out.println("The result for " + action + " is " + result);





    }
}
