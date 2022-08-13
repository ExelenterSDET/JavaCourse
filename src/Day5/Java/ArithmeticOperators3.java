package Day5.Java;

public class ArithmeticOperators3 {

    // Java Increment ==>> increases value of variable by 1 when it is called next time after assignment.
    // Also known as Post Increment

    public static void main(String[] args) {

        int i = 5;
        System.out.println("i = " + i);
        i = i + 1;
        System.out.println("i = " + i);
        i += 1;
        i++;

        //Example

        int number = 5;
        number++;
        System.out.println("number = " + number);

        //question
        int number2 = 10;
        number2++; // number2 is still 10. to be incremented in the next call
        number2++; // number2 is 11. to be incremented in the next call
        System.out.println("number2++ = " + number2++); // number2 is 12. to be incremented in the next call
        System.out.println("FINAL RESULT HERE = " + number2++); // number2 is 13. to be incremented in the next call
        System.out.println("number2 = " + number2); // 14

        //question2

        int num = 5;
        System.out.println(num++); // 5, to be incremented
        System.out.println("num = " + num++); // 6, to be incremented
        System.out.println(num++); // 7 to be incremented
        System.out.println(num); // 8
        num++; // 8 to be incremented
        System.out.println(num); // 9
        System.out.println("Result here = " + num); // 9

        // question

        int j = 10;
        j += 10; // j = j + 10 = 20
        j ++; // 20 to be incremented
        j++; // 21 to be incremented
        System.out.println("j = " + j); // 22

    }
}
