package Day16.Java;

public class Task5 {

    /*
    return count of numbers divisible by 8 between 0 and 100
     */

    public static void main(String[] args) {

        int counter = 0;
        for (int i = 8; i < 100; i += 8) {
            counter++;
        }
        System.out.println("counter = " + counter);
    }
}
