package Day39.Practice.Arthur39Package;

//Task 4
//        Given an array of Strings.
//        Create a method, that will sort this array of Strings in ascending
//        order.
//
//       !!!!!!!! NOTE: Do not use any of built-in sort methods =>
//       (Arrays.sort, Collection.sort etc.) !!!!!!!!!


import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        String dummy;
        Boolean sorted = false;
        int iterator = 0;


        String[] arr = {"xenomorph","harve","ben","harold","dover","alip","async"};

        while(!sorted){

            if(arr[iterator].compareToIgnoreCase(arr[iterator+1])>0){
                dummy = arr[iterator+1];
                arr[iterator+1]=arr[iterator];
                arr[iterator]=dummy;
                iterator=-1;
            }
            iterator++;
            if(iterator==arr.length-1){
                sorted = true;
            }
        }
        System.out.println(Arrays.toString(arr));




    }
}
