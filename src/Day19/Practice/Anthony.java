package Day19.Practice;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class Anthony {
    public static void main(String[] args) {

        System.out.println("TASK 1");
        //Task Create interger arraty 12,10,23, 5,0,87
        //print each element of the array
        //print the total of the numbers in array

        int numberArr[] = new int[6];

        System.out.println(numberArr.length); //in array, we call length funchtion. in the String we call length

        numberArr[0] = 12;
        numberArr[1] = 10;
        numberArr[2] = 23;
        numberArr[3] = 5;
        numberArr[4] = 0;
        numberArr[5] = 87;

        System.out.println("Arrays.stream(numberArr).sum() = " + Arrays.stream(numberArr).sum());

        System.out.println("numberArr " + Arrays.toString(numberArr));

        int[] intArr = {12, 10, 23, 5, 0, 87};
        int sum = 0;
        for (int i = 0; i < intArr.length; i++){
            System.out.println(intArr[i]);
            sum += intArr[i];
        }
        System.out.println("sum ==> " + sum);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("TASK 2");


        //Task2
        // Write a Java program to test if an array contains a specific value.
        //int n = 1789
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};

        Random rnd = new Random();
        int n=0;
        n = 1789;//rnd.nextInt(1700,2500);
        out.println("n = " + n);
        boolean hasNumber = false;
        for (int i = 0; i < my_array1.length ; i++) {
            if(my_array1[i] == n){
                hasNumber= true;
            }
        }
        out.println("hasNumber = " + hasNumber);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("TASK 3");

        //Task3
        //Task2 Write a Java program to calculate the average value of array elements.
        int [] numArr = {12, 35, 58, 78, 96, 12};
        int sum3 =0;

        for (int i = 0; i <numArr.length ; i++) {
            sum3 += numArr[i];
        }
        System.out.println("My Average: " + (double) sum3/ numArr.length);
        System.out.println("TASK3 = " + Arrays.stream(numArr).average());

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("TASK 4");

        String [] strArr = {"$50","$150", "$5" , "$18", "$25"};

        for (String s: strArr){
            System.out.print(s.replace("$"," ")+",");
        }

        System.out.println("\n"+"-------------------------------------------------------------------------------------");
        System.out.println("TASK 5");

        String[] strArr5 = {"$50", "$150", "$5", "$18", "$25"};

        int total = 0;
        double avg = 0;

        for (int i = 0; i < strArr5.length; i++) {
            strArr5[i] = strArr5[i].replace("$", "");

            total += Integer.parseInt(strArr5[i]);
        }
        avg = (double) total/strArr5.length;
        System.out.println("avg = " + avg);
        System.out.println("total = " + total);
        
    }
}
