package Day50.Java;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number 1");
        int number1 = 0;
        boolean isNotCorrect = true;

        while(isNotCorrect){
            try{
                number1 = Integer.parseInt(scan.nextLine());
                isNotCorrect = false;
            }catch(RuntimeException ex){
                System.out.println("Wrong number format. Provide only numeric characters");
            }
        }


        System.out.println("Please enter number 2");
        int number2 = Integer.parseInt(scan.nextLine());

        System.out.println("Your total is " + (number1 + number2));


    }
}
