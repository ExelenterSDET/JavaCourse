package Day22.Practice.Andrea.Day22;

public class HomeworkTask1 {
    public static void main(String[] args) {

        // 1. Create a method which will take as a parameter int[] and print maximum number in the given array (name of the method - getMaxNum)

        int[] numArray = {5, 44, -3, 36, 25};
        getMaxNum(numArray);
    }
    static void getMaxNum(int[] arr){
        int maxNum = arr[0];
        for (int j : arr) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        System.out.println("maxNum = " + maxNum);
    }
}
