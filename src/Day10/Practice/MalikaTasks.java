package Day10.Practice;

import java.util.Scanner;

public class MalikaTasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Task1
        System.out.print("Type text1 ==> ");
        String text1 = scan.nextLine();
        System.out.print("Type text2 ==> ");
        String text2 = scan.nextLine();

        if (text1.length() == text2.length()) {
            System.out.println("the lengths are equal");
        }
        if (text1.length() != text2.length()) {
            System.out.println("the lengths are not equal");

            //Task2
            System.out.print("Type Text");
            String s1 = scan.nextLine();
            System.out.print("Type Numbers");
            int n1 = scan.nextInt();

            if (s1.length() < n1) {
                System.out.println(s1.substring(s1.length() - 3));
            }
            if (n1 <= s1.length()) {
                System.out.println(s1.substring(0, n1));
                //Task3
                System.out.print("type number1");
                int i = scan.nextInt();
                System.out.print("type number2");
                int i1 = scan.nextInt();
                System.out.print("type number3");
                int i2 = scan.nextInt();
                if (i == i1 && i1 == i2 && i == i2) {
                    System.out.println(i + i1 + i2);
                }
                if (i != i1 || i1 != i2 || i2 != i) {
                    System.out.println(i * i1 * i2);
                }
                if (i < 0 || i1 < 0 || i2 < 0) {
                    System.out.println("0");
                }


            }
        }
    }
}
