package Day20.Practice.Tohir;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        //Task5:
        //        Create a char array
        //        The array has a random length between 2 and 22 (inclusive)
        //        The array should only have random capital letters.
        //        Print the array.
        int length = ran.nextInt(2,23);

        String[] strArr = new String[length];
        for (int i = 0; i < strArr.length; i++) {
            char c = (char) ran.nextInt(65,91);
            strArr[i] = String.valueOf(c);
        }
        System.out.println("strArr = " + Arrays.toString(strArr));

    }

}
