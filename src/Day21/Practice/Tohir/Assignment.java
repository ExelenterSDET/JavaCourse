package Day21.Practice.Tohir;

import java.util.Arrays;

public class Assignment {
    public static void main(String[] args) {
        //Homework:
        //    String[][] arr = {{"apple", "watermelon", "grapes"},
        //                      {"math", "geometry", "chemistry","science","algebra"},
        //                      {"london", "istanbul", "washington", "mexico"}};
        //    Return all string in the camel case format.
        //    example: apple => Apple, math => Math, london => London
        String[][] arr = {{"apple", "watermelon", "grapes"},
                {"math", "geometry", "chemistry","science","algebra"},
                {"london", "istanbul", "washington", "mexico"}};
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                arr[i][i1] = arr[i][i1].substring(0,1).toUpperCase()+arr[i][i1].substring(1);
            }
        }
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));
    }
}
