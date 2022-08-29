package Day15.Practice.Sebahattin;

import java.util.Random;

public class Task09 {
    public static void main(String[] args) {
/*     Generate 5 numbers from 0 to 10. Using math class methods, return the greatest.
*/
        //Task9
        Random random = new Random();
        int num1 = random.nextInt(11);
        System.out.println("num1 = " + num1);
        int num2 = random.nextInt(11);
        System.out.println("num2 = " + num2);
        int num3 = random.nextInt(11);
        System.out.println("num3 = " + num3);
        int num4 = random.nextInt(11);
        System.out.println("num4 = " + num4);
        int num5 = random.nextInt(11);
        System.out.println("num5 = " + num5);

        int test = Math.max(num1, num2);
        test = Math.max(test, num3);
        test = Math.max(test, num4);
        test = Math.max(test, num5);

        System.out.println("Max number = " + test);
    }
}
