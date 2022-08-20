package Day10.Java;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       /*
       Use scanner
       enter 3 numbers
       if all numbers are equal, return sum of the numbers
       if one of the numbers is not equal, return product of the numbers
       if any of number is negative, then return 0
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("number 1 => ");
        int n1 = scan.nextInt();
        System.out.print("number 2 => ");
        int n2 = scan.nextInt();
        System.out.print("number 3 => ");
        int n3 = scan.nextInt();

        if(n1==n2 && n2==n3 && n1>0){
            System.out.println(n1+n2+n3);
        }
        if((n1!=n3 || n2!=n3 || n1!=n2) && n1>0 && n2>0 && n3>0){
            System.out.println(n1*n2*n3);
        }
        if(n1<0 || n2<0 || n3<0 ){
            System.out.println(0);
        }
    }
}
