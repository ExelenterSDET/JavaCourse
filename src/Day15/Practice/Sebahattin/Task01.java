package Day15.Practice.Sebahattin;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        /*      Generate two numbers btw 0 and 10.
        if both numbers have same remainder when divided by 3, return which ever is smaller.
        if both numbers dont have same remainder when divided by 3, return whichever is larger.
        if both numbers are equal, return sum of numbers;
*/
        //Task1
        Random num = new Random();
        int num1 = num.nextInt(10);
        System.out.println("First number ==> "+num1);
        int num2 = num.nextInt(10);
        System.out.println("Second number ==> "+num2);

        if (num1 == num2){
            int output = num1+num2;
            System.out.println("Numbers are equal. Sum of numbers = "+output);
        }
        else {
            String outout2 = (num1 % 3) == (num2 % 3) ? num1 < num2 ? "The remainder of the two numbers are the same. small number = "+num1
                    : "The remainder of the two numbers are the same. small number = "+num2
                    : (num1 % 3) != (num2 % 3) ? num1 > num2 ? "The remainder of the two numbers are not the same. Large number = "+num1
                    : "The remainder of the two numbers are not the same. Large number = "+num2
                    :"";

            System.out.println(outout2);
        }
    }
}
