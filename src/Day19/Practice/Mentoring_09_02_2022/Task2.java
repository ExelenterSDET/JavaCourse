package Day19.Practice.Mentoring_09_02_2022;

public class Task2 {
    public static void main(String[] args) {
        /*
        *Task2
         * Create integer array {32, 17, 58, 42, 5}
         * Using Enhanced For Loop search specific number inside the array
         * If array contains that number return true, otherwise return false
         * Example: number = 12
         * Output: false
         * */

        int [] iArr = {32, 17, 58, 42, 5};
        int n = 17;
        boolean hasMyNumber = false;

        for (int i : iArr) {
            if (i == n){
                hasMyNumber = true;
            }
        }

        System.out.println("hasMyNumber = " + hasMyNumber);
    }
}
