package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

/*      Task 11
        Create two Strings.
        If the first string contains second string, concat second string to the first string.
        Else, concat first string to itself.
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Task 11 / Is it in the string?");
        System.out.print("Enter string 1= ");
        String firstStr = input.nextLine();
        System.out.print("Enter string 2= ");
        String secondStr = input.nextLine();

        if (secondStr.contains(firstStr)){
            //      System.out.println(firstStr.concat(secondStr));
            System.out.println(secondStr+" "+firstStr);
        }
        else {
            //      System.out.println(firstStr.concat(firstStr));
            System.out.println(firstStr+" "+firstStr);
        }
    }
}
