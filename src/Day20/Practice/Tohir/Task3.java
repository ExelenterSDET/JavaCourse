package Day20.Practice.Tohir;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        int arrOuter[] = new int[4];
        int arrInner[] = new int[2];
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrOuter.length; i++) {
            arrOuter[i] = ran.nextInt(0,10);
        }
        for (int i = 0; i < arrInner.length; i++) {
            arrInner[i] = ran.nextInt(0,10);
        }
        System.out.println("arrInner = " + Arrays.toString(arrInner));
        System.out.println("arrOuter = " + Arrays.toString(arrOuter));
        System.out.println((arrOuter[0]==arrInner[0])||(arrOuter[arrOuter.length-1]==arrInner[arrInner.length-1])?"true":"false");
    }
}
