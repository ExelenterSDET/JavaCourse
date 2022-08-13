package Day5.Practice;

public class Dilnoza {
    public static void main(String[] args) {
        int total1 = 0;
        int divValue = 10;

        int num = 563;
        System.out.println(num);
        int remainder1 =num%divValue;
        System.out.println("remainder1 = " + remainder1);
        total1 += remainder1;
        System.out.println("total1 = " + total1);


        num/=divValue;
        System.out.println(num);
        remainder1 =num%divValue;
        System.out.println("remainder2 = " + remainder1);
        total1 += remainder1;
        System.out.println("total1 = " + total1);

        num/=divValue;
        System.out.println(num);
        remainder1 =num%divValue;
        System.out.println("remainder3 = " + remainder1);
        total1 += remainder1;
        System.out.println("total3 = " + total1);

       




    }



}
