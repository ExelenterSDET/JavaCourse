package Day19.Practice;

import java.util.Arrays;

public class Andrea {
    public static void main(String[] args) {
        String[] strArray = {"Andrea", "Anthony", "Arthur", "Bakhriddin"};

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);

        }

        //Task 1
        int total = 0;
        int[] intArray = {12, 10, 23, 5, 0, 87};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            total += intArray[i];
        }
        System.out.println("total = " + total);

        System.out.println("");

        //Task1 Write a Java program to test if an array contains a specific value.
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        int n = 1472;
        for (int i = 0; i < my_array1.length; i++) {
            if (my_array1[i] == n) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        //Task2 Write a Java program to calculate the average value of array elements.
        int [] numArr = {12, 35, 58, 78, 96, 12};
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        System.out.println("avg = " + (double) sum/(numArr.length));

        //enhanced array for loop

        String [] strArr2 = {"Andrea", "Anthony", "Arthur", "Bakhriddin"};

        for(String eachElement : strArr2){
            System.out.println("eachElement = " + eachElement);
        }

        String [] strArr = {"$50", "$150", "$5", "$18", "$25"};

        /*Task4
        Remove dollar sign from array elements and print updated array;
        output = "50", "150", "5", "18", "25"  9:35
        * */
        for (String s : strArr) {
            System.out.print(s.replace("$", "") + " ");
        }

        System.out.println("");
        for (int i = 0; i < strArr.length   ; i++) {
            strArr[i] = strArr[i].replace("$", "");
        }
        System.out.println("Array = " + Arrays.toString(strArr));

        System.out.println("");
        System.out.println("_________________________________________");

        //task 5
        int total1 = 0;
        double average = 0;

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].replace("$", "");
            total1 += Integer.parseInt(strArr[i]);
        }
        average = (double) total1/strArr.length;
        System.out.println("average = " + average);;
        System.out.println("total1 = " + total1);
    }
}
