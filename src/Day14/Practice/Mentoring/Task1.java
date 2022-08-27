package Day14.Practice.Mentoring;

import java.util.Random;

public class Task1 {
    /*
    Task1:
    Generate two int numbers from 0 to 10. return true if either one is 6, or if their sum or difference is 6.
     */
    public static void main(String[] args) {

        Random random = new Random();

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        boolean result = (num1 == 6 || num2 == 6 || num1+num2 == 6 || Math.abs(num1 - num2) == 6);
        System.out.println(result);


    }
}
