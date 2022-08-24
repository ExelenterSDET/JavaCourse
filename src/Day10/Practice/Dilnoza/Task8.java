package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task8 {


    /*
    Given two Strings by using scanner class
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.
            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("first string==>");
        String s1 = scan.nextLine();
        char ch1= s1.charAt(s1.length()-1);
        System.out.print("second string==>");
        String s2 = scan.nextLine();
        char ch2 =s2.charAt(0);
        String substring = s2.substring(0);

        if(ch1==ch2){
            System.out.println(s1.concat(s2.substring(1)));
        }else{
            System.out.println(s1.concat(s2));
        }








        }


    }






