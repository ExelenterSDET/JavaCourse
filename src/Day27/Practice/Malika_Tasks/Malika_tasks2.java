package Day27.Practice.Malika_Tasks;

import java.util.Arrays;

public class Malika_tasks2 {

        //TASK1
        /*1. Create a method that will take two String parameters.
                Method will convert both string to lower case and check if two string are equal.
        Return value is boolean.*/

    static boolean stringsToLowerCaseAreEqual(String str1, String str2){
        return str1.toLowerCase().equals(str2.toLowerCase());

    }

    //TASK2
    /*2. Create a method which will have two parameters. String, String... args.
    Method will count how many Strings are in the args.
    Return value is integer*/

    static int howManyStrings(String s, String... args){
        int count = 0;
        for (String arg : args) {
            //if (stringsToLowerCaseAreEqual(s,arg)){
                //count++;
            count += stringsToLowerCaseAreEqual(s, arg)? 1:0; // ====>>> option 2
            }

        return count;
    }

    //TASK3
    /*Create a void method which will have one parameter with String... args.
    Count how many times each string repeats.

            aba, cat, aba, bad, CAT, CAt, aba, bad, Bad, cat, aba, ABA, bAD, bAd
            aba = 5
            bad = 5
            cat = 4 */

    static void countEachString(String... args){
        String storageOutput = "";
        for (int i = 0; i < args.length; i++) {
            int countOfAString = howManyStrings(args[i], args);
            String tempStorage = args[i].toLowerCase() + " = " + countOfAString + "; ";
            storageOutput += storageOutput.contains(tempStorage) ? "" : tempStorage;
        }
        System.out.println(storageOutput);   //First way of solution
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
            if(stringsToLowerCaseAreEqual(lowerCaseArr[i], lowerCaseArr[i+1])){
                continue;
            }
            int count = howManyStrings(lowerCaseArr[i], lowerCaseArr);
            storageOutput += lowerCaseArr[i].toLowerCase() + " = " + count + "; ";
        }
        storageOutput += lowerCaseArr[lowerCaseArr.length-1].toLowerCase() + " = " + howManyStrings(lowerCaseArr[lowerCaseArr.length-1], args) + "; ";
        System.out.println(storageOutput); //Second way of solution
    }

    public static void main(String[] args) {

        countEachString("aba", "cat", "aba", "bad", "cAT", "cAt", "aba", "bad", "bad", "cat", "aba", "aBA", "bAD", "bAd");
        countEachString2("Aba", "Cat", "aba", "Bad", "cAT", "cAt", "aba", "bad", "bad", "cat", "aba", "aBA", "bAD", "bAd");

    }


}

