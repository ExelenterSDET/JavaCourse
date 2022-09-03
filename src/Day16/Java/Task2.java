package Day16.Java;

public class Task2 {

    public static void main(String[] args) {

        int number = 12321;
        String n = String.valueOf(number);
        // return true, if number is palindromic, false if it is not
        String nReversal = "";

        for (int i = n.length()-1; i >= 0 ; i--) {
            nReversal += n.charAt(i);
        }
        System.out.println(n.equals(nReversal));



    }
}
