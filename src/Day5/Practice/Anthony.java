package Day5.Practice;

public class Anthony {
    // Task for homework.
    // calculate total of number 563. (don't use hardcoding) answer should be 14;

    public static void main (String[] args) {

        int total = 0;
        int divider = 10;

        int num = 563;
        System.out.println("number1 = " + num);
        int remainder = num % divider;
        System.out.println("remainder1 = " + remainder);
        total += remainder;
        System.out.println("total1 = " + total + "\n");

        num/=divider;
        System.out.println("number2 = " + num);
        remainder = num%divider;
        System.out.println("remainder = " + remainder);
        total += remainder;
        System.out.println("total2 = " + total + "\n");

        num/=divider;
        System.out.println("number3 = " + num);
        remainder = num%divider;
        System.out.println("remainder3 = " + remainder);
        total += remainder;
        System.out.println("total3 = " + total + "\n");


    }


}
