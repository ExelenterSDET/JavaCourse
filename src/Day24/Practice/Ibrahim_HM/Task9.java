package Day24.Practice.Ibrahim_HM;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    /*
      Create a non-static method whose name is letsGuess().
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


    /*
    Optional Challenges to Task 9:

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
     */

    void letsGuess(){
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);


        int secretNumber = rnd.nextInt(11);
        System.out.println("secretNumber = " + secretNumber);

        System.out.print("Guess a number between 0 and 10 (inclusive): ");

        int attemp = 0;

        do {
            System.out.print("Try again : ");
            int input = scan.nextInt();

            if (input == secretNumber){
                System.out.println("You won. Congrats!"); break;
            }else if(input < secretNumber && input >= 0){
                System.out.println("Your number is small. Try a bigger number:");
            } else if(input > secretNumber && input < 11){
                System.out.println("Your number is big. Try a smaller number:");
            }else{
                System.out.println("Please enter a valid number:");
            }
            attemp++;
        } while (attemp < 5);
        if (attemp == 5 ){
            System.out.print("You lost! Better chance next time.");
        }
    }

    public static void main(String[] args) {
        Task9 t1 = new Task9();
        t1.letsGuess();
    }

}
