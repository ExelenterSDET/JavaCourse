package Day15.Practice.Sebahattin;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        /*        Create random number between 1000 and 2000.
        Using loop, count total of each number.
        Example: randomNumber = 6457; result = 6+4+5+7
*/
        //Task4
        Random random = new Random();
        int num = random.nextInt(1000, 2000);
        System.out.println("Random Number= " + num);
        int total = 0;
        int div = 10;
        int rem = num%div;
        int count =0;
        do{
            System.out.println("rem = " + rem);
            num /= div;
            total+=rem;
            rem = num%div;
            count++;
        }
        while(count<4);
        System.out.println("Sum of digits = "+total);
    }
}
