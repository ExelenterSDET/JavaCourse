package Day14.Practice;

import java.util.Scanner;

public class arthur14day {

    public static void main(String[] args) {
        int userInp;
        double r;
        int newr;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number between 0 and 3 non inclusive");

        r =  (Math.random()*3);
        newr = (int) r;

        userInp = scan.nextInt();
        System.out.println("r = " + r);
        System.out.println("newr = " + newr);
        System.out.println((newr==userInp)?"You won the game!!!":"Game Over");
    }
}
