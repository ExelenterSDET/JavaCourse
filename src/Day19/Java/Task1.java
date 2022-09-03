package Day19.Java;

public class Task1 {

    public static void main(String[] args) {

        // Task1 Create integer array 12, 10, 23, 5, 0, 87
        // Print each element of the array
        // Print the total of the numbers in array

        int [] intArr = { 12, 10, 23, 5, 0, 87};


        int sum = 0;

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
            sum += intArr[i];
        }
        System.out.println("sum = " + sum);
    }
}
