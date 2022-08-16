package Day5.Practice;

public class GroupProject {

    public static void main(String[] args){

     /*
                1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
                Expected Output :
                Hello
                Alexandra Abramov
         */

        System.out.println("Task #1:");
        System.out.println("Hello");
        System.out.println("Andrea Mikulin");

         /*     2. Write a Java program to print the sum of two numbers.
                Test Data:
                74 + 36
                Expected Output :
                110 */

        System.out.println("");
        System.out.println("Task #2:");
        int num1 = 74;
        int num2 = 36;
        System.out.println(num1 + num2);

          /*

                3. Write a Java program to divide two numbers and print on the screen.
                Test Data :
                50/3
                Expected Output :
                16 */


        System.out.println("");
        System.out.println("Task #3:");
        int numA = 50;
        int numB = 3;
        System.out.println(numA/numB);

              /*  4. Write a Java program to print the result of the following operations.
                Test Data:
                a. -5 + 8 * 6
                b. (55+9) % 9
                c. 20 + -3*5 / 8
                d. 5 + 15 / 3 * 2 - 8 % 3
                Expected Output :
                43
                1
                19
                13 */

        System.out.println("");
        System.out.println("Task #4:");
        System.out.println( -5 + (8 * 6));
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);


               /* 5. Write a Java program that takes two numbers as input and display the product of two numbers.
                Test Data:
                Input first number: 25
                Input second number: 5
                Expected Output :
                25 x 5 = 125 */

        System.out.println("");
        System.out.println("Task #5:");
        int number1 = 25;
        int number2 = 5;
        System.out.println("25 X 5 = " + (number1 * number2));


          /*      6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
                Test Data:
                Input first number: 125
                Input second number: 24
                Expected Output :
                125 + 24 = 149
                125 - 24 = 101
                125 x 24 = 3000
                125 / 24 = 5
                125 % 24 = 5 */

        System.out.println("");
        System.out.println("Task #6:");
        int numberOne = 125;
        int numberTwo = 24;
        System.out.println("125 + 24 = " + (numberOne + numberTwo));
        System.out.println("125 - 24 = " + (numberOne - numberTwo));
        System.out.println("125 X 24 = " + (numberOne * numberTwo));
        System.out.println("125 / 24 = " + (numberOne / numberTwo));
        System.out.println("125 % 24 = " + (numberOne % numberTwo));

                /*7. Write a Java program to display the following pattern.
                Result should be :

                   J     a   v     v  a
                   J    a a   v   v  a a
                   J   aaaaa   V V  aaaaa
                  JJ  a     a   V  a     a
                  */

        System.out.println("");
        System.out.println("Task #7:");
        System.out.println("   J     a   v     v  a");
        System.out.println("   J    a a   v   v  a a ");
        System.out.println("   J   aaaaa   V V  aaaaa");
        System.out.println("  JJ  a     a   V  a     a");

             /*   8. Write a Java program to compute the specified expressions and print the output.
                Test Data:
                ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
                Expected Output
                2.138888888888889 */

        System.out.println("");
        System.out.println("Task #8:");
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

          /*  9. Write a Java program to print an American flag on the screen.
                Expected Output

                * * * * * * ==================================
                 * * * * *  ==================================
                * * * * * * ==================================
                 * * * * *  ==================================
                * * * * * * ==================================
                 * * * * *  ==================================
                * * * * * * ==================================
                 * * * * *  ==================================
                * * * * * * ==================================
                ==============================================
                ==============================================
                ==============================================
                ==============================================
                ==============================================
                ==============================================
                */

        System.out.println("");
        System.out.println("Task #9:");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");

            /*    10. Write a Java program and compute the sum of the digits of an integer.
                Input Data:
                Input an integer: 258
                Expected Output: 2+5+8= 15 */

        System.out.println("");
        System.out.println("Task #10:");

        int n = 258;
        int n1 = n%10;
        n = n/10;
        int n2 = n%10;
        n = n/10;
        int n3 = n%10;
        System.out.println(n3 + " + " + n2 + " + " + n1 + " = " + (n1 + n2 + n3));

