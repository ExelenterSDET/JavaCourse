package Day24.Practice.Ibrahim_HM;

import java.util.Arrays;

public class Task2 {
    /*
    1. Create a method named as getStringLength. Method accepts a String parameter. Returns the length of the String.
    2. Create a method named as longestStringLength. Method accepts a String[] parameter. Returns the length of the longest String.
    3. Create a method named as formatString. Method accepts a String parameter. Method should format any type of a String to CamelCase and return a String. Example: "java" => "Java", "JAVA" => "Java", "JaVa" => "Java"
    4. Create a method named as formatStringArray. Method accepts a String[] parameter. Method should format all Strings within array to CamelCase and return a String[].
    5. Create a method named as longestStrings. Method accepts a String[] parameter. Format all Strings within array to Camel Case.  Return the array with the longest Strings.
    Example:
    {"JaVa", "iS", "FUN"} should return {"Java"} => since we have 1 String with the longest length of 4
    {"JAVA", "is", "fUn", "i", "loVE", "javA"} should return {"Java", "Love", "Java"} => since we have 3 Strings with the longest length of 4.
     */

    static int getStringLength (String  str){
        return str.length();
    }
    static  int longestStringLength(String[]  args){

        int longestString = 0;
        for (String arg : args) {
            if (arg.length() > longestString) {
                longestString += arg.length();
            }
        }
        return longestString;
    }
    static String formatString (String s){
        return s = (s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase());
    }
    static String[] formatStringArray(String[] arr){

        for (int i = 0; i < arr.length; i++) {
        arr[i] = formatString(arr[i]);
        }
        return arr;
    }

    static String  longestStrings (String[] args){
        formatStringArray(args);
        int longestLen = longestStringLength(args);
        String longesttext = "";

        for (String arg : args) {
            if (getStringLength(arg) == longestLen){
                longesttext += arg + " ";
            }
        }
        return longesttext;
    }




    public static void main(String[] args) {
        String s = "HELLO World";
        String[] s1 = {"JaVa", "iS","FUN"};
        String[] s2 = {"JaVa", "iS","FUN", "i", "LOve", "jAvA"};
        String s3 = "jAVA";




        System.out.println(getStringLength(s));
        System.out.println(longestStringLength(s1));
        System.out.println(formatString(s3));
        System.out.println(Arrays.toString(formatStringArray(s1)));
        System.out.println(longestStrings(s2));
    }
}
