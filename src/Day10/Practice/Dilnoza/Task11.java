package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task11 {

    /*
    Create two Strings. If the first string contains second string, concat second string to the first string. else, concat first string to itself.
 (edited)
[11:02 PM]
     */

    public static void main(String[] args) {
//        String str1 = "Hi";
//        String str2 = "hi";
//        if (str1.contains(str2)) {
//            System.out.println(str1.concat(str2));
//        } else {
//            System.out.println(str1.concat(str1));
//        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first string==> ");
        String s1 = scan.nextLine();


        System.out.print("Please enter a second string==> ");
        String s2 = scan.nextLine();

        if(s1.contains(s2)){
            System.out.println(s1.concat(s2));
        }else{
            System.out.println(s1.concat(s1));
    }}
}