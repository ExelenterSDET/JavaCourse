package Day23.Practice.Day23.Andrea;

public class Task1 {

    public static void main(String[] args) {

        //Task1 task = new Task1();

        int[] numArray = {5, 44, -3, 36, 25};
        int max = getMaxNum(numArray);
        int min = getMinNum(numArray);
        int total = getTotal(max, min);
    }

    static int getMaxNum(int[] arr) {
        int maxNum = arr[0];
        for (int j : arr) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        return maxNum;
    }
    static int getMinNum(int[] arr) {
        int minNum = arr[0];
        for (int j : arr) {
            if (j > minNum) {
                minNum = j;
            }
        }
        return minNum;
    }

    static int getTotal(int a, int b){
        int tot = a+b;
        return tot;
    }

}
