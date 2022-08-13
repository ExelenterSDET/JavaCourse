package Day5.Practice;

public class Sebahattin {
    public static void main(String[] args) {
        int total = 0;
        int div=10;

        int num = 563;
        System.out.println("Number " + num);
        int rem = num % div;
        System.out.println("Remainder " + rem);
        total += rem;
        System.out.println("Total " + total);
        System.out.println("-------------");
        num/=div;
        System.out.println("Number " + num);
        rem = num % div;
        System.out.println("Remainder " + rem);
        total += rem;
        System.out.println("Total " + total);
        System.out.println("-------------");
        num/=div;
        System.out.println("Number " + num);
        rem = num % div;
        System.out.println("Remainder " + rem);
        total += rem;
        System.out.println("Total " + total);
    }
}
