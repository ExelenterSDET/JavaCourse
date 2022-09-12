package Day24.Practice.Sebahattin;

import java.util.Random;
import java.util.Scanner;

public class OptionalChallengesToTask09 {
    /*      Optional Challenges to Task 9:

    Optional Challenge 1:

    Modify the re-guess message as follows:
        Each time the player have a wrong guess,
        - if the player has more than one guess, then the message should be like
            "Your number is small. Try a bigger number (4 guesses left): " or
            "Your number is big. Try a smaller number (2 guesses left): " or
            "Please enter a valid number (3 guesses left): "
        - if the player has only one guess left, then the message should be like
            "Your number is small. Try a bigger number (Only one guess left): " or
            "Your number is big. Try a smaller number (Only one guess left): " or
            "Please enter a valid number (Only one guess left): "

    Optional Challenge 2:

        When the game is over, ask player if he/she wants to play again by printing the following menu.
          "Do you want to play again?"
          "Press 1 if you want to continue playing."
          "Press 0 if you do NOT want to continue."
        If player types 1 then re-start the game.
        If player types 0 then stop executing.
        If player enter something else then keep asking and print
          "Please enter a valid option!"
          "Press 1 if you want to continue playing."
          "Press 0 if you do NOT want to continue."
*/
    public static void main(String[] args) {
        OptionalChallengesToTask09 ts = new OptionalChallengesToTask09();
        ts.adıletsGuess();
    }
    void adıletsGuess() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = random.nextInt(101);
        int guessCount = 0;
        System.out.print("Guess a random number between 0 and 100 (inclusive) ==> ");

        for (int i = 0; i <5; i++) {
            System.out.println("("+(5-guessCount)+" guesses left!!!)");
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
            System.out.println("You lost! Do you want to play again?");
            OptionalChallengesToTask09 ts = new OptionalChallengesToTask09();
            ts.trueNewGuess();
        }
    }
    void trueNewGuess (){
        System.out.println("Press 1 if you want to continue playing. Press 0 if you do NOT want to continue.");
        Scanner scan = new Scanner(System.in);
        int guessNew = scan.nextInt();
        if (guessNew == 1){
            OptionalChallengesToTask09 ts = new OptionalChallengesToTask09();
            ts.adıletsGuess();
        }else if (guessNew != 1 && guessNew != 0) {
            OptionalChallengesToTask09 ts = new OptionalChallengesToTask09();
            ts.falseNewGuess();
        }
    }
    void falseNewGuess (){
        System.out.println("Please enter a valid option!");
        OptionalChallengesToTask09 ts = new OptionalChallengesToTask09();
        ts.trueNewGuess();
    }
}
