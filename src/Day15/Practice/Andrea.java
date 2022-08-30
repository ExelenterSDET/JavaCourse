package Day15.Practice;

import java.util.Scanner;

public class Andrea {

    public static void main(String[] args) {


        //while loop
        String str = "Hello world";
        int index = 0;

        while(str.charAt(index) != 'w'){
            System.out.println(str.charAt(index));
            index++;
        }

        String str2 = "Hello world Hello world Hello world Hello world Hello world";
        boolean condition = true;
        int ind = 0;

        while (condition){
            System.out.println(str2.charAt(ind));

            if(++ind == 20){
                condition = false;
            }
        }
        System.out.println("");


        String str3 = "Java is Fun";
        boolean condition3 = true;
        int ind3 = 0;

        while (condition3) {
            System.out.print(str3.charAt(ind3));

            if (++ind3 == 11) {
                condition3 = false;
            }
        }
        System.out.println("");


        int num = 1;
        int total = 0;
        while (num <= 10){
            total += num;
            num++;
        }
        System.out.println("total = " + total);

        System.out.println("");

        String strLong = "Just because the water is red doesn't mean you can't drink it.";
        int num2 = 0;
        int count = 0;

        while(num2<strLong.length()) {
            if (strLong.charAt(num2) == 'a') {

                ++count;
            }
            num2++;
        }
        System.out.println("A's = " + count);


        //do-while loop
        int num4 = 0;
        do{
            System.out.println("hello");
            System.out.println("world");
            num4++;
            System.out.println(num4);
        }while(num4<10);

        String java = "Java is Fun";
        int ind1 = 0;

        do{
            System.out.println(java.charAt(ind1++));
        }
        while (ind1<java.length());

        System.out.println("");


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNum = scan.nextInt();
        System.out.print("Enter a power: ");
        int power = scan.nextInt();

        int total1 = 1;
        int count1 = 0;

        do{
            total1 *= firstNum;
            count1++;
        }
        while (count1 < power);
        System.out.println("total = " + total1);
    }

}
