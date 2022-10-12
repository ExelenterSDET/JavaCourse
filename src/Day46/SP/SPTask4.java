package Day46.SP;

import java.util.Scanner;

/* 1. Create a method which will print String varargs in the reversed order.
       compile and run using terminal

       Example:
       Input: Java is Fun
       Output: Fun is Java

    2. Create a method which will return boolean
       If provided String is palindrome, return true. Else, return false.
       compile and run using terminal

       Example:
       Input: 123321
       Output: true

    3. Create a methods which will return total length of all Strings.
       compile and run using terminal.

        Example:
        Input: Java is Fun 2005
        Output:  4 + 2 + 3 + 4 = 13*/
public class SPTask4 {

    public static void main(String[] args) {

        Boolean palindrome = isPalindrome2("moma");

        Boolean palindrome3 = isPalindrome3(3113);
        System.out.println(palindrome3);
    }
    static Boolean isPalindrome(){
       Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length()- 1 - i; j >= 0; j--) {
                if(str.charAt(i) != str.charAt(j)){
                    return false;
                }
                else {
                    break;
                }
            }
        }
      return true;
    }
    static Boolean isPalindrome2(String str){
        int start = 0;
        int end = str.length()-1;

        while (start < end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
    static Boolean isPalindrome3(int x){ // way 4 for integers

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int r = 0;
        while (x > r){   // 121
            r = r * 10 + x % 10;  // 12
            x = x / 10;           // 1
        }

        return r == x || r / 10 == x;
    }
}
