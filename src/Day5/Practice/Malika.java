package Day5.Practice;

public class Malika {
    public static void main(String[] args) {
 /* 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
                Expected Output :
                Hello
                Alexandra Abramov */
        System.out.println(" ");
        System.out.println("Hello \nMalika Sadykova");


                /* 2. Write a Java program to print the sum of two numbers.
                Test Data:
                74 + 36
                Expected Output :
                110 */
        System.out.println(" ");
        int num1 = 74;
        int num2 = 36;
        int total = num1 + num2;
        System.out.println("total = " + total);

                /* 3. Write a Java program to divide two numbers and print on the screen.
                Test Data :
                50/3
                Expected Output :
                16 */
        System.out.println(" ");

        byte div = (50/3);
        System.out.println("div = " + div);


               /* 4. Write a Java program to print the result of the following operations.
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
        System.out.println(" ");
        short a = -5 + 8 * 6;
        System.out.println("a = " + a);
        short b = (55+9) % 9;
        System.out.println("b = " + b);
        short c = 20 + -3*5 / 8;
        System.out.println("c = " + c);
        short d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("d = " + d);


               /* 5. Write a Java program that takes two numbers as input and display the product of two numbers.
                Test Data:
                Input first number: 25
                Input second number: 5
                Expected Output :
                25 x 5 = 125 */
        System.out.println(" ");

        System.out.println(25 + " x " + 5 + " = " + 125);
        //OR
        System.out.println(25 + " x " + 5 + " = " + 25 * 5);
        //OR
        int firstnumber = 25;
        int secondnumber = 5;
        System.out.println(firstnumber + " x " + secondnumber + " = " + firstnumber * secondnumber);


                /* 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
                Test Data:
                Input first number: 125
                Input second number: 24
                Expected Output :
                125 + 24 = 149
                125 - 24 = 101
                125 x 24 = 3000
                125 / 24 = 5
                125 % 24 = 5 */
        System.out.println(" ");

        int inputnum1 = 125;
        int inputnum2 = 24;
        int total2 = inputnum1+inputnum2;
        int difference = inputnum1-inputnum2;

        System.out.println(inputnum1 + " + " + inputnum2 + " = " + total2);
        System.out.println(inputnum1 + " - " + inputnum2 + " = " + difference);
        System.out.println(inputnum1 + " x " + inputnum2 + " = " + inputnum1 * inputnum2);
        System.out.println(inputnum1 + " / " + inputnum2 + " = " + inputnum1 / inputnum2);
        System.out.println(inputnum1 + " % " + inputnum2 + " = " + inputnum1 % inputnum2 );


               /* 7. Write a Java program to display the following pattern.
                Result should be :

                   J     a   v     v  a
                   J    a a   v   v  a a
                   J   aaaaa   V V  aaaaa
                  JJ  a     a   V  a     a */
        System.out.println(" ");

        System.out.println("   J     a   v     v  a");
        System.out.println("   J    a a   v   v  a a");
        System.out.println("   J   aaaaa   V V  aaaaa");
        System.out.println("  JJ  a     a   V  a     a");



                /* 8. Write a Java program to compute the specified expressions and print the output.
                Test Data:
                ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
                Expected Output
                2.138888888888889 */
        System.out.println(" ");
        double db1 = 25.5 * 3.5 - 3.5 * 3.5;
        double db2 = 40.5 - 4.5;
        double dbresult = (db1) / (db2);
        System.out.println("dbresult = " + dbresult);
        //OR
        double a1 = 25.5;
        double b1 = 3.5;
        double c1 = 40.5;
        double d1 = 4.5;
        double dbresult2 = (a1*b1 - b1*b1) / (c1 - d1);
        System.out.println("dbresult2 = " + dbresult2);



                /* 9. Write a Java program to print an American flag on the screen.
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
                ==============================================  */
        System.out.println(" ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");



               /* 10. Write a Java program and compute the sum of the digits of an integer.
                Input Data:
                Input an integer: 258
                Expected Output: 2+5+8= 15
                */
        System.out.println(" ");
        int n = 258;
        int n1 = n%10;
        n = n/10;
        int n2 = n%10;
        n = n/10;
        int n3 = n%10;

        System.out.println(n3 + " + " + n2 + " + " + n1 + " = " + (n1 + n2 + n3));

               /* 11. Create following variables:
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
                    reassign all variables to it.

                12.  Write a Java program to print EXELENTER SDET.
                     Use ASCII table to complete the task.
                     example:
                     short sh1 = 97;
                     char a = (char)sh1;

         */

    }
}
