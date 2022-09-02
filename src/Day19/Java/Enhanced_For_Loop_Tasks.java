package Day19.Java;

import java.util.Arrays;

public class Enhanced_For_Loop_Tasks {
    public static void main(String[] args) {


        String [] strArr = {"$50", "$150", "$5", "$18", "$25"};

        /*Task4
        Remove dollar sign from array elements and print updated array;
        output = "50", "150", "5", "18", "25"  9:35
        * */

        for (String s : strArr) {
            System.out.print(s.replace("$", "") + " ");

        }
        System.out.println();
        System.out.println(Arrays.toString(strArr));
        System.out.println();

        // Task5 Use same string return the total and average  9:52
        int total = 0;
        double avg = 0;

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].replace("$", "");

            total += Integer.parseInt(strArr[i]);
        }

        avg = (double) total/strArr.length;

        System.out.println("Total:" + total);
        System.out.println("avg = " + avg);
    }

}
