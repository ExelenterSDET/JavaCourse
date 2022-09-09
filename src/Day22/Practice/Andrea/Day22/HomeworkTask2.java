package Day22.Practice.Andrea.Day22;

public class HomeworkTask2 {
    public static void main(String[] args) {
        // 2. Create a method which will take as a parameter int[] and print minimum number in the given array (name of the method - getMinNum)

    int[] numArray = {5, 44, -3, 36, 25};
    getMinNum(numArray);
}
    static void getMinNum(int[] arr){
        int minNum = arr[0];
        for (int j : arr) {
            if (j < minNum) {
                minNum = j;
            }
        }
        System.out.println("minNum = " + minNum);
    }
}
