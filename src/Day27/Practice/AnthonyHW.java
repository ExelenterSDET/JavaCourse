package Day27.Practice;

import java.util.Arrays;

public class AnthonyHW {
    /*
    1. Create a method that will take two Strings parameter.
    Method will convert both string to lower case and check if two string are equal.
    return value boolean
     */

    static boolean stringAreEqual(String s1, String s2){
        return s1.toLowerCase().equals(s2.toLowerCase());
    }

        /*
        Create a method which will have two parameters. String string... args.
        Method will count how many strings are in the args. return type, int
         */

    static int countStrings(String str, String ...args){
        int count=0;
        //for(int i = 0; i <args.length; i++ ){
        for (String arg: args){
            count+= stringAreEqual(str, arg) ?  1:0;
        }
        return count;
    }
    static void countEachString(String... args){
        String storageOutput = "";
        for (int i = 0; i < args.length; i++) {
            int countOfAString = countStrings(args[i], args);
            String tempStorage = args[i].toLowerCase() + " = " + countOfAString + "; ";
            storageOutput += storageOutput.contains(tempStorage) ? "" : tempStorage;
        }
        System.out.println(storageOutput);

        /*
       Create a void method which will have one parameter with String... args.
        Count how many times each string repeats.
        aba, cat, aba, bad, CAT, CAt, aba, bad, Bad, cat, aba, ABA, bAD, bAd
        aba = 5
        bad = 5
        cat = 4

        a a a b b b b b b a b b b
         */

    }
    static String[] stringArraysToLowerCase(String... args){
        String [] arr =  new String[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] =  args[i].toLowerCase();
        }
        return arr;
    }

    static void countEachString2(String... args){
        String[] lowerCaseArr = stringArraysToLowerCase(args);
        Arrays.sort(lowerCaseArr);
        String storageOutput = "";
        for (int i = 0; i < lowerCaseArr.length-1; i++) {
            if(stringAreEqual(lowerCaseArr[i], lowerCaseArr[i+1])){
                continue;
            }
            int count = countStrings(lowerCaseArr[i], lowerCaseArr);
            storageOutput += lowerCaseArr[i].toLowerCase() + " = " + count + "; ";
        }
        storageOutput += lowerCaseArr[lowerCaseArr.length-1].toLowerCase() + " = " + countStrings(lowerCaseArr[lowerCaseArr.length-1], args) + "; ";
        System.out.println(storageOutput);
    }

    public static void main(String[] args) {

        countEachString("aba", "cat", "aba", "bad", "cAT", "cAt", "aba", "bad", "bad", "cat", "aba", "aBA", "bAD", "bAd");
        countEachString2("Aba", "Cat", "aba", "Bad", "cAT", "cAt", "aba", "bad", "bad", "cat", "aba", "aBA", "bAD", "bAd");

    }

}
