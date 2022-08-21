package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

/*      Task 12
        Create two strings. Check if the strings contain any upper case letters.
        If strings contain capital letters, return the total count of capital letters for both strings.
        if, one of the strings only contains capital letters, return the count of all characters for that string.
        if none of the string contain capital letters, return 0
        Example
        Hello and World ==> output should be 2
        Hello and world ==> output should be 5
        hello and world ==> output should be 10
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Task 12 / Number of capital letters");
        System.out.print("Enter string 1= ");
        String capStr1 = input.nextLine();
        System.out.print("Enter string 2= ");
        String capStr2 = input.nextLine();

        String repcapStr1 = capStr1.replaceAll("[^A-Z]", "");
        int intcapStr1 = repcapStr1.length();
        String repcapStr2 = capStr2.replaceAll("[^A-Z]", "");
        int intcapStr2 = repcapStr2.length();

        if (intcapStr1 > 0 && intcapStr2 > 0){
            System.out.println("Total number of capital letters = "+(intcapStr1+intcapStr2));
        }
        if (intcapStr1 > 0 && intcapStr2 == 0){
            System.out.println("1. String length = "+capStr1.length());
        }
        if (intcapStr2 > 0 && intcapStr1 == 0) {
            System.out.println("2. String length = "+capStr2.length());
        }
        if (intcapStr1 == 0 && intcapStr2 == 0){
            System.out.println("Strings do not contain capital letters = "+"\""+0+"\"");
        }
    }
}
