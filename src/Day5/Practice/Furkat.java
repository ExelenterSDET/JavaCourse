package Day5.Practice;

import java.sql.SQLOutput;

public class Furkat {

    public static void main(String[] args) {

        /*
                1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
                Expected Output :
                Hello
                Alexandra Abramov*/
        System.out.println("Hello");
        System.out.println("Dilnoza Khalilova");
        System.out.println("________________________");
        char ch1 = 'H';
        char ch2 = 'e';
        char ch3 = 'l';
        char ch4 = 'l';
        char ch5 = 'o';
        System.out.println("" + ch1 + ch2 + ch3 + ch4 + ch5);
        System.out.println("_______________________");
        char ch6 = 'D';
        char ch7= 'i';
        char ch8 = 'n';
        char ch9 = 'z';
        char ch11 = 'a';
        System.out.println("My name is: "+ ch6 +ch7+ch4+ch8+ch5+ch9+ch11);

        System.out.println("Task2________________________");

               /* 2. Write a Java program to print the sum of two numbers.
                Test Data:
                74 + 36
                Expected Output :
                110*/

        int num1 = 74;
        int num2 = 36;
        System.out.println(num1+num2);
        System.out.println("\nTask3________________________ ");

/*                3. Write a Java program to divide two numbers and print on the screen.
                Test Data :
                50/3
                Expected Output :
                16*/
        int num3 = 50;
        int num4 = 3;
        System.out.println(num3/num4);
        System.out.println("\nTask4________________________ ");

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
                13*/

        System.out.println(-5+(8*6));
        System.out.println((55+9)%9);
        System.out.println(20 + (-3*5) / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        System.out.println("\nTask5________________________ ");




              /*  5. Write a Java program that takes two numbers as input and display the product of two numbers.
                Test Data:
                Input first number: 25
                Input second number: 5
                Expected Output :
                25 x 5 = 125*/

        int num5 = 25;
        int num6 = 5;
        System.out.println(num5*num6);
        System.out.println("\nTask6________________________ ");

                /*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
                Test Data:
                Input first number: 125
                Input second number: 24
                Expected Output :
                125 + 24 = 149
                125 - 24 = 101
                125 x 24 = 3000
                125 / 24 = 5
                125 % 24 = 5*/

        int num7 = 125;
        int num8 = 24;
        System.out.println(num7+num8);
        System.out.println(num7-num8);
        System.out.println(num7*num8);
        System.out.println(num7/num8);
        System.out.println(num7%num8);
        System.out.println("\nTask7________________________ ");

             /*   7. Write a Java program to display the following pattern.
                Result should be :

                   J     a   v     v  a
                   J    a a   v   v  a a
                   J   aaaaa   V V  aaaaa
                  JJ  a     a   V  a     a*/

        char J = 'J';
        char a = 'a';
        char v = 'v';
        char V = 'V';
        System.out.println(J+"\t  a"+"   "+v+"\t " +"  " + v +"  "+a);
        System.out.println(J+"\ta  "+a +" "+v        +v +"   "+a+""+a  );
        System.out.println(J+" " +"aaaaa"+" \tV"+"    "+V+"  " + "aaaaa");
        System.out.println(J+" "+"aaaaa"+"     "+ V+"" + a+"\t   "+a);
        System.out.println();
        System.out.println("Copy & Paste"+"\n");
        System.out.println("J     a   v     v  a");
        System.out.println("J    a a   v   v  a a");
        System.out.println("J   aaaaa   V V  aaaaa");
        System.out.println("JJ  a     a  V  a     a");

        System.out.println("\nTask8________________________ ");



            /*    8. Write a Java program to compute the specified expressions and print the output.
                Test Data:
                ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
                Expected Output
                2.138888888888889*/

        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
        System.out.println("\nTask9________________________ ");


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
                ==============================================

                */


        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("=============================================");


        System.out.println("\nTask10________________________ ");
              /*  10. Write a Java program and compute the sum of the digits of an integer.
                Input Data:
                Input an integer: 258
                Expected Output: 2+5+8= 15*/

        int total =0;
        int number = 258;
        int divValue = 10;
        int remainder = number%divValue;
        System.out.println(remainder);
        number/=divValue;
        total+=remainder;
        int remainder1 = number%divValue;
        System.out.println(remainder1);
        number/=divValue;
        total+=remainder1;
        int remainder2 = number%divValue;
        System.out.println(remainder2);
        total+=remainder2;
        System.out.println("Expected Output: 2+5+8= " + total);
        System.out.println("\nTask11________________________ ");


              // 11. Create following variables:
                    byte b = 10;
                    short sh = 20;
                    int i = 30;
                    long l1 = 50;
                    float fl = 10.0F;
                    double db = 20.0;


//                    create new variable as follows:
//                    byte b1 = 0;
//                    reassign all variables to it.

        byte b1 = 0;
        b1=(byte) sh;
        System.out.println("b1 = " + b1);
        b1=(byte) i;
        System.out.println("b1 = " + b1);
        b1=(byte) l1;
        System.out.println("b1 = " + b1);
        b1=(byte) fl;
        System.out.println("b1 = " + b1);
        b1=(byte) db;
        System.out.println("b1 = " + b1);


//                    create new variable as follows:
//                    short sh1 = 0;
//                    reassign all variables to it.
        short sh1 = 0;
        sh1= b;
        System.out.println("sh1 = " + sh1);
        sh1=(short) i;
        System.out.println("sh1 = " + sh1);
        sh1=(short) l1;
        System.out.println("sh1 = " + sh1);
        sh1=(short) fl;
        System.out.println("sh1 = " + sh1);
        sh1=(short) db;
        System.out.println("sh1 = " + sh1);


//                    create new variable as follows:
//                    int i1 = 0;
//                    reassign all variables to it.
        int i1 = 0;
        i1= b;
        System.out.println("i1 = " + i1);
        i1= sh;
        System.out.println("i1 = " + i1);
        i1=(int) l1;
        System.out.println("i1 = " + i1);
        i1=(int) fl;
        System.out.println("i1 = " + i1);
        i1=(int) db;
        System.out.println("i1 = " + i1);

//                    create new variable as follows:
//                    long l1 = 0;
//                    reassign all variables to it.
        long l11 = 0;
        l11= sh;
        System.out.println("l11 = " + l11);
        l11= i;
        System.out.println("l11 = " + l11);
        l11= l1;
        System.out.println("l11 = " + l11);
        l11=(long)  fl;
        System.out.println("l11 = " + l11);
        l11=(long)  db;
        System.out.println("l11 = " + l11);

//                    create new variable as follows:
//                    float fl1 = 0;
//                   reassign all variables to it.
        float fl1 = 0;
        fl1= sh;
        System.out.println("fl1 = " + fl1);
        fl1= i;
        System.out.println("fl1 = " + fl1);
        fl1= l1;
        System.out.println("fl1 = " + fl1);
        fl1=  fl;
        System.out.println("fl1 = " + fl1);
        fl1=(float) db;
        System.out.println("fl1 = " + fl1);

//                    create new variable as follows:
//                    double db1 = 0;
//                    reassign all variables to it.*/

        double db1 = 0;
        db1=sh;
        System.out.println("db1 = " + db1);
        db1=  i;
        System.out.println("db1 = " + db1);
        db1= l1;
        System.out.println("db1 = " + db1);
        db1= fl;
        System.out.println("db1 = " + db1);
        db1= db;
        System.out.println("db1 = " + db1);



        System.out.println("\nTask12________________________ ");

         /*       12.  Write a Java program to print EXELENTER SDET.
                     Use ASCII table to complete the task.
                     example:
                     short sh1 = 97;
                     char a = (char)sh1; */

        int charE = 69;
        char e = (char) charE;
        short charX = 88;
        char x =(char) charX;
        double charL = 76;
        char l = (char)charL;
        int charN = 78;
        char n = (char)charN;
        short charT = 84;
        char t = (char)charT;
        float charR = 82;
        char r = (char)charR;
        int charS = 83;
        char s = (char)charS;
        float charD = 68;
        char d = (char)charD;
        System.out.println(" " + e+x+e+l+e+n+t+e+r+" "+ s+d+e+t);
        System.out.println("Thank you!!!");




    }
}
