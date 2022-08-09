package Day1.Practice;

import Day1.Java.JavaIntro;

public class Malika {
    public static void main(String[] args) {
        // JavaIntro
        System.out.println("Hello World");
        System.out.println(2022);
        System.out.println("My name is " + "Malika " + "I am " + 30);
        System.out.println("My name is Malika I am " + 30);
        System.out.println("My name is Malika I am 30");
        // EscapeCharacters
        System.out.println("\"Hello World\"");
        System.out.println("Malika \nSadykova");
        System.out.println("\\Disney\\\t\\Land\\");
        //Byte
        byte min = -128;
        byte max = 127;
        byte number1 = 100;
        byte number2 = 50;
        byte total = (byte) (number1 + number2);
        System.out.println("total = " + total);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        //Boolean
        boolean bl = true;
        boolean bl1 = false;
        boolean bl3 = (2==2);
        boolean bl4 = (150==200);
        boolean bl5 = (240*2 == 1440/3);
        System.out.println(bl3);
        System.out.println(bl4);
        System.out.println(bl5);




    }
}
