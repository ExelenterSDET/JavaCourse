package Day15.Practice.GroupProjectWeek3;

import java.util.Random;

public class Task3 {
/*
Task3.
Using scanner class, create a random number up to 100.
return count of numbers divisible by 8

 */
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(100);

        System.out.println("Num1 = " +num1);


        String result =num1%8==0 ? "SUCCESS" : "TRY AGAIN LATER";
        System.out.println("result = " + result);
    }
}
