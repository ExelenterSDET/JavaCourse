package Day19.Practice.Bakhridin;

public class JavaArraysForLoop {
    public static void main(String[] args) {
//        String strArr[] = {"Andrea", "Anthony","Arthur","Bakhridin","Mustafa"};
//
//        for (int i = 0; i < strArr.length; i++) {
//            System.out.println(strArr[i]);
//
//        }
//  int sum=0;
//        int a[] = {12, 10, 23, 5, 0, 87};
//
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(" "+a[i]);
//             sum+=a[i];
//
//        }
//        System.out.println();
//        System.out.println("sum = " + sum);
//
//        //Task1 Write a Java program to test if an array contains a specific value.
//        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
//                1458, 2458, 1254, 1472, 2365,
//                1456, 2265, 1457, 2456};
//
//        int n=1789;
//        for (int i = 0; i < my_array1.length; i++) {
//            System.out.println(n==(my_array1[i]));

//
//        }

        //Task3 Write a Java program to calculate the average value of array elements.
        int[] numArr = {12, 35, 58, 78, 96, 12};
        double totalOfCalculate = 0.0;

        for (int i = 0; i < numArr.length; i++) {

            totalOfCalculate += numArr[i];

        }
        System.out.println("totalOfCalculate = " + (totalOfCalculate / numArr.length));
    }
}
