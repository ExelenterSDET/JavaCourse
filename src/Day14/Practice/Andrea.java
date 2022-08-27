package Day14.Practice;

import java.util.Random;
import java.util.Scanner;

public class Andrea {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("\nHomework task");
        System.out.print("Enter a number between 0 and 3 (not included): ");
        int num = scan.nextInt();
        int randNum = random.nextInt(3);

        if (num == randNum) {
        System.out.println("You Won the Game!!!");
        }else {
        System.out.println("Game Over!!!");
        }

        System.out.println("randNum = " + randNum);
}
}
