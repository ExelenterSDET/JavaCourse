package Day20.Practice.Tohir;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Task7 {   public static void main(String[] args) {
    Random ran = new Random();
    Scanner scan = new Scanner(System.in);

    int length = ran.nextInt(5,15);
    int numArr [] = new int[length];
    for (int i = 0; i < numArr.length; i++) {
        numArr[i] = ran.nextInt(0,4);
    }
    System.out.println("numArr = " + Arrays.toString(numArr));
    System.out.println(numArr[0]==numArr[numArr.length-1]?"TRUE":"FALSE");
}
}
