package Day14.Practice.Mentoring;

import java.util.Random;

public class Task4 {
    /*
    Task4:

    Generate two numbers btw 0 and 3 and get the total. Generate third number btw 2 and 6.
    if total of two numbers equals to third number, return SUCCESS, else, return TRY AGAIN LATER

     */
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(3), num2 = random.nextInt(3), num3 = random.nextInt(4)+2;
        System.out.println("num1 = " + num1 + "\nnum2 = " + num2 + "\nnum3 = " + num3);

        // solution 1
        //String result = num1+num2 == num3 ? "SUCCESS" : "TRY AGAIN LATER";
        //System.out.println("result = " + result);

        String result = "TRY AGAIN LATER";
        if(num1+num2 == num3){ result = "SUCCESS";}
        System.out.println("result = " + result);
    }
}
