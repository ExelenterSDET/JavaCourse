package Day15.Practice._08_27_2022_Saturdaya_Project_3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        /*Task1
        *Generate two numbers btw 0 and 10.
if both numbers have same remainder when divided by 3, return which ever is smaller.
if both numbers don't have same remainder when divided by 3, return whichever is larger.
if both numbers are equal, return sum of numbers;
        * */

        Random rnd = new Random();
        int n1 = rnd.nextInt(10);
        int n2 = rnd.nextInt(10);
        int result = 0;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        boolean numbersAreEqual = n1 == n2;
        boolean haveSameRemainder = n1%3 == n2%3;

        if (numbersAreEqual){
            result = n1 + n2;
        }else {

            if (haveSameRemainder){
                result = Math.min(n1,n2);
            }else {
                result = Math.max(n1,n2);
            }
        }
        System.out.println("result = " + result);
    }
}
