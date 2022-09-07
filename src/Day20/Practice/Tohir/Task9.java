package Day20.Practice.Tohir;
import java.util.Arrays;
public class Task9 { public static void main(String[] args) {
    // Given an array of [6,5,2,7,0,1,3,8,6,2,1,3,7,9,0]
    //        1. Sort an array. output should be [0, 0, 1, 1, 2, 2, 3, 3, 5, 6, 6, 7, 7, 8, 9]
    //        2. Remove all duplicates from the array and print.
    //        output should be [1, 2, 3, 4, 5, 6, 7, 8, 9]

    int numarr [] = {6,5,2,7,0,1,3,8,6,2,1,3,7,9,0};
    System.out.println("Arrays = " + Arrays.toString(numarr));
    String str = "";
    Arrays.sort(numarr);
    System.out.println("Arrays = " + Arrays.toString(numarr));
    for (int i = 0; i < numarr.length-1; i++) {
        if(numarr[i] != numarr[i+1]){
            str = str.concat(String.valueOf(numarr[i])+",");
        }
    }
    if(numarr[numarr.length-2]!=numarr[numarr.length-1]) {
        str = str.concat(String.valueOf(numarr[numarr.length-1]+""));
    }
    //System.out.println("numarr2 = " + str);
    String[] split = str.split(",");
    System.out.println("Arrays = " + Arrays.toString(split));


}
}
