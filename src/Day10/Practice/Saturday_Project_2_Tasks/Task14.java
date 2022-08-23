package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*Task14
        * Create a string. Validate if a string has a space. (use maximum 1 spaces in the string)
if string doesn't have a space, return the string itself.
if string has a space, get two words to the left from the space and to the right from the space. validate which word is the longest and print it.
if words have equal length, return the whole string.
Example:
Hello World = Hello = 5, World = 5 Output should be "Hello World"
Exelenter Sdet = Exelenter = 9, Sdet = 4 Ouput should be "Exelenter"
        * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your text: ");
        String str = scan.nextLine();

        if (!str.contains(" ")){
            System.out.println(str); //if string doesn't have a space, return the string itself.
        }

        if (str.contains(" ")){

            int spaceIndex = str.indexOf(' '); // 5
            String firstText = str.substring(0, spaceIndex); // hello world
            String secondText = str.substring(++spaceIndex);

            if (firstText.length() > secondText.length()){
                System.out.println(firstText);
            }
            if (firstText.length() < secondText.length()){
                System.out.println(secondText);
            }

            if (firstText.length() == secondText.length()){
                System.out.println(str);
            }

        }
    }
}
