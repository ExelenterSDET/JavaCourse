package Day11.Java;

import java.util.Scanner;

public class JavaIfElse {
    /*
    The Java if-else statement also
    tests the condition. It executes
    the if block if condition is true
    otherwise else block is executed.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number => ");
        int i = scan.nextInt();

        if(i == 1){
            System.out.println("i = " + i);
        }else{
            System.out.println("Wrong number");
        }

    }
}
