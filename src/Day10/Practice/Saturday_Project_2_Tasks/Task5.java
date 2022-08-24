package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        /*Task5
        *  Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
        i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987" // 152030
        remove all the non-numeric characters.
        parse the Strings to int
        and print the total
        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be ==> 65;
        NOTE : if the output is less than 0 change the output to -1
        * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three numbers with spaces\n begining with any symbols: ");
        String str = scan.nextLine();

        int total = 0, space1 = 0, space2 = 0;

        String n1 = str.replaceAll("[^\\d- ]", "");

        space1 = n1.indexOf(" ");
        space2 = n1.lastIndexOf(" ");

        String n1Substring = n1.substring(0,space1);

        String n2Substring = n1.substring(++space1, space2);
         //"$40 $10 $15 (40 10 15)

        String n3Substring = n1.substring(++space2);

        total = Integer.parseInt(n1Substring) + Integer.parseInt(n2Substring) + Integer.parseInt(n3Substring);

        if (total < 0){
            System.out.println(-1);
        }else {
            System.out.println(total);
        }
    }
}
