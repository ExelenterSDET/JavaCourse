package Day27.Practice._09_15_2022_Mentoring_SP5Tasks;

import Day24.Practice.Mustafa.Task;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
            /*
    Task 9
        Create a non-static method whose name is letsGuess().
        It does not take any parameter.
        Return type is void.
        This method produces a random number, say, secretNumber.
        In this method you must continue to guess number(s) until you hit the correct number which is the secretNumber.
        Method prints "Guess a number between 0 and 100 (inclusive): " in the beginning of the game.
        When the guess number is less than the secretNumber then print "Your number is small. Try a bigger number: ".
        When the guess number is more than the secretNumber then print "Your number is big. Try a smaller number: ".
        When the guess number is equal to the secretNumber then print "You won. Congrats!". And stop execution.
        When the guess is not a valid number (including any letter or special character) //jkdjfkd***12
          then print "Please enter a valid number: ". This counts as a wrong guess.
        The maximum number of guess attempts is 5.
        If the guesses reach to 5 than print "You lost! Better chance next time." And stop execution.
        Note:
         1) For guessing a number Scanner class is used.
         2) The method is not a static method.
    */
            public static void main(String[] args) {
                Task9 t9 = new Task9();
                t9.letsGuess();
            }

    void letsGuess(){
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(101);
        int totalAttempts = 5;
        String input;
        int counter = 0;
        int guessNumber = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Guess a number between 0 and 100 (inclusive): "); // 20 // 20dfkdfjdk |  hello -  NumberFormatException


        while (counter < totalAttempts){
            counter++;
            input = scan.nextLine();
            guessNumber = input.replaceAll("[^\\d]", "").length() == input.length() ? Integer.parseInt(input) : -1;

            if ((guessNumber > 100 || guessNumber < 0) && counter != totalAttempts){
                System.out.print("Please enter a valid number ");
            }
            else if (guessNumber < secretNumber && counter != totalAttempts){
                System.out.print("Your number is small. Try a bigger number ");
            } else if (guessNumber > secretNumber && counter != totalAttempts) {
                System.out.print("Your number is big. Try a smaller number ");
            } else if (guessNumber == secretNumber && counter != totalAttempts) {
                System.out.print("You won. Congrats!");
                System.out.println("=========================================");
                break;
            }
            ///////Challenge 1///////////
            if(counter != totalAttempts){
                System.out.print(counter == totalAttempts-1 ?  "(Only one guess left): "
                        : "(" + (totalAttempts - counter) + " guesses left): ");
            }
        }
        if (counter == totalAttempts && guessNumber != secretNumber){
            System.out.println("You lost! Better chance next time.");
            System.out.println("=========================================");
        }
        playAgain();
    }
    void playAgain(){
                String selection = null; // ""
                do {
                    System.out.println(selection == null ? "Do you want to play again?" : "Please enter a valid option!");
                    System.out.println("Press 1 if you want to continue playing.");
                    System.out.print("Press 0 if you do NOT want to continue: "); // 1
                    Scanner scan = new Scanner(System.in);
                    selection = scan.nextLine();
                    System.out.println("=========================================");
                }while (!selection.equals("0") && !selection.equals("1"));
                if (selection.equals("1")){
                    letsGuess();
                }
    }
}
