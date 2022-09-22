package Day31.Practice.Andrea;

import java.util.Scanner;

public class Mentoring2 {

    //Task 8
    public static void main(String[] args) {
        Mentoring2 m2 = new Mentoring2();
        m2.findPrimeNumber();

    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                ;
            }
            return false;
        }
        return true;
    }

    static void findPrimeNumber() {
        int attempts = 0;

        while (attempts < 10) {
            int input;
            Scanner scan = new Scanner(System.in);
            System.out.print("Provide a number: ");
            input = scan.nextInt();
            if (isPrime(input)) {
                System.out.println("It's prime!");
            }
            attempts++;
            if (attempts == 10 && !isPrime(input)){
                System.out.println("Sorry!");
            }

        }
    }
}


