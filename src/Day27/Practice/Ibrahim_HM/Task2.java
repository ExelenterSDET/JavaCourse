package Day27.Practice.Ibrahim_HM;


import java.util.Arrays;

public class Task2 {
     /*
       1. Create a method that will take two String parameters.
       Method will convert both string to lower case and check if two string are equal.
       Return value is boolean.

       2. Create a method which will have two parameters. String, String... args.
       Method will count how many Strings are in the args. Return int
       3. Create a void method which will have one parameter with String... args.
       Count how many times each string repeats.

       aba, cat, aba, bad, CAT, CAt, aba, bad, Bad, cat, aba, ABA, bAD, bAd
       aba = 5
       bad = 5
       cat = 4
    */


    public static boolean isEqual(String str, String str2){
        return str.equalsIgnoreCase(str2);
    }

    public static int countString(String str, String... args){
        int counter = 0;
        for (String arg : args) {
            counter += isEqual(str, arg) ? 1 : 0;
        }
        return counter;
    }

    static void allLowerCase(String... args){
        for (int i = 0; i < args.length; i++) {
            args[i] = args[i].toLowerCase();
        }
        Arrays.sort(args);
    }

    public static void  countEachString(String... args){

        allLowerCase(args);
        String lastList = "";
        for (String s : args) {
            String temp = s + " = " + countString(s, args) + "\n";
            lastList += lastList.contains(temp) ? "" : temp;
        }
        System.out.println(lastList);
    }



    public static void main(String[] args) {
        String[] str = {"aba", "cat", "aba", "bad", "CAT", "CAt", "aba", "bad", "Bad", "cat", "aba", "ABA", "bAD", "bAd"};
        String str2 = "aba";
        String str3 = "AbA";


        System.out.println(isEqual(str2, str3));
        System.out.println(countString(str2, str));
        
        countEachString("aba", "cat", "aba", "bad", "CAT", "CAt", "aba", "bad", "Bad", "cat", "aba", "ABA", "bAD", "bAd");
    }
}
