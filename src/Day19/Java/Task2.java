package Day19.Java;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

                /*Task2

        Write a Java program to test if an array contains a specific value.
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
                int n = 1789;
                Output: true
        * */

        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};

        Random rnd = new Random();
        int n = 0;

        n = rnd.nextInt(1700, 2500);
        boolean hasNumber = false;
        System.out.println("n = " + n);

        for (int i = 0; i < my_array1.length; i++) {
            if (my_array1[i] == n){
                hasNumber = true;
            }
        }
        System.out.println("hasNumber = " + hasNumber);

        for (int i = 0; i < my_array1.length; i++) {

            hasNumber = my_array1[i] == n ? true : false;
        }
        System.out.println("hasNumber with Ternary = " + hasNumber);
    }
}
