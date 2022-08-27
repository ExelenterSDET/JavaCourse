package Day14.Practice;
import java.util.Random;
import java.util.Scanner;
public class Tohir {

        public static void main(String[] args) {

// Let user provide a number between 0 and 3 not included
            // and generate a random number between 0 and 3 not included
            // and check if provided number is equal to generated number
            // if they are equal print out "You Won the Game!!!"
            // else "Game Over!!!"
            Scanner scan = new Scanner(System.in);
            Random ram = new Random();
            int numb = scan.nextInt();
            int numb_random = ram.nextInt(0,3);
            System.out.print(numb+" and random "+numb_random);
            System.out.print((numb==numb_random)?"\nYou Won the Game!!!":
                    "\nGame Over!!!");
            //math.max and math.min
        }

}
