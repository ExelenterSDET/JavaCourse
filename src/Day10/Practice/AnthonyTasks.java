package Day10.Practice;

import java.util.Scanner;

public class AnthonyTasks {
    public static void main(String[] args) {
        //use scanner
        // enter 3 numbers
        //if all numbers are equal, return sum of the numbers
        // if one of the numbers is not equal, return prdcut of the numbers
        // if any of the number is negative, then return 0

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num1 => ");
        int i1 = scan.nextInt();
        System.out.print("Enter num2 => ");
        int i2 = scan.nextInt();
        System.out.print("Enter num3 => ");
        int i3 = scan.nextInt();

        if(i1 == i2 && i2 == i3 && i1>0 ){
            System.out.println("All numbers are equal = " +(i1+i2+i3));
        }
        if((i1 != i2 || i1 != i3 || i2 != i3) && i1>0 && i2>0 && i3>0){
            System.out.println("If one number is not equal = " +(i1*i2*i3));
        }
        if(i1<0 && i2<0 && i3<0){
            System.out.println("If any number is negative = " +(i1*i2*i3*0));
        }
    }
}
