package Day15.Practice;

import java.util.Scanner;

public class Malika {
    public static void main(String[] args) {
//Task1
        /*Create a string which is = Java is Fun;
        print each character of the string.*/
        System.out.println(" ");
        System.out.println("Task1: ");

        String str = "Java is Fun";
        int num = 0;
        while (num<str.length()) {
            System.out.print(str.charAt(num));
            num++;
        }

        //Task2
        /*Return the total of all numbers until 10
         */
        System.out.println(" ");
        System.out.println("Task2: ");

        int num1 = 1;
        int res = 0;
        while(num1<=10){
            res+=num1++;
        }
        System.out.println(res);


        // TASK3
        System.out.println(" ");
        System.out.println("Task3: ");

        String str2 = "Just because the water is red doesn't mean you can't drink it";
        int index = 0;
        int count = 0;

        while (index<str2.length()) {
            //solution 1
            //count += str2.charAt(index) == 'a' ? 1 : 0;

            //solution 2
            if (str2.charAt(index) == 'a') {
                ++count;
            }
            index++;
        }
        System.out.println("count = " + count);

        // Task4
        /*create a string which is = Java is Fun;
        print each character of the string.*/
        System.out.println(" ");
        System.out.println("Task4: ");

        String str4 = "Java is Fun";
        int index4 = 0;
        do{
            System.out.print(str4.charAt(index4++));
        }while(index4<str4.length());

        //Task5
        /*Use scanner to provide two numbers. And using this numbers, replace Math.pow() */
        System.out.println(" ");
        System.out.println("Task5: ");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number => ");
        int num5 = scan.nextInt();
        System.out.print("Enter a power => ");
        int pow = scan.nextInt();

        int total = 1;
        int count1 = 0;

        do{
            total *= num5;
            count1++;
        }while(count1<pow);

        int toTest = (int)Math.pow(num5, pow);
        System.out.println("toTest = " + toTest);

        System.out.println("count1 = " + total);

        System.out.println(toTest == total ? "Correct " : "Incorrect");

    }
}
