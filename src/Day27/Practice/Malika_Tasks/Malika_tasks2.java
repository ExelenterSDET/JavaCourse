package Day27.Practice.Malika_Tasks;

public class Malika_tasks2 {
    public static void main(String[] args) {
        //TASK1
        /*1. Create a method that will take two String parameters.
                Method will convert both string to lower case and check if two string are equal.
        Return value is boolean.*/
    }
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
            if (stringsToLowerCaseAreEqual(s,arg)){
                count++;
            }
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


}

