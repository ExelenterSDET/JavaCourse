package Day48.Practice.SP.mentoring_10_14;
//// Find smallest number in array and find the largest number in the same array (using loop)
//reverse String; Hello -> olleH
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
        if(arr[i] < min){
            min = arr[i];
        }
    }
    return min;
}

    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 1, 6, 8, 9, 10};
        int largestNumber = findLargestNumber(arr);
        System.out.println("largestNumber = " + largestNumber);
        System.out.println();
        int smallestNumber = findSmallestNumber(arr);
        System.out.println("smallestNumber = " + smallestNumber);
    }
    static int[] numberRevealNumbers(int[] arr) {
        int mini = arr[0];
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < mini) {
                mini = arr[i];
            } else if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        int[] array = new int[2];
        array[0]=mini;
        array[1]=maxi;

        return array;
    }
}
