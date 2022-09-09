package Day22.Practice.Andrea.Day22;

import java.util.Arrays;

public class HomeworkTask4 {
    public static void main(String[] args) {

        String[] pets = {"rabbit", "dog", "cat", "hamster", "frog"};
        reversedArray(pets);
    }
    static void reversedArray(String[] arr){
        String[] revArr = new String[arr.length];
        for (int i = arr.length-1, j=0; i >=0; i--, j++) {
            revArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(revArr));
    }
}
