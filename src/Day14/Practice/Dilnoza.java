package Day14.Practice;

import java.util.Random;
import java.util.Scanner;
// Let user provide a number between 0 and 3 not included
// and generate a random number between 0 and 3 not included
// and check if provided number is equal to generated number
// if they are equal print out "You Won the Game!!!"
// else "Game Over!!!"

public class Dilnoza {
    public static void main(String[] args) {

        // to have a random number between two numbers. example: 25 and 30
        // (max - min) + min (max number is not included)
        // (max - min + 1) + min (max number is included)

        Scanner scan = new Scanner(System.in);

        System.out.print("Please provide a num between 0 & 3==> ");
        int userNum1 = scan.nextInt();
        System.out.println("userNum1 = " + userNum1);

        Random random = new Random();
        int randomNum = (random.nextInt(3 - 1) + 1);
        System.out.println("randomNum = " + randomNum);

        System.out.println("********************************");

        String output = " ";

        if (userNum1 >= 3) {
            output = "Invalid entry";
        } else if (userNum1 == randomNum) {
            output = " You Won the Game!!!";
        } else {
            System.out.println("Game Over!!!");
        }
        System.out.println(output);

        System.out.println("*****USING TERNARY OPERATOR*****");

        output = userNum1 >= 3 ? "Invalid entry" : userNum1 == randomNum ? " You Won the Game!!!" : "Game Over!!!";
        System.out.println("output = " + output);
    }

}

