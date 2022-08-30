package Day15.Practice.GroupProjectWeek3;

import java.util.Random;

public class Task9 {
    /*
    Task9.
Generate 5 numbers from 0 to 10. Using math class methods, return the greatest.
     */
    public static void main(String[] args) {
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

            int numsChecked = 0;
            int greatest = Math.max(num1, num2);

            greatest = Math.max(greatest, num3);
            greatest = Math.max(greatest, num4);
            greatest = Math.max(greatest, num5);

            System.out.println("greatest = " + greatest);
    }
}
