package Day14.Practice;

import java.util.Random;
import java.util.Scanner;

public class MalikaHw {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        //TASK:
        // Let user provide a number between 0 and 3 not included
        // and generate a random number between 0 and 3 not included
        // and check if provided number is equal to generated number
        // if they are equal print out "You Won the Game!!!"
        // else "Game Over!!!"

        System.out.print("Enter number btw 0-3->not included: ");
        int num1 = scan.nextInt();
        int max = 3;
        int min = 0;
        int rnd = random.nextInt(max - min) + min;
        System.out.println("rnd = " + rnd);


        if (num1 == rnd) {
            System.out.println("You Won the Game!!!");
        }else {
            System.out.println("Game Over!!!");
        }
    }
}
