package Day5.Practice;

public class BakhridinDay_05 {
    public static void main(String[] args) {

        // Task for homework.
        // calculate total of number 563. (dont use hardcoding) answer should be 14;

        int number1=563;
        int divider1=10;
        int totalOfReminders=0;

        //Step1
        //number1/=divider1;
        System.out.println("number1 = " + number1);
        int reminder1=number1%divider1;
        System.out.println("reminder1 = " + reminder1);
        totalOfReminders=number1%divider1;
        System.out.println("totalOfReminders = " + totalOfReminders);
        //Step2
        number1/=divider1;
        System.out.println("number1 = " + number1);
        reminder1=number1%divider1;
        System.out.println("reminder1 = " + reminder1);
        totalOfReminders+=reminder1;
        System.out.println("totalOfReminders = " + totalOfReminders);
        //Step3
        number1/=divider1;
        System.out.println("number1 = " + number1);
        reminder1=number1%divider1;
        System.out.println("reminder1 = " + reminder1);
        totalOfReminders+=reminder1;
        System.out.println("totalOfReminders = " + totalOfReminders);

        System.out.println("======2-nd way======");
        int numb=563, diVider=10, remind=0;
        //Step1
        System.out.println("numb = " + numb);
        remind+=numb%diVider;
        System.out.println("remind = " + remind);
        //Step2
        numb/=diVider;
        System.out.println("numb = " + numb);
        remind+=numb%diVider;
        System.out.println("remind = " + remind);
        //Step3
        numb/=diVider;
        System.out.println("numb = " + numb);
        remind+=numb%diVider;
        System.out.println("remind = " + remind);

        System.out.println("=======New Taks from Furkat==========");
        //                1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//                Expected Output :
//                Hello
//                Alexandra Abramov
        System.out.println("Hello\nBakhridin Khodzhaev");



//                2. Write a Java program to print the sum of two numbers.
//                Test Data:
//                74 + 36
//                Expected Output :
//                110

        System.out.println(74+36);

//                3. Write a Java program to divide two numbers and print on the screen.
//                Test Data :
//                50/3
//                Expected Output :
//                16
        System.out.println(50/3);

//                4. Write a Java program to print the result of the following operations.
//                Test Data:
//                a. -5 + 8 * 6
//                b. (55+9) % 9
//                c. 20 + -3*5 / 8
//                d. 5 + 15 / 3 * 2 - 8 % 3
//                Expected Output :
//                43
//                1
//                19
//                13
        System.out.println(-5+(8*6));
        System.out.println((55+9)%9);
        System.out.println(20+-(3*5)/8);
        System.out.println(5 + (15 / 3) * 2 - (8 % 3));

//                5. Write a Java program that takes two numbers as input and display the product of two numbers.
//                Test Data:
//                Input first number: 25
//                Input second number: 5
//                Expected Output :
//                25 x 5 = 125
        System.out.println("25 x5 = "+(25*5));

//                6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//                Test Data:
//                Input first number: 125
//                Input second number: 24
//                Expected Output :
//                125 + 24 = 149
//                125 - 24 = 101
//                125 x 24 = 3000
//                125 / 24 = 5
//                125 % 24 = 5
        System.out.println("125+24= "+(125+24));
        System.out.println("125-24= "+(125-24));
        System.out.println("125x24= "+(125*24));
        System.out.println("125:24= "+(125/24));
        System.out.println("125%24= "+(125%24));


//                7. Write a Java program to display the following pattern.
//                Result should be :
//
//                   J     a   v     v  a
//                   J    a a   v   v  a a
//                   J   aaaaa   V V  aaaaa
//                  JJ  a     a   V  a     a
        System.out.println("J     a   v     v  a");
        System.out.println("J    a a   v   v  a a");
        System.out.println("J   aaaaaa   V V  aaaaa");
        System.out.println("JJ a       a  V  a      a");



//                8. Write a Java program to compute the specified expressions and print the output.
//                Test Data:
//                ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//                Expected Output
//                2.138888888888889
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

//                9. Write a Java program to print an American flag on the screen.
//                Expected Output
//
//                * * * * * * ==================================
//                 * * * * *  ==================================
//                * * * * * * ==================================
//                 * * * * *  ==================================
//                * * * * * * ==================================
//                 * * * * *  ==================================
//                * * * * * * ==================================
//                 * * * * *  ==================================
//                * * * * * * ==================================
//                ==============================================
//                ==============================================
//                ==============================================
//                ==============================================
//                ==============================================
//                ==============================================
        System.out.println("* * * * * ==================================");
        System.out.println(" * * * *  ==================================");
        System.out.println("* * * * * ==================================");
        System.out.println(" * * * *  ==================================");
        System.out.println("* * * * * ==================================");
        System.out.println(" * * * *  ==================================");
        System.out.println("* * * * * ==================================");
        System.out.println(" * * * *  ==================================");
        System.out.println("* * * * * ==================================");


//                10. Write a Java program and compute the sum of the digits of an integer.
//                Input Data:
//                Input an integer: 258
//                Expected Output: 2+5+8= 15
        System.out.println("2+5+8= "+(2+5+8));

//                11. Create following variables:
//                    byte b = 10;
//                    short sh = 20;
//                    int i = 30;
//                    long l = 50;
//                    float fl = 10.0F;
//                    double db = 20.0;
        byte b=10;
        short sh=20;
        int i=30;
        long l=50;
        float fl=10.0f;
        double db=20.0;
//
//
//                    create new variable as follows:
//                    byte b1 = 0;
//                    reassign all variables to it.
        byte b1=0;
        b1=b; b1= (byte) sh; b1= (byte) i; b1= (byte) l; b1= (byte) fl; b1= (byte) db;

//
//                    create new variable as follows:
//                    short sh1 = 0;
//                    reassign all variables to it.
        short sh1=b; sh1=sh; sh1= (short) i; sh1= (short) l; sh1= (short) fl; sh1= (short) db;
//
//                    create new variable as follows:
//                    int i1 = 0;
//                    reassign all variables to it.
        int i1=b; i1=sh; i1=i; i1= (int) l; i1= (int) fl; i1= (int) db;
//
//                    create new variable as follows:
//                    long l1 = 0;
//                    reassign all variables to it.
        long l1=b; l1=sh; l1=i; l1=l; l1= (long) fl; l1= (long) db;
//
//                    create new variable as follows:
//                    float fl1 = 0;
//                    reassign all variables to it.
        float fl1=b; fl1=sh; fl1=i; fl1=l; fl1=fl; fl1= (float) db;

//                    create new variable as follows:
//                    double db1 = 0;
//                    reassign all variables to it.
        double db1=b;db1=sh;db1=i;db1=l;db1=fl;db1=db;


//                12.  Write a Java program to print EXELENTER SDET.
//                     Use ASCII table to complete the task.
//                     example:
//                     short sh1 = 97;
//                     char a = (char)sh1;

        int E=69,X=88,E1=69,L=76,E2=69,N=78,T=84,E3=69,R=82,S=83,D=68,E4=69,T1=84;
        char e,x,e1,l5,e2,n,t,e3,r,s,d,e4,t1;
        e= (char) E;
        x= (char) X;
        e1= (char) E1;
        l5= (char) L;
        e2= (char) E2;
        n= (char) N;
        t= (char) T;
        e3= (char) E3;
        r= (char) R;
        s= (char) S;
        d= (char) D;
        e4= (char) E4;
        t1= (char) T1;

        System.out.println(e+""+x+""+e1+""+l5+""+e2+""+n+""+t+""+e3+""+r+" "+s+""+d+""+e4+""+t1);

    }
}
