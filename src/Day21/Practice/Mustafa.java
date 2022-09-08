package Day21.Practice;

import java.util.Arrays;
import java.util.Random;

public class Mustafa {
    public static void main(String[] args) {
         /*
        1. Initialize 2DArray.
        2. Print without for loop.
        Michael Jordan
        John Travolta
        Jim Kerry
         */
        System.out.println("Task1");
        String[] names = {"Michael", "John", "Jim"};
        String[] lastNames = {"Jordan", "Travolta", "Kerry"};
        String [][] fullName = new String[2][];

        fullName[0] = names;
        fullName[1] = lastNames;

        System.out.println(fullName[0][0] +" "+ fullName[1][0]);
        System.out.println(fullName[0][1] +" "+ fullName[1][1]);
        System.out.println(fullName[0][2] +" "+ fullName[1][2]);
 /*
        Task2
        Print same result using for loop
        Hint: you don`t have to use nested loop.
         */

        System.out.println("Task2");
        for (int i = 0; i < names.length; i++) {
            System.out.println(fullName[0][i] +" "+ fullName[1][i]);
        }

 /*
        Task3
        Print same result using nested for loop
         */
        System.out.println("Task3");

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < lastNames.length; j++) {
                System.out.println(fullName[0][i] +" "+ fullName[1][j]);
                break;
            }

        }

         /*
        Task4
        Create an int 2D array. length of rows is 4, length of columns is 3
        using random class, assign values to each element between 0 and 10
         */
        System.out.println("TASk4");

        int [][] arr = new int[4][3];

        Random random = new Random();

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }

        }
        System.out.println("arr = " + Arrays.deepToString(arr));
        System.out.println("Task 5");
        //Task2
        // Create another array, of 2D arrays length.
        // values, should be total of inner of 2d arrays.
        // Example:
        //[[7, 6, 8, 9, 8], [6, 6, 9, 6, 3], [0, 6, 5, 5, 3], [6, 6, 7, 5, 7]]
        // output:
        //[38, 30, 19, 31]

        int [] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            arr1[i] = total;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("HOMEWORK--------------------------------------------------");
        /*String[][] arr = {{"apple", "watermelon", "grapes"},
                {"math", "geometry", "chemistry","science","algebra"},
                {"london", "istanbul", "washington", "mexico"}};
        Return all string in the camel case format.
                example: apple => Apple, math => Math, london => London*/
        String[][] arr3 = {{"apple", "watermelon", "grapes"},
                {"math", "geometry", "chemistry","science","algebra"},
                {"london", "istanbul", "washington", "mexico"}};

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j].substring(0,1).toUpperCase() + arr3[i][j].substring(1));
            }
        }
    }
}
