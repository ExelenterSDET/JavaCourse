package Day22.Practice;

public class AnthonyTask1 {

    /*
  Create a method which will have parameter as int[].
  Print all values of array.
   */

    public static void main(String[] args) {
        System.out.println("-----------------------TASK 1 --------------------------------");

        int[] arr = {1, 3, 5, 7, 9};
        myTask1(arr);

    }

    static void myTask1(int a[]) {
        for (int b : a) {
            System.out.print(b);
        }
    }

}

