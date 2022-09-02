package Day19.Java;

public class Task3 {

    public static void main(String[] args) {
                /*Task3
        //Task2 Write a Java program to calculate the average value of array elements.
        int [] numArr = {12, 35, 58, 78, 96, 12};
        * */

        int [] numArr = {12, 35, 58, 78, 96, 12};
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }

        System.out.println("My Average: " + (double) sum/numArr.length);

    }
}
