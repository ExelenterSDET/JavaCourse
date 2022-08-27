package Day14.Practice.Mentoring;

import java.util.Random;

public class Task2 {
    /*

    Task2:
    Generate number between 0 and 100, check if number is odd or even and return output.

     */

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);

        System.out.println("number = " + number);
        // solution 1

        String result = "Odd";
        if(number%2 == 0){
            result = "Even";
        }
        System.out.println("result = " + result);


        // solution 2
        //System.out.println(number%2 == 0 ? "Even" : "Odd");

    }
}
