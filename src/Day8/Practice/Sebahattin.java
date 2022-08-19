package Day8.Practice;

import java.util.Arrays;

public class Sebahattin {
    public static void main(String[] args) {

        String str = "    Hello. My name is Sebahattin     ";
        System.out.println("Message 1 = "+str);
        System.out.println("------------------");

        String trim = str.trim();
        System.out.println("Message 2 = "+trim);
        System.out.println("------------------");

        String str1 = trim.toString();
        System.out.println("Message 3 = "+str1);
        System.out.println("------------------");

        String str2 = str1.toLowerCase();
        System.out.println("Message 4 = "+str2);
        System.out.println("------------------");

        String str3 = str1.toUpperCase();
        System.out.println("Message 5 = "+str3);
        System.out.println("------------------");

        String replace = str1.replace("Hello", "Hi");
        System.out.println("Message 6 = "+replace);
        System.out.println("------------------");

        String replace2 = str3.replace("SEBAHATTİN","sebahattin").replaceAll("[a-z]", "*");
        System.out.println("Message 7 = "+replace2);
        System.out.println("------------------");

        String substring = replace2.substring(0,5).replace("HELLO","AAAAA");
        System.out.println("Message 8 ="+substring);
        System.out.println("------------------");

        String[] split = trim.split("name");
        System.out.println(Arrays.toString(split));
        System.out.println("------------------");

        boolean hello = trim.startsWith("Hello");
        System.out.println("Message 8 = "+hello);
        System.out.println("Message 9 = "+trim.endsWith("n"));
        System.out.println("Message 10 = "+trim.endsWith("tn"));


    }
}
