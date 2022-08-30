package Day16.Java;

public class Task4 {

    /*
   from 1 up to 10, print in one column all odd numbers, in the second column all even numbers.
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i+=2) {
            int j= i+1;
            System.out.println(i + "  " +j);
        }
    }
}
