package Day22.Java;

public class Task1 {

    /*
    Create a method which will have parameter as int[].
    Print all values of array.
     */
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};
        Task1 ts = new Task1();
        ts.printArray(arr);

    }

    void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
