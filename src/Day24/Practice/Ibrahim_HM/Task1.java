package Day24.Practice.Ibrahim_HM;

public class Task1 {
    /*
    1. Create a method named as reversedData. The method accepts a non-null or non-empty String as a parameter. Return a reverse of the String.
    2. Create a method named as isPalindrome. The method returns boolean and checks if the given String as parameter is Palindrome or not.
    3. Create a method named as reversedData. The method accepts an int as a parameter. Return a reverse of the int.
    4. Create a method named as reversedData. The method returns boolean and checks if the given int as parameter is Palindrome or not.

notes:
    1.Palindrome means a word or number reads the same backward as forward like "mom" ,     "refer" ,     "131" , "1221", 37573, 200002.
    2. Use method overloading.
    3. Reuse created methods.
     */

    String reversedData(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }

    Boolean isPalindrome(String str){
        return str.equals(reversedData(str));
    }

    String reversedData(int i){
        return  reversedData(String.valueOf(i));
    }

    Boolean isPalindrome(int i){
        return String.valueOf(i).equals(reversedData(i));
    }


    public static void main(String[] args) {
        Task1 t1 = new Task1();

        String s = "Hello World";
        int i = 14533541;
        System.out.println(t1.reversedData(s));
        System.out.println(t1.isPalindrome(s));
        System.out.println(t1.reversedData(i));
        System.out.println(t1.isPalindrome(i));
    }
}
