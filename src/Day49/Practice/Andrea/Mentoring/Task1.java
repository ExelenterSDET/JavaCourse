package Day49.Practice.Andrea.Mentoring;

public class Task1 {

    static int findLargestNumber(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


    static int findSmallestNumber(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {1,5,34,8,2,0,-1};
        String str = "hello";
        System.out.println(findLargestNumber(array));
        System.out.println(findSmallestNumber(array));
        System.out.println(reverseString(str));
    }

    static String reverseString(String str){
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }



}


