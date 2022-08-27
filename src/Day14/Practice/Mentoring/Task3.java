package Day14.Practice.Mentoring;

import java.util.Random;

public class Task3 {
    /*
    Generate two numbers between 1 and 150 included.
    if both of the numbers are at least 50, return "Good"
    if one of the numbers is at least double the amount of the other one, return "Great".
    if one of the numbers is less than 50, return "Bad"
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(150), num2 =  random.nextInt(150);

        System.out.println("num1 + = " + num1 + "; num2 = " + num2);

        String result = "Bad";

        // solution 1
        if(Math.min(num1, num2) >= 50){
            if(Math.max(num1, num2) >= 2* (Math.min(num1, num2))){
                result = "Great";
            }else{
                result = "Good";
            }
        }

         // solution 2
//        result = (Math.min(num1, num2) >= 50)? Math.max(num1, num2) >= 2* Math.min(num1, num2) ? "Great" : "Good" : result;


        System.out.println("result = " + result);


    }
}
