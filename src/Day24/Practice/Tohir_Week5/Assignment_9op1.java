package Day24.Practice.Tohir_Week5;

import java.util.Random;
import java.util.Scanner;

public class Assignment_9op1 {
    public static void main(String[] args) {
        Assignment_9op1 as = new Assignment_9op1();
        as.letsGuess();
    }
    void letsGuess()//Op1
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
                System.out.println("Your number is small. ");
            }
            else if (Integer.parseInt(str) > secretNumber){
                System.out.println("Your number is big. ");
            }
            i++;
            if (i<4)
            {
                System.out.println("Try another number. Total tries left " +(5-i)+"\n");
            }
            if (i == 4)
            {
                System.out.println("Only one guess left\n");
            }
            if (i == 5)
            {
                System.out.println("You lost! Better chance next time.");
                System.out.println("Do you want to play again?\n" +"Press 1 if you want to continue playing.\n" +"Press 0 if you do NOT want to continue.");

                int stat = 1;
                while (stat == 1) {
                    String tries = sc.next();
                    if (tries.equals("1")) {
                        System.out.println("Let's start again!");
                        i = 0;
                        stat = 0;

                    } else if (tries.equals("0")) {
                        System.out.println("See you next time!");
                        break;
                    } else {
                        System.out.println("Please enter a valid option!");
                        stat = 1;
                    }
                }
            }
        }
    }
}
//Optional Challenges to Task 9:
//
//Optional Challenge 1:
//
//Modify the re-guess message as follows:
//    Each time the player have a wrong guess,
//    - if the player has more than one guess, then the message should be like
//        "Your number is small. Try a bigger number (4 guesses left): " or
//        "Your number is big. Try a smaller number (2 guesses left): " or
//        "Please enter a valid number (3 guesses left): "
//    - if the player has only one guess left, then the message should be like
//        "Your number is small. Try a bigger number (Only one guess left): " or
//        "Your number is big. Try a smaller number (Only one guess left): " or
//        "Please enter a valid number (Only one guess left): "
//
//Optional Challenge 2:
//
//    When the game is over, ask player if he/she wants to play again by printing the following menu.
//      "Do you want to play again?"
//      "Press 1 if you want to continue playing."
//      "Press 0 if you do NOT want to continue."
//    If player types 1 then re-start the game.
//    If player types 0 then stop executing.
//    If player enter something else then keep asking and print
//      "Please enter a valid option!"
//      "Press 1 if you want to continue playing."
//      "Press 0 if you do NOT want to continue.