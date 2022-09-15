package Day24.Practice.Sebahattin;

import java.util.Random;
import java.util.Scanner;

public class Task09 {
    /*      Create a non-static method whose name is letsGuess().
        It does not take any parameter.
        Return type is void.
        This method produces a random number, say, secretNumber.
        In this method you must continue to guess number(s) until you hit the correct number which is the secretNumber.
        Method prints "Guess a number between 0 and 100 (inclusive): " in the beginning of the game.
        When the guess number is less than the secretNumber then print "Your number is small. Try a bigger number: ".
        When the guess number is more than the secretNumber then print "Your number is big. Try a smaller number: ".
        When the guess number is equal to the secretNumber then print "You won. Congrats!". And stop execution.
        When the guess is not a valid number (including any letter or special character)
          then print "Please enter a valid number: ". This counts as a wrong guess.
        The maximum number of guess attempts is 5.
        If the guesses reach to 5 than print "You lost! Better chance next time." And stop execution.
        Note:
             1) For guessing a number Scanner class is used.
             2) The method is not a static method.
*/
    public static void main(String[] args) {
        Task09 ts = new Task09();
        ts.adıletsGuess();
    }
    void adıletsGuess() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = random.nextInt(101);
        int guessCount = 0;
        System.out.print("Guess a random number between 0 and 100 (inclusive) ==> ");

        for (int i = 0; i <5; i++) {

            int guess = scan.nextInt();

            if (guess == secretNumber) {
                System.out.println("You won!!");
                break;
            } else if (guess > secretNumber && guess <= 100) {
                System.out.println("Your number is big. Try a smaller number ==> ");
                guessCount++;
            } else if (guess < secretNumber && guess >= 0) {
                System.out.println("Your number is too small. Try a bigger number ==> ");
                guessCount++;
            } else {
                System.out.println("Please enter a valid number ==> ");
                guessCount++;
            }
        }
        if (guessCount == 5) {
            System.out.println("You lost! Better chance next time.");
        }
    }

    public void letsGuess() {
    }
}
