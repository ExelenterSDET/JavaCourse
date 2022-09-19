package Day29.Practice;

import java.util.Scanner;

public class ArtDay29tsk8 {
    public static void main(String[] args) {

        givePrime();

    }

    static boolean isPrime(int r){
        int i = 2;
        boolean flag = false;
        while (i <= r / 2) {
            // condition for nonprime number
            if (r % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }
        return flag;

    }

    static void givePrime() {
        int ctr = 1;

        while (ctr <= 10) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a number :");

            int inputNumber = scan.nextInt();
//        check to see if prime
            if (!isPrime(inputNumber)) {

                System.out.println("good guess!");
                break;

            } else {

                System.out.println("you suck. try again.");
                ctr++;

            }
        }
    }
}
