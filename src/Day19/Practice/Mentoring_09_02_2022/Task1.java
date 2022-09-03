package Day19.Practice.Mentoring_09_02_2022;

public class Task1 {

    public static void main(String[] args) {
        /*Task1
         * Write a Java program to find
         * the number of even and odd integers
         *  in a given array of integers {25, 71, 0, 40, 99};
         * */

        int [] iArr = {25, 71, 0, 40, 99};
        int evenCounter = 0;

        for (int i : iArr) {
            evenCounter += i%2 == 0 ? 1 : 0;
        }
        System.out.println("evenCounter = " + evenCounter);
        System.out.println("oddCounter = " + (iArr.length - evenCounter));
    }
}
