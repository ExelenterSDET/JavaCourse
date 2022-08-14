package Day5.Practice;

import java.util.Scanner;

public class GroupProjectSebahattin {
    public static void main(String[] args) {
/*
               1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
               Expected Output :
               Hello
               Alexandra Abramov
 */
        System.out.println("Task 1.");
        System.out.println("Hello");
        System.out.println("\"Alexandra Abramow\"");
        System.out.println("-----------------------");
/*
                2. Write a Java program to print the sum of two numbers.
                Test Data:
                74 + 36
                Expected Output :
                110
 */
        System.out.println("Task 2.");
        int num1=74, num2=36;
        System.out.println("Test Data : "+num1+ "+" + num2);
        System.out.println("Expected Output : "+(num1+num2));
        System.out.println("-----------------------");
/*
                3. Write a Java program to divide two numbers and print on the screen.
                Test Data :
                50/3
                Expected Output :
                16
*/
        System.out.println("Task 3.");
        byte x=50;
        byte y=3;
        System.out.println("Test Data : "+x+ "/" + y);
        System.out.println("Expected Output : "+(x/y));
        System.out.println("-----------------------");
 /*
                4. Write a Java program to print the result of the following operations.
                Test Data:
                a. -5 + 8 * 6
                b. (55+9) % 9
                c. 20 + -3*5 / 8
                d. 5 + 15 / 3 * 2 - 8 % 3
                Expected Output :
                43
                1
                19
                13
*/
        System.out.println("Task 4.");
        int opr1= -5+8*6;
        int opr2=(55+9)%9;
        int opr3=20+-3*5/8;
        int opr4=5+15/3*2-8%3;
        System.out.println("Expected Output : ");
        System.out.println("a = "+opr1);
        System.out.println("b = "+opr2);
        System.out.println("c = "+opr3);
        System.out.println("d = "+opr4);
        System.out.println("------------");

/*                5. Write a Java program that takes two numbers as input and display the product of two numbers.
                Test Data:
                Input first number: 25
                Input second number: 5
                Expected Output :
                25 x 5 = 125
*/
        System.out.println("Task 5.");
        Scanner input=new Scanner(System.in);
        System.out.println("Input first number = ");
        int entry1= input.nextInt();
        System.out.println("Input second number = ");
        int entry2= input.nextInt();
        System.out.println("Expected Output : ");
        System.out.println(""+entry1+"*"+entry2+"="+(entry1*entry2) );
        System.out.println("------------");
/*
                6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
                Test Data:
                Input first number: 125
                Input second number: 24
                Expected Output :
                125 + 24 = 149
                125 - 24 = 101
                125 x 24 = 3000
                125 / 24 = 5
                125 % 24 = 5
*/
        System.out.println("Task 6.");
        System.out.println("Input first number :");
        int A= input.nextInt();
        System.out.println("Input second number :");
        int B= input.nextInt();
        if (A>B) {
            System.out.println("Expected Output :");
            System.out.println(""+A+"+"+B+"="+(A+B) );
            System.out.println(""+A+"-"+B+"="+(A-B) );
            System.out.println(""+A+"*"+B+"="+(A*B) );
            System.out.println(""+A+"/"+B+"="+(A/B) );
            System.out.println(""+A+"%"+B+"="+(A%B) );
            System.out.println("------------");
    }
        else {
            System.out.println("Expected Output :");
            System.out.println(""+B+"+"+A+"="+(B+A) );
            System.out.println(""+B+"-"+A+"="+(B-A) );
            System.out.println(""+B+"*"+A+"="+(B*A) );
            System.out.println(""+B+"/"+A+"="+(B/A) );
            System.out.println(""+B+"%"+A+"="+(B%A) );
            System.out.println("------------");
        }
/*
                7. Write a Java program to display the following pattern.
                Result should be :

                   J     a   v     v  a
                   J    a a   v   v  a a
                   J   aaaaa   V V  aaaaa
                  JJ  a     a   V  a     a
*/
        System.out.println("Task 7.");
        char J='J', a='a', V='V', v='v';

        System.out.println(" "+J+"     "+a+"  "+v+"     "+v+"  "+a);
        System.out.println(" "+J+"    "+a+" "+a+"  "+v+"   "+v+"  "+a+" "+a);
        System.out.println(" "+J+"   "+a+a+a+a+a+"  "+V+" "+V+"  "+a+a+a+a+a);
        System.out.println(""+J+J+"  "+a+"     "+a+"  "+V+"  "+a+"     "+a);
        System.out.println("---------------------");
/*
                8. Write a Java program to compute the specified expressions and print the output.
                Test Data:
                ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
                Expected Output
                2.138888888888889
*/
        System.out.println("Task 8.");
        double numA=25.5;
        double numB=3.5;
        double numC=40.5;
        double numD=4.5;
        double exp=((numA*numB-numB*numB)/(numC-numD));
        System.out.println("Test Data : ");
        System.out.println("(("+numA+"*"+numB+"-"+numB+"*"+numB+")/("+numC+"-"+numD+"))");
        System.out.println("Expected Output : ");
        System.out.println(exp);
        System.out.println("-----------------");

/*
                9. Write a Java program to print an American flag on the screen.
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
        System.out.println("Task 9.");

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
/*
                10. Write a Java program and compute the sum of the digits of an integer.
                Input Data:
                Input an integer: 258
                Expected Output: 2+5+8= 15
*/

        System.out.println("Task 10.");
        System.out.println("Input an integer :");
        int vl = input.nextInt();
        int digit1= vl%10;
        int in1=(vl/10);
        int digit2=in1%10;
        int in2=(in1/10);
        int digit3=in2%10;
        System.out.println("Expected Output:"+digit3+"+"+digit2+"+"+digit1+"="+(digit1+digit2+digit3));
        System.out.println("-----------------");

/*
                11. Create following variables:
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
*/
        byte b=10;
        short sh=20;
        int i=30;
        long l=50;
        float fl=10.0F;
        double db=20.0;

        byte b1;
        b1=b;
        System.out.println("b1 = "+b1);
        b1 = (byte)sh;
        System.out.println("b1 = "+b1);
        b1 = (byte)i;
        System.out.println("b1 = "+b1);
        b1 = (byte)l;
        System.out.println("b1 = "+b1);
        b1 = (byte)fl;
        System.out.println("b1 = "+b1);
        b1 = (byte)db;
        System.out.println("b1 = "+b1);

        short sh1;
        sh1 = b;
        System.out.println("sh1 = "+sh1);
        sh1=sh;
        System.out.println("sh1 = "+sh1);
        sh1 = (short)i;
        System.out.println("sh1 = "+sh1);
        sh1 = (short)l;
        System.out.println("sh1 = "+sh1);
        sh1 = (short)fl;
        System.out.println("sh1 = "+sh1);
        sh1 = (short)db;
        System.out.println("sh1 = "+sh1);

        int i1;
        i1 = b;
        System.out.println("i1 = "+i1);
        i1 = sh;
        System.out.println("i1 = "+i1);
        i1=i;
        System.out.println("i1 = "+i1);
        i1 = (int)l;
        System.out.println("i1 = "+i1);
        i1 = (int)fl;
        System.out.println("i1 = "+i1);
        i1 = (int)db;
        System.out.println("i1 = "+i1);

        long l1;
        l1 = b;
        System.out.println("l1 = "+l1);
        l1 = sh;
        System.out.println("l1 = "+l1);
        l1 = i;
        System.out.println("l1 = "+l1);
        l1=l;
        System.out.println("l1 = "+l1);
        l1 = (long)fl;
        System.out.println("l1 = "+l1);
        l1 = (long)db;
        System.out.println("l1 = "+l1);

        float fl1;
        fl1 = b;
        System.out.println("fl1 = "+fl1);
        fl1 = sh;
        System.out.println("fl1 = "+fl1);
        fl1 = i;
        System.out.println("fl1 = "+fl1);
        fl1 = l;
        System.out.println("fl1 = "+fl1);
        fl1 = fl;
        System.out.println("fl1 = "+fl1);
        fl1 = (float) db;
        System.out.println("l1 = "+fl1);

        double db1;
        db1 = b;
        System.out.println("db1 = "+db1);
        db1 = sh;
        System.out.println("db1 = "+db1);
        db1 = i;
        System.out.println("db1 = "+db1);
        db1 = l;
        System.out.println("db1 = "+db1);
        db1 = fl;
        System.out.println("db1 = "+db1);
        db1 = db;
        System.out.println("db1 = "+db1);
        System.out.println("-----------------");
/*
                12.  Write a Java program to print EXELENTER SDET.
                     Use ASCII table to complete the task.
                     example:
                     short sh1 = 97;
                     char a = (char)sh1;
*/
        System.out.println("Task 12.");
        byte byt1= 69;
        char ch1 = (char)byt1;
        byte byt2= 88;
        char ch2 = (char)byt2;
        byte byt3= 76;
        char ch3 = (char)byt3;
        byte byt4= 78;
        char ch4 = (char)byt4;
        byte byt5= 84;
        char ch5 = (char)byt5;
        byte byt6= 82;
        char ch6 = (char)byt6;
        byte byt7= 32;
        char ch7 = (char)byt7;
        byte byt8= 83;
        char ch8 = (char)byt8;
        byte byt9= 68;
        char ch9 = (char)byt9;
        System.out.print(""+ch1+ch2+ch1+ch3+ch1+ch4+ch5+ch1+ch6+ch7+ch8+ch9+ch1+ch5);
    }
}
