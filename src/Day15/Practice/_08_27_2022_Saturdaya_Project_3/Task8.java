package Day15.Practice._08_27_2022_Saturdaya_Project_3;

public class Task8 {

    public static void main(String[] args) {

                /*Task8.
Using scanner, create a number.
If number is palindromic, return true. else, return false.
Note: Palindromic number is the number, that remains the same when its digits are reversed.
Example:
12321 => true
12344321 => true
1236541 => false
*/

        int number = 45854;  // res = res*10+number%10  number /= 10;

        // 1st way

        String nSTR = String.valueOf(number);
        int index = nSTR.length()-1;
        String res = "";

        for (int i = index; i >= 0; i--) {
            res += nSTR.charAt(i);
        }
        System.out.println(res.equals(nSTR));
    }
}
