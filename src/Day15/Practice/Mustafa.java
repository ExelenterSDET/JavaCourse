package Day15.Practice;

import java.util.Scanner;

public class Mustafa {
    public static void main(String[] args) {

        /*create a string which is = Java is Fun;
        print each character of the string.*/
        String str1 = "Java is fun";
        int num = 0;

        while (num<(str1.length())){
            System.out.println(str1.charAt(num));
            num++;
        }
            /*
      return the total sum of all numbers until 10
       */

        int num2 = 1;
        int num3 = 0;

        while (num2 <= 10){

            num3 += num2++;


        }
        System.out.println(num3);

        /*
    String str = "Just because the water is red doesn't mean you can't drink it."
    count of many letter 'a' you have in this sentence.
     */
        String str = "Just because the water is red doesn't mean you can't drink it.";
        int count = 0;
        int index = 0;

        while (str.length()>index){
            if (str.charAt(index) == 'a'){
                ++count;
            }
            ++index;
        }
        System.out.println(count);

         /*
        create a string which is = Java is Fun;
        print each character of the string.
         */

        String str2 = "Java is fun";
        int index1 = 0;
        do {
            System.out.println(str2.charAt(index1));
            index1++;
        }while(index1<str2.length());

         /*
        Use scanner to provide two numbers. And using this numbers, replace Math.pow()
     */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first digir");
        int num5 = scanner.nextInt();
        System.out.println("Enter the second digit");
        int num6 = scanner.nextInt();

        int pow =0;
        int int6 = 1;
        while (pow <num6){
            int6*=num5;
            pow++;
        }
        System.out.println(int6);
    }
}
