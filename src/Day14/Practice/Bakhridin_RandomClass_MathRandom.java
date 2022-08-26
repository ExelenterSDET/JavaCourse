package Day14.Practice;

import java.util.Scanner;

public class Bakhridin_RandomClass_MathRandom {

    public static void main(String[] args) {

        // Let user provide a number between 0 and 3 not included
        // and generate a random number between 0 and 3 not included
        // and check if provided number is equal to generated number
        // if they are equal print out "You Won the Game!!!"
        // else "Game Over!!!"

        // to have a random number between two numbers. example: 25 and 30
        // (max - min) + min (max number is not included)
        // (max - min + 1) + min (max number is included)

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any numbers between 0 and 3=> ");
//        int i1 = scan.nextInt();
        //First Way: By using Random Class
//        System.out.println("Your entered number is = " + i1);
//        Random random = new Random();
//        int i = random.nextInt(3);
//        System.out.println("i = " + i);
//        String output = "";
//        if (i == i1) {
//            output = "You Won the Game!!!";
//        } else {
//            output = "Game Over!!!";
//        }
//        System.out.println("output = " + output);

        //Second way: By using Math.random() method and Ternary Operator

        int i2 = scan.nextInt();
        System.out.println("Your entered number is = " + i2);

        double random1 = Math.random()*3;
        int rnd= (int)random1;
        System.out.println("rnd = " + rnd);

        String result=(rnd==i2)? "You Won the Game!!!" : "Game Over!!!";
        System.out.println("result = " + result);

    }
}
