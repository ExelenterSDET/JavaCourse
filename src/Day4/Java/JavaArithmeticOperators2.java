package Day4.Java;

public class JavaArithmeticOperators2 {

    // Remainders %

    public static void main(String[] args) {

        int num = 51;

        int result1 = num%10;

        System.out.println("result1 = " + result1);

        int example2 = 9 % 4; //8/4 == will return whole number. Remainder is 1.
        System.out.println("example2 = " + example2);

        int example3 = 7%5; // as whole we have 1 * 5 ====> remainder will be 2
        System.out.println("example3 = " + example3);

        int example4 = 12%3;
        System.out.println("example4 = " + example4);

        int example5 = 18%7; // 7*2 = 14 ==> remainder will be 18-14 = 4;
        System.out.println("example5 = " + example5);

        byte example6 = 21%9; // 9*2 = 18; 21 - 18 = 3;
        System.out.println("example6 = " + example6);

        short example7 = 584%15; // 38*15 = 570; remainder = 584 - 570 = 14;
        System.out.println("example7 = " + example7);

        double db1 = 25.55 % 10;
        System.out.println("db1 = " + db1);

        double db2 = 51 % 12.45;
        System.out.println("db2 = " + db2);

        int number = 10;
        number = number % 4; // 4*2=8 ==> remainder will be 10 - 8 = 2
        System.out.println("number = " + number);
    }
}
