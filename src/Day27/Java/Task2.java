package Day27.Java;

public class Task2 {
    /*
    1. Create a method that will take two String parameters.
    Method will convert both string to lower case and check if two string are equal.
    Return value is boolean.

    2. Create a method which will have two parameters. String, String... args.
    Method will count how many Strings are in the args. return type, int

    3. Create a void method which will have one parameter with String... args.
        Count how many times each string repeats.

        aba, cat, aba, bad, CAT, CAt, aba, bad, Bad, cat, aba, ABA, bAD, bAd
        aba = 5
        bad = 5
        cat = 4
     */

    static boolean stringsAreEqual(String s1, String s2){
        return s1.toLowerCase().equals(s2.toLowerCase());
    }

    static int countStrings(String str, String... args){
        int count = 0;
        for (String arg : args) {
//            if(stringsAreEqual(str,arg)){  =====>>>> option 1
//                count++;
//            }
            count += stringsAreEqual(str, arg)? 1:0; // ====>>> option 2

        }
        return count;
    }


}
