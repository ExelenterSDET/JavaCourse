package Day14.Practice;

import java.util.Random;
import java.util.Scanner;

public class Sebahattin {
    public static void main(String[] args) {
/*// Let user provide a number between 0 and 3 not included
    // and generate a random number between 0 and 3 not included
    // and check if provided number is equal to generated number
    // if they are equal print out "You Won the Game!!!"
    // else "Game Over!!!"

 */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 3 ==> ");
        int num = input.nextInt();

        if (num>0 && num<3) {

            Random random = new Random();
            int i = (random.nextInt(3 - 1)) + 1;
            System.out.println("i = " + i);

            if (i == num) {
                System.out.println("You Won the Game!!!");
            } else {
                System.out.println("Game Over!!!");
            }
        }
        else {
            System.out.println("Error !!! Please enter a number between 0 and 3");
        }
    }
}
