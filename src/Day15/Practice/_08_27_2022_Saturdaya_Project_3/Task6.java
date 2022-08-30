package Day15.Practice._08_27_2022_Saturdaya_Project_3;

import java.util.Scanner;

public class Task6 {

            /*Task6.
Using scanner create a string.
Return reverse of a string.
Example: str = Java, result should be = avaJ
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your text: ");
        String str = scan.nextLine();
        String reversedStr = "";
        int index = str.length()-1;

        while (index >= 0){
            char ch = str.charAt(index);
            reversedStr += ch;
            index--;
        }
        System.out.println("reversedStr = " + reversedStr);
    }



}
