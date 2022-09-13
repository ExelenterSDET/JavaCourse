package Day24.Practice._09_12_2022_Mentoring_SP5_Tasks;

public class Task2 {
        /*Task2

1. Create a method named as getStringLength. Method accepts a String parameter.
Returns the length of the String.
2. Create a method named as longestStringLength.
Method accepts a String[] parameter. Returns the length of the longest String.
3. Create a method named as formatString. Method accepts a String parameter.
Method should format any type of a String to CamelCase and return a String.
Example: "java" => "Java", "JAVA" => "Java", "JaVa" => "Java"
4. Create a method named as formatStringArray. Method accepts a String[] parameter.
Method should format all Strings within array to CamelCase and return a String[].
5. Create a method named as longestStrings. Method accepts a String[] parameter.
Format all Strings within array to Camel Case.  Return the array with the longest Strings.
Example:
{"JaVa", "iS", "FUN"} should return {"Java"} => since we have 1 String with the longest length of 4
{"JAVA", "is", "fUn", "i", "loVE", "javA"} should return {"Java", "Love", "Java"} => since we have 3 Strings with the longest length of 4.
*/

    int getStringLength (String str){
        return str.length();
    }
    int longestStringLength(String [] arr){   // {"Java","fun","is",}
        int len = 0;
        for (String s : arr) {
            if (s.length() > len){
                len = getStringLength(s);
            }
        }
        return len;
    }
    String formatString(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
    String [] formatStringArray(String [] arr){  // {"Java","fun","is", "Java"}
        for (int i = 0; i < arr.length; i++) {
            arr[i] = formatString(arr[i]);
        }
        return arr;
    }

    String [] longestStrings(String [] arr){
        arr = formatStringArray(arr);
        int longestLen = longestStringLength(arr);
        String longestText = "";

        for (String s : arr) {
            if (getStringLength(s) == longestLen ){
                longestText += s + " "; // fund java home
            }
        }
        return longestText.split(" ");
    }
}
