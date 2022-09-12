package Day24.Practice.Sebahattin;

public class Task01 {
    /*Task1.

    1. Create a method named as reversedData. The method accepts a non-null or non-empty String as a parameter. Return a reverse of the String.
    2. Create a method named as isPalindrome. The method returns boolean and checks if the given String as parameter is Palindrome or not.
    3. Create a method named as reversedData. The method accepts an int as a parameter. Return a reverse of the int.
    4. Create a method named as reversedData. The method returns boolean and checks if the given int as parameter is Palindrome or not.

notes:
    1.Palindrome means a word or number reads the same backward as forward like "mom" ,     "refer" ,     "131" , "1221", 37573, 200002.
    2. Use method overloading.
    3. Reuse created methods.

 */
    public static void main(String[] args) {
        String str1 = "exelenterretnelexe";
        int num = 125521 ;
        System.out.println(reversedData(str1));
        System.out.println(isPalindrome(str1));
        System.out.println(reversedData(num));
        System.out.println(isPalindrome(num));
    }
    static String reversedData (String str){
        String strNew = "";
        for (int i = str.length()-1; i >= 0; i--) {
            strNew += (str.charAt(i));
        }
        if (str == ""){
            strNew = "Enter String!!!";
        }
        return strNew;
    }
    static boolean isPalindrome(String str1){
        return str1.equals(reversedData(str1));
    }
    static int reversedData (int num){
        String numStr = String.valueOf(num);
        String numStr2 ="";
        for (int i = numStr.length()-1; i >= 0 ; i--) {
            numStr2 += numStr.charAt(i);
        }
        int numStrNum= Integer.parseInt(numStr2);
        return numStrNum;
    }
    static boolean isPalindrome (int num){
        return num == reversedData(num);
    }
}
