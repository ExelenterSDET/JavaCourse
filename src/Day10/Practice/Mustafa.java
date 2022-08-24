package Day10.Practice;

import java.util.Scanner;

public class Mustafa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First string");
        String str1 = scan.nextLine();
        System.out.println("Second String");
        String str2 = scan.nextLine();

        if (str1.length() == str2.length()){
            System.out.println("The length is equal");
        }
        if (str1.length() != str2.length()){
            System.out.println("The length is not equal");
        }

        System.out.print("first int");
        int int1 = scan.nextInt();
        System.out.print("second int");
        int int2 = scan.nextInt();
        System.out.print("third int");
        int int3 = scan.nextInt();

        if (int1 == int2 && int2 == int3){
            System.out.println(int1 + int2 + int3);
        }
        if (( int1 != int2 || int2 != int3 || int1 !=int3 )&& int1 >= 0 && int2 >=0 && int3 >= 0 ){
            System.out.println(int1 * int2 * int3);
        }
        if ( int1<0 || int2 < 0 || int3 <0){
            System.out.println("0");
        }


    }
}
