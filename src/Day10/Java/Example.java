package Day10.Java;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.print("Enter i => ");
        int i = scan.nextInt();
        System.out.print("Enter i1 => " );
        int i1 = scan.nextInt();
        System.out.print("Enter i2 => ");
        int i2 = scan.nextInt();

        if(i == i1 && i1==i2 && i2<100){
            System.out.println("all numbers are equal and less then 100");
        }
        if(i != i2 || i<15 || i2>i1){
            System.out.println(i +"is not equal to " + i2 +
                                "or " + i + "< 15" +
                                "or " + i2 + "is > " + i1);
        }



    }
}
