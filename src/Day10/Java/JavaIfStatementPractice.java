package Day10.Java;

import java.util.Scanner;

public class JavaIfStatementPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("print your first number => ");
        int n1 = scan.nextInt();
        System.out.print("print your second number => ");
        int n2 = scan.nextInt();

        if(n1>n2){
            System.out.println(n1 + " is greater then "+n2);
        }
        if(n1==n2){
            System.out.println(n1 + " is equal to " + n2);
        }
        if(n1<n2){
            System.out.println(n1 + " is smaller then " + n2);
        }
    }
}
