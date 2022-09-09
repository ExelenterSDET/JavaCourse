package Day22.Practice.Andrea.Day22;

public class HomeworkTask3 {
    public static void main(String[] args) {

    // 3. Create a method which will take as a parameter int[] and print total of all numbers in the array (name of the method - getTotal)
        int[] numArray = {5, 44, -3, 36, 25};
        getTotal(numArray);
}
        static void getTotal(int[] arr){
            int total = 0;
            for (int j : arr) {
                total += j;
            }
            System.out.println("Total = " + total);
        }
}