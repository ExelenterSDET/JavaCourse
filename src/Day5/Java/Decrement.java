package Day5.Java;

public class Decrement {
    //   // Java Increment ==>> Decrease value of variable by 1 when it is called next time after assignment.
    //    // Also known as Post Decrement

    public static void main(String[] args) {

        int i = 5;
        i = i -1;
        i -= 1;
        i--;
        System.out.println("i = " + i);

        //Example

        int number = 10;
        number--;
        number--;
        number--;
        System.out.println("number = " + number);

        //Question1
        int num = 20;
        num--; // 20, to be decremented
        System.out.println(num--); // 19, to be decremented
        num--; // 18, to be decremented
        System.out.println( num); // 17
        System.out.println(num++); // 17, to be incremented
        System.out.println(num++); // 18, to be incremented
        System.out.println("Result here = " + num--); // 19

        // Question2
        int k = 5;
        k += 10; // 15 ===>>> k = k + 5
        k++; // 15, to be incremented
        k++; // 16, to be incremented
        k -= 5; // 17 ===> k = k - 5 ===> 12
        k--; // 12, to be decremented
        System.out.println(k--); // 11, to be decremented
        System.out.println("Result here = " + k); // 10

        // Question3
        int a = 5;
        int b = 10;
        int c = ((a++) +  (b++));
        System.out.println("Result here => " +c  + a + b);
        System.out.println(c + a + b);
        System.out.println("Result here => " + c + (a + b));

        System.out.println(""+(1 + 2) + 3);


    }

}
