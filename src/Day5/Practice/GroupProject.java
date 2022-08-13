package Day5.Practice;

public class GroupProject {

    public static void main(String[] args) {
        System.out.println("----------------------------------------");


        // 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        // Expected Output :
        // Hello (check)
        // Alexandra Abramov (check)

        System.out.println("Task1 = " + "Hello");
        System.out.println("Task1 = " + "Anthony Hermann");
        System.out.println("----------------------------------------");

        //   2. Write a Java program to print the sum of two numbers.
        //  Test Data:
        //   74 + 36
        //   Expected Output :
        //   110 (check)

        int n1 = 74;
        int n2 = 36;
        System.out.println("Task2 = " +(n1+n2));
        System.out.println("----------------------------------------");

        //  3. Write a Java program to divide two numbers and print on the screen.
        //  Test Data :
        //  50/3
        //   Expected Output :
        // 16 (check)

        int a = 50;
        int c = 3;
        System.out.println("Task3 = " + (a/c));
        System.out.println("----------------------------------------");


        //  4. Write a Java program to print the result of the following operations.
        //  Test Data:
        //   a. -5 + 8 * 6
        //   b. (55+9) % 9
        //   c. 20 + -3*5 / 8
        //   d. 5 + 15 / 3 * 2 - 8 % 3
        //   Expected Output :
        //   43 (check)
        //   1 (check)
        //   19 (check)
        // 13 (check)

        System.out.println("Task4 = " + (-5 + (8 * 6)));
        System.out.println("Task4 = "+ (((55+9) %9)));
        System.out.println("Task4 = " + (20 + (-3*5)/8));
        System.out.println("Task4 = "+(5+15 / 3 * 2 - (8 % 3)));
        System.out.println("----------------------------------------");

        //  5. Write a Java program that takes two numbers as input and display the product of two numbers.
        //  Test Data:
        //  Input first number: 25
        //  Input second number: 5
        //   Expected Output :
        //   25 x 5 = 125 (check)

        int fni1 = 25;
        int sni1 = 5;
        System.out.println("Task5 = 25 x 5 = "  + ((fni1 * sni1)));
        System.out.println("----------------------------------------");

        //   6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        //   Test Data:
        //   Input first number: 125
        //  Input second number: 24
        //  Expected Output :
        //  125 + 24 = 149
        //  125 - 24 = 101
        //   125 x 24 = 3000
        //   125 / 24 = 5
        //   125 % 24 = 5

        int fn1 = 125;
        int sn1 = 24;

        System.out.println("Task6 = (125 + 24) = " + (fn1 + sn1));
        System.out.println("Task6 = (125 - 24) = " + (fn1 - sn1));
        System.out.println("Task6 = (125 * 24) = " + (fn1 * sn1));
        System.out.println("Task6 = (125 / 24) = " + (fn1 / sn1));
        System.out.println("Task6 = (125 % 24) = " + (fn1 % sn1));


        System.out.println("----------------------------------------");


        //   7. Write a Java program to display the following pattern.
        //  Result should be :

        //     J     a   v     v  a
        //     J    a a   v   v  a a
        //     J   aaaaa   V V  aaaaa
        //    JJ  a     a   V  a     a

        System.out.println("Task7");
        System.out.println("     JJ     a    v     v   a");
        System.out.println("     JJ    a a    v   v   a a");
        System.out.println("JJ   JJ   aaaaa    V V   aaaaa");
        System.out.println("  JJJJ   a     a    V   a     a");

        System.out.println("----------------------------------------");


        //  8. Write a Java program to compute the specified expressions and print the output.
        //  Test Data:
        //  ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        //  Expected Output
        //  2.138888888888889

        System.out.println("Task8 = " + (25.5 * 3.5 - 3.5 * 3.5)/ (40.5-4.5));

        System.out.println("----------------------------------------");



        //  9. Write a Java program to print an American flag on the screen.
        //  Expected Output

        //  * * * * * * ==================================1
        //  * * * * *  ==================================2
        // * * * * * * ==================================3
        //   * * * * *  ==================================4
        //  * * * * * * ==================================5
        //   * * * * *  ==================================6
        //  * * * * * * ==================================7
        //   * * * * *  ==================================8
        //  * * * * * * ==================================9
        //  ==============================================10
        //  ==============================================11
        //  ==============================================12
        //  ==============================================13
        //  ==============================================14
        // ==============================================15
        System.out.println("TASK9 - VARIATION1");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

        System.out.println("----------------------------------------");


        // 10. Write a Java program and compute the sum of the digits of an integer.
        // Input Data:
        // Input an integer: 258
        // Expected Output: 2+5+8= 15

        int ab = 258;
        int a1 = ab%10;
        ab = ab/10;
        int a2 = ab%10;
        ab = ab/10;
        int a3 = ab%10;
        System.out.println("Task10 = "+ a3 +"+"+ a2 + "+"+ a1 + "=" +(a1+a2+a3));



        System.out.println("----------------------------------------");

        //11. Create following variables:
        byte b = 10;
        short sh = 20;
        int i = 30;
        long l = 50;
        float fl = 10.0F;
        double db = 20.0;

        //  create new variable as follows:
        //  byte b1 = 0;
        //  reassign all variables to it.
        //**byte b= 10;
        byte b1=0;
        b1= (byte) sh; b1=(byte) i; b1 = (byte) l; b1= (byte) fl; b1 =(byte) db;
        System.out.println("Task11 sh = " + b1);
        System.out.println("Task11 i = " + b1);
        System.out.println("Task11 l = " + b1);
        System.out.println("Task11 fl = " + b1);
        System.out.println("Task11 db = " + b1);

        //  create new variable as follows:
        //  short sh1 = 0;
        //  reassign all variables to it.
        //**short sh =20;

        short sh1 = 0;
        sh1 = b; sh1= (short) i; sh1 = (short) l; sh1 = (short) fl; sh1= (short) db;
        System.out.println("Task11 b = " + sh1);
        System.out.println("Task11 i = " + sh1);
        System.out.println("Task11 l = " + sh1);
        System.out.println("Task11 fl = " + sh1);
        System.out.println("Task11 db =" + sh1);


        // create new variable as follows:
        // int i1 = 0;
        // reassign all variables to it.
        int i1=0;
        i1=b; i1=sh; i1 = (int) l; i1= (int) fl; i1 =(int) db;
        System.out.println("Task11 b = " + i1);
        System.out.println("Task11 sh = " + i1);
        System.out.println("Task11 l = " + i1);
        System.out.println("Task11 fl = " + i1);
        System.out.println("Task11 db = " + i1);

        //  create new variable as follows:
        //  long l1 = 0;
        //  reassign all variables to it.
        long l1 =0;
        l1 =b; l1=sh; l1=i; l1=l; l1= (long) fl; l1 = (long) db;
        System.out.println("Task11 b = " + l1);
        System.out.println("Task11 sh = " + l1);
        System.out.println("Task11 i=" + l1);
        System.out.println("Task11 fl =" + l1);
        System.out.println("Task11 db =" + l1);


        //  create new variable as follows:
        //  float fl1 = 0;
        //  reassign all variables to it.
        float fl1=0;
        fl1=b; fl1=sh; fl1=i; fl1= l; fl1 = (float) db;
        System.out.println("Task11 b = " + fl1);
        System.out.println("Task11 sh = " + fl1);
        System.out.println("Task11 i =" + fl1);
        System.out.println("Task11 l =" + fl1);
        System.out.println("Task11 db =" + fl1);

        // create new variable as follows:
        //double db1 = 0;
        //reassign all variables to it.

        double db1 =0;
        db1 = b; db1 =sh; db1=i; db1=l; db1= (double)fl;
        System.out.println("Task11 b = " + db1);
        System.out.println("Task11 sh = " + db1);
        System.out.println("Task11 i =" + db1);
        System.out.println("Task11 l =" + db1);
        System.out.println("Task11 fl = " + db1);


        System.out.println("----------------------------------------");

        //12.  Write a Java program to print EXELENTER SDET.
        //Use ASCII table to complete the task.
        //example:
        //short sh1 = 97;
        //char a = (char)sh1;

        char c1 = 69; //E
        char c2 = 88; //X
        char c3 = 76; //L
        char c4 = 78; //N
        char c5 = 84; //T
        char c6 = 82; //R
        char c7 = 83; //S
        char c8 = 68; //D

        System.out.println("Task12 = \n"+c1+c2+c1+c3+c1+c4+c5+c1+c6+" "+c7+c8+c1+c5);


        System.out.println("----------------------------------------");
    }
}
