package Day20.Practice.Tohir;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Task4
{
    public static void main(String[] args) {

        //Task4:
        //        1. Create one int array with length of 10.
        //        2. Using Random class, generate random numbers between 0 and 20
        //        and fill all indexes of an array.
        //        3. Print the difference between the largest and smallest values in the array. (largest - smallest = difference)
        //        [10, 3, 5, 6, 8, 7, 5, 6, 8, 7] → 7 (observe 10-3 = 7)

        int arrOuter[] = new int[10];
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrOuter.length; i++) {
            arrOuter[i] = ran.nextInt(0,20);
        }
        System.out.println("arrOuter = " + Arrays.toString(arrOuter));
        int min = 20;
        int max = 0;
        for (int i = 0; i < arrOuter.length; i++) {
            if (arrOuter[i]<min){
                min = arrOuter[i];
            }
            if (arrOuter[i]>max) {
                max = arrOuter[i];
            }
        }
        System.out.println("min is "+min+" max is "+max+" and max-min = " + (max-min));

    }
}