            /*    11. Create following variables:
                    byte b = 10;
                    short sh = 20;
                    int i = 30;
                    long l = 50;
                    float fl = 10.0F;
                    double db = 20.0;


                    create new variable as follows:
                    byte b1 = 0;
                    reassign all variables to it.

                    create new variable as follows:
                    short sh1 = 0;
                    reassign all variables to it.

                    create new variable as follows:
                    int i1 = 0;
                    reassign all variables to it.

                    create new variable as follows:
                    long l1 = 0;
                    reassign all variables to it.

                    create new variable as follows:
                    float fl1 = 0;

                    reassign all variables to it.

                    create new variable as follows:
                    double db1 = 0;
                    reassign all variables to it. */

        System.out.println("");
        System.out.println("Task #11:");

        byte b = 10;
        short sh = 20;
        int i = 30;
        long l = 50;
        float fl = 10.0F;
        double db = 20.0;

        byte b1 = 0;
        b1 = (byte)sh;
        System.out.println("b1 = " + b1);
        b1 = (byte)i;
        System.out.println("b1 = " + b1);
        b1 = (byte)l;
        System.out.println("b1 = " + b1);
        b1 = (byte)fl;
        System.out.println("b1 = " + b1);
        b1 = (byte)db;
        System.out.println("b1 = " + b1);

        short sh1 = 0;
        sh1 = b;
        System.out.println("sh1 = " + sh1);
        sh1 = (short)i;
        System.out.println("sh1 = " + sh1);
        sh1 = (short)l;
        System.out.println("sh1 = " + sh1);
        sh1 = (short)fl;
        System.out.println("sh1 = " + sh1);
        sh1 = (short)db;
        System.out.println("sh1 = " + sh1);

        int i1 = 0;
        i1 = b;
        System.out.println("i1 = " + i1);
        i1 = sh;
        System.out.println("i1 = " + i1);
        i1 = (int)l;
        System.out.println("i1 = " + i1);
        i1 = (int)fl;
        System.out.println("i1 = " + i1);
        i1 = (int)db;
        System.out.println("i1 = " + i1);

        long l1 = 0;
        l1 = b;
        System.out.println("l1 = " + l1);
        l1 = sh;
        System.out.println("l1 = " + l1);
        l1 = i;
        System.out.println("l1 = " + l1);
        l1 = (long)fl;
        System.out.println("l1 = " + l1);
        l1 = (long)db;
        System.out.println("l1 = " + l1);

        float fl1 = 0;
        fl1 = b;
        System.out.println("fl1 = " + fl1);
        fl1 = sh;
        System.out.println("fl1 = " + fl1);
        fl1 = i;
        System.out.println("fl1 = " + fl1);
        fl1 = l;
        System.out.println("fl1 = " + fl1);
        fl1 = (float)db;
        System.out.println("fl1 = " + fl1);

        double db1 = 0;
        db1 = b;
        System.out.println("db1 = " + db1);
        db1 = sh;
        System.out.println("db1 = " + db1);
        db1 = i;
        System.out.println("db1 = " + db1);
        db1 = l;
        System.out.println("db1 = " + db1);
        db1 = fl;
        System.out.println("db1 = " + db1);

           /*    12.  Write a Java program to print EXELENTER SDET.
                     Use ASCII table to complete the task.
                     example:
                     short sh1 = 97;
                     char a = (char)sh1;
         */

        System.out.println("");
        System.out.println("Task #12:");

        char ch1 = 69; //E
        char ch2 = 88; //X
        char ch3 = 76; //L
        char ch4 = 78; //N
        char ch5 = 84; //T
        char ch6 = 82; //R
        char ch7 = 32; //space
        char ch8 = 83; //S
        char ch9 = 68; //D

        System.out.println("" + ch1 + ch2 + ch1 + ch3 + ch1 + ch4 + ch5 + ch1 + ch6 + ch7 + ch8 + ch9 + ch1 + ch5);


    }
}

