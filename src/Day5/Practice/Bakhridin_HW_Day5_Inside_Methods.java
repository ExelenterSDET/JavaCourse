package Day5.Practice;

public class Bakhridin_HW_Day5_Inside_Methods {
    public static void main(String[] args) {

        sumOfTotalReminders(563,10,0);
        System.out.println("======================================");
        System.out.println(sumOfTotalReminders1(563, 10, 0));

    }



    public static void sumOfTotalReminders(int numbers, int dividers, int sumOfRemainders) {
        //Step1
        System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
        System.out.println("sumOfReminders = " + sumOfRemainders);

        //Step2
        numbers/=dividers;
        System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
        System.out.println("sumOfReminders = " + sumOfRemainders);

        //Step3
        numbers/=dividers;
        System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
        System.out.println("sumOfReminders = " + sumOfRemainders);

    }

    public static int sumOfTotalReminders1(int numbers, int dividers, int sumOfRemainders) {
        //Step1
        //  System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
        //  System.out.println("sumOfReminders = " + sumOfRemainders);

        //Step2
        numbers/=dividers;
        //  System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
        //  System.out.println("sumOfReminders = " + sumOfRemainders);

        //Step3
        numbers/=dividers;
        // System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
        // System.out.println("sumOfReminders = " + sumOfRemainders);

        return sumOfRemainders;
    }
}
