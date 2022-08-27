package Day14.Practice;

import java.util.Random;
import java.util.Scanner;

public class Mustafa {
    public static void main(String[] args) {

        Random random = new Random();
        int int1 = random.nextInt((5-2+1)+2);

        System.out.println(int1 ==2?"You won 20$":int1 == 3?"You won 30$":int1 == 4?"You won 40$"
                : int1 == 5?"Jack Pot":"");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 3");
        int num = scanner.nextInt();

        Random random1 = new Random();
        int ran = random.nextInt((3-0+1)+0);
        System.out.println(ran);
        System.out.println(num == ran?"You won the game":"Game Over");
    }
}
