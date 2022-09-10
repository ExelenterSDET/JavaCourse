package Day24.Practice.Tohir_Week5;

import javax.xml.transform.sax.SAXResult;
import java.util.Arrays;

public class Assignment_1 {
    //Task1. 
    //
    //    1. Create a method named as reversedData. The method accepts a non-null or non-empty String as a parameter. Return a reverse of the String. 
    //    2. Create a method named as isPalindrome. The method returns boolean and checks if the given String as parameter is Palindrome or not. 
    //    3. Create a method named as reversedData. The method accepts an int as a parameter. Return a reverse of the int. 
    //    4. Create a method named as reversedData. The method returns boolean and checks if the given int as parameter is Palindrome or not. 
    //
    //notes: 
    //    1.Palindrome means a word or number reads the same backward as forward like "mom" ,     "refer" ,     "131" , "1221", 37573, 200002. 
    //    2. Use method overloading.
    //    3. Reuse created methods.
    public static void main(String[] args) {
        Assignment_1 asg = new Assignment_1();
        String STR ="MADAM I am adam";
        String STR1 = "121";
        int str1 = 12321;
        System.out.println(" "+asg.reversedData(STR));
        System.out.println(" Palindrome= " +asg.isPalindrome(STR));
        System.out.println(" "+asg.reversedData(STR1));
        System.out.println(" Palindrome= " +asg.isPalindrome(STR1));
        System.out.println(" "+asg.reversedData(str1));
        System.out.println(" Palindrome= " +asg.isPalindrome(str1));

    }
    String reversedData(String s){
        if (s.length()>0) {
            String str = "";
            String[] spl = s.split("");
            for (int i = 0; i < spl.length; i++) {
                    str = str.concat(spl[spl.length-1-i]);
                }
            s = String.valueOf(str);
            }
        return s;
        }
    Boolean isPalindrome(String s){

        return s.equals(reversedData(s));
        }
    int reversedData(int num){
        String s = String.valueOf(num);
        if (s.length()>0) {
            String str = "";
            String[] spl = s.split("");
            for (int i = 0; i < spl.length; i++) {
                str = str.concat(spl[spl.length-1-i]);
            }
            s = String.valueOf(str);
        }
        return Integer.valueOf(s);
    }
    Boolean isPalindrome(int num){

                return num == reversedData(num);
    }
    }

