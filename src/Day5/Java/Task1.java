package Day5.Java;

public class Task1 {

    public static void main(String[] args) {

        // Question1
        int i = 5;
        i++; // 5, to be incremented
        --i; // 6, and with pre-decrement changed to 5
        i--; // 5, to be decremented
        i++; // 4, to be incremented
        ++i; // 5, with preincrement it is 6;
        i--; // 6, to be decremented
        System.out.println("Result => " + ++i); // 5 with preincrement ==> 6

        // Question2
        int j = 10;
        j++; // 10, to be inc
        ++j; // 11 with preinc 12
        j++; // 12, to be inc
        j+=5; // 13+5 = 18
        ++j; // 19
        System.out.println("Result1 = " + j); // 19
        System.out.println("Result2 = " + (j % 3)); // 3*6 = 18, 19-18 = 1

    }
}
