package Day5.Practice;

public class BakhridinDay_05 {
    public static void main(String[] args) {

        // Task for homework.
        // calculate total of number 563. (dont use hardcoding) answer should be 14;

        int number1=563;
        int divider1=10;
        int totalOfReminders=0;

        //Step1
        //number1/=divider1;
        System.out.println("number1 = " + number1);
        int reminder1=number1%divider1;
        System.out.println("reminder1 = " + reminder1);
        totalOfReminders=number1%divider1;
        System.out.println("totalOfReminders = " + totalOfReminders);
        //Step2
        number1/=divider1;
        System.out.println("number1 = " + number1);
        reminder1=number1%divider1;
        System.out.println("reminder1 = " + reminder1);
        totalOfReminders+=reminder1;
        System.out.println("totalOfReminders = " + totalOfReminders);
        //Step3
        number1/=divider1;
        System.out.println("number1 = " + number1);
        reminder1=number1%divider1;
        System.out.println("reminder1 = " + reminder1);
        totalOfReminders+=reminder1;
        System.out.println("totalOfReminders = " + totalOfReminders);

        System.out.println("======2-nd way======");
        int numb=563, diVider=10, remind=0;
        //Step1
        System.out.println("numb = " + numb);
        remind+=numb%diVider;
        System.out.println("remind = " + remind);
        //Step2
        numb/=diVider;
        System.out.println("numb = " + numb);
        remind+=numb%diVider;
        System.out.println("remind = " + remind);
        //Step3
        numb/=diVider;
        System.out.println("numb = " + numb);
        remind+=numb%diVider;
        System.out.println("remind = " + remind);

    }
}
