package Day39.Practice.Anthony.GroupProject8.Task4;

import java.util.Arrays;

public class Task4Anthony {

    /*
    Task 4
        Given an array of Strings.
        Create a method, that will sort this array of Strings in ascending order.

       !!!!!!!! NOTE: Do not use any of built-in sort methods => (Arrays.sort, Collection.sort etc.) !!!!!!!!!
     */
//    public static String main(String[] args) {
////        String [] arr = {"b","a","c","d"};
//
//        String str = "";
//        char[] array = str.toCharArray();
//        int maxCount = 1;
//        char maxChar = array[0];
//        for (int i = 0, j=0; i <str.length() -1; i= j) {
//            int count =1;
//            while(++j < str.length() && array[i] == array[j]){
//                count++;
//            }
//            if(count>maxCount){
//                    maxCount=count;
//                    maxChar=array[i];
//                }
//            }
//            return (maxChar + " = "+ maxCount);
//        }
//    }

    // Main driver method
    public static void main(String[] args) {
        System.out.println("==============================  TASK4  ====================================");

        String str = "zxxtybnaeuiankrnybdkrjaaaa";//need to add substring to capture CAPS and lowercase
        System.out.println("Original String = " +str);
        System.out.println("Setting Original String to array = " + Arrays.toString(str.toCharArray()));


        char arr[] = str.toCharArray();

        char temp;

        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        System.out.println("Sorted Original String to array = " + Arrays.toString(arr));
    }
}


