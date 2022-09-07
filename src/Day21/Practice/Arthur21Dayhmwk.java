package Day21.Practice;

import java.util.Arrays;

public class Arthur21Dayhmwk {
    public static void main(String[] args) {

        String str = "";

        String arr[][] = {{"apple", "watermelon", "grapes"},
                {"math", "geometry", "chemistry","science","algebra"},
                {"london", "istanbul", "washington", "mexico"}};


        System.out.println("Original array = " + Arrays.deepToString(arr) + "\n");

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {

                arr[i][i1] = arr[i][i1].substring(0,1).toUpperCase().concat(arr[i][i1].substring(1));
            }
        }

        System.out.println("New array = " + Arrays.deepToString(arr));

    }
}
