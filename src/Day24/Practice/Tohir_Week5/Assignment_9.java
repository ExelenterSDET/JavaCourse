package Day24.Practice.Tohir_Week5;

import java.util.Random;
import java.util.Scanner;

public class Assignment_9 {
    public static void main(String[] args) {
        Assignment_9 as = new Assignment_9();
        as.letsGuess();
    }
    void letsGuess()
    {
        Random ram = new Random();
        Scanner sc = new Scanner(System.in);
        int secretNumber = ram.nextInt(1,101);
        System.out.println("secretNumber = " + secretNumber);
        int i = 0;
        String str = "";
        int guess = 0;
        while (i<5){
            System.out.println("Guess a number between 0 and 100 (inclusive): ");
            str = sc.next();
            if (str.matches("[A-Za-z!@#&()–[{}]:;'`,?/*~$^+=<>]+$")){
                System.out.println("Please enter a valid number: ");
            }
            else if(Integer.parseInt(str)==secretNumber){
                System.out.println("You won. Congrats!");
                break;
            }

            else if (Integer.parseInt(str) < secretNumber){
                System.out.println("Your number is small. Try a bigger number: ");
            }
            else if (Integer.parseInt(str) > secretNumber){
                System.out.println("Your number is big. Try a smaller number: ");
            }
            i++;
            if (i == 5)
            {
                System.out.println("You lost! Better chance next time.");
            }
        }

    }
}
//Task 9
//        Create a non-static method whose name is letsGuess().
//        It does not take any parameter.
//        Return type is void.
//        This method produces a random number, say, secretNumber.
//        In this method you must continue to guess number(s) until you hit the correct number which is the secretNumber.
//        Method prints "Guess a number between 0 and 100 (inclusive): " in the beginning of the game.
//        When the guess number is less than the secretNumber then print "Your number is small. Try a bigger number: ".
//        When the guess number is more than the secretNumber then print "Your number is big. Try a smaller number: ".
//        When the guess number is equal to the secretNumber then print "You won. Congrats!". And stop execution.
//        When the guess is not a valid number (including any letter or special character)
//          then print "Please enter a valid number: ". This counts as a wrong guess.
//        The maximum number of guess attempts is 5.
//        If the guesses reach to 5 than print "You lost! Better chance next time." And stop execution.
//        Note:
//         1) For guessing a number Scanner class is used.
//         2) The method is not a static method.