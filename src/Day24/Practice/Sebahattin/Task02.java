package Day24.Practice.Sebahattin;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
/*      1. Create a method named as getStringLength. Method accepts a String parameter. Returns the length of the String.
        2. Create a method named as longestStringLength. Method accepts a String[] parameter. Returns the length of the longest String.
        3. Create a method named as formatString. Method accepts a String parameter. Method should format any type of a String to CamelCase and return a String.
            Example: "java" => "Java", "JAVA" => "Java", "JaVa" => "Java"
        4. Create a method named as formatStringArray. Method accepts a String[] parameter. Method should format all Strings within array to CamelCase and return a String[].
        5. Create a method named as longestStrings. Method accepts a String[] parameter. Format all Strings within array to Camel Case.  Return the array with the longest Strings.
        Example:
        {"JaVa", "iS", "FUN"} should return {"Java"} => since we have 1 String with the longest length of 4
        {"JAVA", "is", "fUn", "i", "loVE", "javA"} should return {"Java", "Love", "Java"} => since we have 3 Strings with the longest length of 4.
*/
        Task02 ts = new Task02();
        String str = "hello.";
        String[] arr = {"apple", "baNaNa", "strowBery", "peacH"};

        System.out.println("String length --> "+ts.getStringLength(str));
        System.out.println("The length of the longest String --> "+ts.longestStringLength(arr));
        System.out.println(ts.formatString(str));
        System.out.println(Arrays.toString(ts.formatStringArray(arr)));
        System.out.printf(ts.longestStrings(arr));
    }
    int getStringLength (String str){
        return str.length();
    }
    int longestStringLength (String... arr){
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if(length < getStringLength(arr[i])){
                length = getStringLength(arr[i]);
            }
        }
        return length;
    }
    String formatString (String str){
        str = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        return str;
    }
    String[] formatStringArray (String[] str){
        for (int i = 0; i < str.length; i++) {
            str[i] = formatString(str[i]);
        }
        return str;
    }
    String longestStrings(String arr[]){
        arr = formatStringArray(arr);
        String ss = "";
        int x = longestStringLength(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == x){
                ss = ss.concat("" +arr[i]);
            }
        }
        return ss;
    }
}
