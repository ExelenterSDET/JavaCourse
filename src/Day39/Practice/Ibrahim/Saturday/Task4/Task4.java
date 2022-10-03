package Day39.Practice.Ibrahim.Saturday.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String[] str = {"Ibrahim", "bayram", "zubeyir", "Mehmet", "dave", "Shanon", "elif"};
        sortArray(str);

    }
    public static String[] sortArray(String[] str){
        String[] newArray = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            newArray[i] = str[i].substring(0,1).toUpperCase() + str[i].substring(1).toLowerCase();
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (newArray[i].charAt(0) < newArray[j].charAt(0) && i != j){
                    String temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        System.out.println("newArray = " + Arrays.toString(newArray));

        return newArray;
    }
}
