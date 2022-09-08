package Day21.Practice;

import java.util.Arrays;

public class Anthony {
/*
    Homework:
    String[][] arr = {{"apple", "watermelon", "grapes"},
            {"math", "geometry", "chemistry","science","algebra"},
            {"london", "istanbul", "washington", "mexico"}};
    Return all string in the camel case format.
            example: apple => Apple, math => Math, london => London

 */

    public static void main(String[] args) {
        String[][] arr = {{"apple", "watermelon", "grapes"},
                {"math", "geometry", "chemistry","science","algebra"},
                {"london", "istanbul", "washington", "mexico"}};

        System.out.println("Array form = " + Arrays.deepToString(arr));

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = arr[i][j].substring(0,1).toUpperCase()+arr[i][j].substring(1);
                System.out.print(arr[i][j].substring(0,1).toUpperCase()+arr[i][j].substring(1)+ ", ");

            }
            System.out.println(" ");

        }
        System.out.println("Array form = " + Arrays.deepToString(arr));
    }
}
