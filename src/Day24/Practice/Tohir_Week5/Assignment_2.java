package Day24.Practice.Tohir_Week5;

import java.util.Arrays;

public class Assignment_2 {
    //Task2
    //
    //1. Create a method named as getStringLength. Method accepts a String parameter. Returns the length of the String.
    //2. Create a method named as longestStringLength. Method accepts a String[] parameter. Returns the length of the longest String.
    //3. Create a method named as formatString. Method accepts a String parameter. Method should format any type of a String to CamelCase and return a String. Example: "java" => "Java", "JAVA" => "Java", "JaVa" => "Java"
    //4. Create a method named as formatStringArray. Method accepts a String[] parameter. Method should format all Strings within array to CamelCase and return a String[].
    //5. Create a method named as longestStrings. Method accepts a String[] parameter. Format all Strings within array to Camel Case.  Return the array with the longest Strings.
    //Example:
    //{"JaVa", "iS", "FUN"} should return {"Java"} => since we have 1 String with the longest length of 4
    //{"JAVA", "is", "fUn", "i", "loVE", "javA"} should return {"Java", "Love", "Java"} => since we have 3 Strings with the longest length of 4.
    public static void main(String[] args) {
        Assignment_2 asg = new Assignment_2();
        String [] str = {"JaVa", "iS", "FUN"};
        System.out.println("str = " +asg.longestStringLength(str));
        String str1 = "ManAS";
        System.out.println("asg.formatString(str1) = " + asg.formatString(str1));
        String str2[] = {"JaVa", "iS", "FUN","MadamM"};
        String s [] = asg.formatStringArray(str2);
        System.out.println("str2 = " + Arrays.toString(s));
        System.out.println("asg.longestStringLength(str2) = " + asg.longestStrings(str2));

    }
    int getStringLength(String str){
        return str.length();
    }//1
    int longestStringLength(String[] str){
        int len = 0;
        for (int i = 0; i < str.length; i++) {
            if(len < getStringLength(str[i])){
                len = getStringLength(str[i]);
            }
        }
        return len;
    }//2
    String formatString(String str)//3
    {    
        str = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        return str;            
        }
    String[] formatStringArray(String str[])//4
    {
       for (int i = 0; i < str.length; i++) {
           str[i] = formatString(str[i]);
        }
        return str;
    }
    String longestStrings(String str[])//5
    {
     str = formatStringArray(str);
     String ss = "";
     int a = longestStringLength(str);
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == a){
                ss = ss.concat(" " +str[i]);
            }                
        }
        return ss;
    }
}
