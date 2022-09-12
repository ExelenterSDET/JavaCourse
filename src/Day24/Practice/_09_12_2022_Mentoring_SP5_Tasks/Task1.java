package Day24.Practice._09_12_2022_Mentoring_SP5_Tasks;

public class Task1 {

        /*Task1.

    1. Create a method named as reversedData. The method accepts a non-null or non-empty String as a parameter.
     Return a reverse of the String.
    2. Create a method named as isPalindrome. The method returns boolean and checks if the given
    String as parameter is Palindrome or not.
    3. Create a method named as reversedData. The method accepts an int as a parameter.
    Return a reverse of the int.
    4. Create a method named as isPalindrome. The method returns boolean and checks if
    the given int as parameter is Palindrome or not.

    notes:
    1.Palindrome means a word or number reads the same backward as forward like
    "mom" ,     "refer" ,     "131" , "1221", 37573, 200002.
    2. Use method overloading.
    3. Reuse created methods.
    */


    String reversedData(String str){
        String reversed = "";
        //1. way
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        // 2.way
//        int index = str.length()-1;
//        while ( index >= 0){
//            reversed += str.charAt(index--);
//        }

        return reversed;
    }

    boolean isPalindrome(String str){
        return str.equals(reversedData(str));
    }

    int reversedData(int n){
        // 1. way
        int result = 0;
        while (n > 0){
            result = result*10 + n % 10;  // 12345 // 2 iteration
            n /= 10;
        }


        return result;
    }

    boolean isPalindrome(int n){
        return n == reversedData(n);
    }

    public static void main(String[] args) {
        String s = "Java is fun";
        int i = 1;

        Task1 t1 = new Task1();

        System.out.println(t1.reversedData(s));
        System.out.println(t1.isPalindrome(s));

        System.out.println(t1.reversedData(i));
        System.out.println(t1.isPalindrome(i));
    }
}
