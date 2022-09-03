package Day15.Practice._08_27_2022_Saturdaya_Project_3;

import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

                /*Task5.
Using Scanner, provide two random numbers (max 100) and one of following operators (+, -, *, /, %, .)
if operator = +, return total of numbers.
if operator = -, return absolute difference of numbers.
if operator = *, multiply numbers
if operator = /, divide numbers
if operator = %, return remainder of number
if operator = ., return decimal numbers (example: number1=10, number2=20, return = 10.20
if any = return -1.
*/

        Random rnd = new Random();
        int n1 = rnd.nextInt(100);
        int n2 = rnd.nextInt(100);
        double result = 0;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter one of following operators (+, -, *, /, %, .): ");
        String operator = scan.nextLine();

        switch (operator){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = Math.abs(n1-n2);
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = (double) n1 / n2;
                break;
            case "%":
                result = n1 % n2;
                break;
            case ".":
                result = Double.parseDouble(n1 +operator + n2);
                break;
            default:
                result = -1;
        }

        System.out.println("result = " + result);
    }
}
