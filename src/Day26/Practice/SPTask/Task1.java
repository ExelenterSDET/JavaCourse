package Day26.Practice.SPTask;

public class Task1 { /*Task1.

    1. Create a method named as reversedData. The method accepts a non-null or non-empty String as a parameter. Return a reverse of the String.
            2. Create a method named as isPalindrome. The method returns boolean and checks if the given String as parameter is Palindrome or not.
    3. Create a method named as reversedData. The method accepts an int as a parameter. Return a reverse of the int.
            4. Create a method named as reversedData. The method returns boolean and checks if the given int as parameter is Palindrome or not.

            notes:
            1.Palindrome means a word or number reads the same backward as forward like "mom" ,     "refer" ,     "131" , "1221", 37573, 200002.
            2. Use method overloading.
    3. Reuse created methods.*/

    static String reverseData(String str){

        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    static boolean isPalindrome(String str) {return str.equals(reverseData(str));}




    public static void main(String[] args) {

        System.out.println(reverseData("Mustafa"));
        System.out.println(isPalindrome("MussuM"));


    }
}
