package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task13 {
    /*
    Create a string and a number. Convert number to char.
if string contains char, return the character itself.
if string doesn't contain char, return "Character doesn't exist in the string"
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Provide a string==>");
        String s = scan.nextLine();

        System.out.print("Provide a number==> ");
        int number = scan.nextInt();

        char numToChar =(char) number;

        String str = String.valueOf(numToChar);

        if(s.contains(str)){
            System.out.println(numToChar);

        }

        else if(!s.contains(str)){
            System.out.println("Character doesn't exist in the string");
        }

    }
}

