package Day14.Practice;

import java.util.Random;
import java.util.Scanner;

public class Anthony {
    public static void main(String[] args) {


        //Let user provide a number between 0 and 3 not included
        // and generate a random number between 0 and 3 not included
        // and check if provided number is equal to generated number
        //if they are equal print out "You Won the Game"
        //if they don't equal print out "GAME OVER"

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Random Number 0-3 = ");
        int i = scan.nextInt();


        Random random = new Random();

        int max = 3;
        int min = 0;
        int rnd = random.nextInt(max-min+1)+min;
        System.out.println("Random = "+ rnd);

        String output = "You Won the Game !!!";
        if (rnd == i) {
            output = "You Won the Game!!! ";
        } else if (rnd != i) {
            output = "GAME OVER";
        }
        System.out.println("output = " + output);

    }
}
