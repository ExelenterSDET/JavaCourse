package Day8.Practice;

import java.util.Arrays;

public class Dilnoza {

    public static void main(String[] args) {
//1. create a string "Hello my nane is Dilnoza"-convert to lowercase and uppercase

        String myName = "Hello, My name is Dilnoza";
        myName.toLowerCase();
        String s2 = myName.toLowerCase();
        System.out.println("s2 = " + s2);
        String s3 = myName.toUpperCase();
        System.out.println("s3 = " + s3);

        //2.  Task create a string "         Java is Fun           "
        String toTrim = "         Java is Fun           ";
        String trim = toTrim.trim();
        System.out.println("trim = " + trim);

        String str = "Java is Fun. I love Java";
        String x = str.replaceAll("[aelJ]", "x");
        System.out.println("x = " + x);


        String price = "2.5 usd";
        String s = price.replaceAll("[^0-9.]", "");
        System.out.println("s = " + s);

        String newstring = "Java is fun. I love Java";
        String s1 = newstring.replaceAll("[A-Z]", "S");
        System.out.println("s4 = " + s1);

//Task create a string with address and replace all non numberic to *

        String address = "122 Jay str, Brooklyn NY";
        String addresss1 = address.replaceAll("[^0-9,]", "");
        System.out.println("addresss1 = " + addresss1);
        // create a string "hello world"

        //1. starts with Hello
        String helloWorld = "Hello world";
        boolean hello = helloWorld.startsWith("Hello");
        System.out.println("hello = " + hello);
        //2. if string has ld

        boolean ld = helloWorld.endsWith("ld");
        System.out.println("ld = " + ld);

        String str1 = "myemail@gmail.com";
        String[] split = str.split("@");
        System.out.println(Arrays.toString(split));
        String text = "Java is FUN";
        String s4 = text.substring(8).toLowerCase().replace('u', 'a').toUpperCase();
        System.out.println("s4 = " + s4);

        String newString = "Hello World Hello";
        String replace1 = newString.replace("Hello", "hi");
        System.out.println("replace1 = " + replace1);


    }


}







