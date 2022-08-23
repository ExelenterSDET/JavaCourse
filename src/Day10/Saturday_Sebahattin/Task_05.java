package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {

/*      Task 5
        Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
        i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987"
        remove all the non-numeric characters.
        parse the Strings to int
        and print the total
        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be ==> 65;
        NOTE : if the output is less than 0 change the output to -1
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Task 5");
        System.out.print("Enter three positive numbers as a String with spaces between the numbers = ");
        String entry = input.nextLine();
        String[] s = entry.split(" ");
        String x = s[0];
        String y = s[1];
        String z = s[2];
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        int k = Integer.parseInt(x.replaceAll("[^\\d-]", ""));
        int l = Integer.parseInt(y.replaceAll("[^\\d-]", ""));
        int m = Integer.parseInt(z.replaceAll("[^\\d-]", ""));
        int t = k+l+m;
        if (t > 0) {
            System.out.println("Total = " + (k + l + m));
        }
        if (t < 0){
            System.out.println("-1");
        }
    }
}
