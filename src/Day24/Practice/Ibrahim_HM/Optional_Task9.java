package Day24.Practice.Ibrahim_HM;

import java.util.Random;
import java.util.Scanner;

public class Optional_Task9 {

    void letsGuess() {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);


        int secretNumber = rnd.nextInt(11);
        System.out.println("secretNumber = " + secretNumber);
        int attemp = 0;
        int maxattemp = 5;


        game:
        while(attemp < 5){
            System.out.print("Guess a number between 0 and 100 (inclusive): ");
            int input = scan.nextInt();
            attemp++;

            if (attemp < 4){
                if(input == secretNumber){
                    System.out.print("You won. Congrats!");
                    break;
                }
                else if (secretNumber > input && input > 0){
                    System.out.println("Your number is small. Try a bigger number : " + "(" + (maxattemp - attemp)  + " guesses left)");
                }
                else if (secretNumber < input && input < 11){
                    System.out.println("Your number is big. Try a smaller number : " + "(" + (maxattemp - attemp) + " guesses left)");
                }else {
                    System.out.println("Please enter a valid number :" + "(" + (maxattemp - attemp) + " guesses left)");
                }
            } else if (attemp == 4) {
                if(input == secretNumber){
                    System.out.print("You won. Congrats!");
                    break;
                }
                else if (secretNumber > input && input > 0){
                    System.out.println("Your number is small. Try a bigger number : ( Only one guess left)");
                }
                else if (secretNumber < input && input < 11){
                    System.out.println("Your number is big. Try a smaller number : ( Only one guess left)");
                }else {
                    System.out.println("Please enter a valid number : ( Only one guess left)");
                }

            } else if (attemp == 5 ){
                System.out.println("You lost! Better chance next time.");
                System.out.println("""
                        Do you want to play again?
                        Press 1 if you want to continue playing.
                        Press 0 if you do NOT want to continue.""".indent(1));


                int status = 1;
                while(status == 1){
                    int reGame = scan.nextInt();
                    if (reGame == 1) {
                        System.out.println(" Let's try again! ");
                        attemp= 0;
                        status = 0;
                    }
                    else if (reGame == 0){
                        System.out.println("See you next time! ");break;
                    }else{
                        System.out.println("""
                                Please enter a valid option
                                Press 1 if you want to continue playing.
                                Press 0 if you do NOT want to continue.""".indent(1));
                        status = 1;
                    }
                }
            }
        }


    }
    public static void main(String[] args) {
        Optional_Task9 t1 = new Optional_Task9();
        t1.letsGuess();
    }

}
