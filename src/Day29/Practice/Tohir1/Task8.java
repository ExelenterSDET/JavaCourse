
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Task8 asg = new Task8();
        System.out.println(" = " + primes(12));
        System.out.println(" = " + primes(13));
        System.out.println("Please enter how many trials you want to find a prime: ");
        Scanner sca1 = new Scanner(System.in);
        int numberoftriels = sca1.nextInt();
        asg.askprime(numberoftriels);
    }

    static boolean primes(int num) {
        int half = (int) num / 2;
        Boolean status = true;
        for (int i = 2; i <= half; i++) {
            if (num % i == 0) {
                status = false;
                break;
            }
        }
        return status;
    }
    void askprime(int num)
    {
        int tries = num;
        while (tries>0) {
            System.out.println("Please enter a prime number: ");
            Scanner scan = new Scanner(System.in);
            int inserted = scan.nextInt();
            if (primes(inserted)!=true)
            {
                tries--;
                System.out.println("Your guess is wrong, enter a prime number, tries left = " + tries);
            }
            else
            {
                System.out.println("Your number " + inserted+" is prime.");
                tries = 0;
            }
        }
    }
}