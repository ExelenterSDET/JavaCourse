package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

/*      Task 13
        Create a string and a number. Convert number to char.
        if string contains char, return the character it self.
        if string doesnt contain char, return "Character doesnt exist in the string"
*/
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Task 13 / Searching for characters in a String");
        System.out.print("Enter string = ");
        String word = input.nextLine();
        System.out.print("enter character number = ");
        int nbr = scan.nextInt();
        char ch = (char) nbr;
        String strCh = String.valueOf(ch);
        boolean in = word.contains(strCh);

        if (in){
            System.out.println("There are characters in the string. It is "+ch);
        }
        if (!in) {
            System.out.println("There are no characters in the string.");
        }

    }
}
