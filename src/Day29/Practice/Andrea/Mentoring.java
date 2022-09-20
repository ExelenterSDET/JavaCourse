package Day29.Practice.Andrea;

import java.util.Scanner;

public class Mentoring {
    //Return the number of times that the string "hi" appears anywhere in the given string.
    //
    //
    //countHi("abc hi ho") → 1
    //countHi("ABChi hi") → 2
    //countHi("hihi") → 2



     static int countHi(String str){
        int count = 0;
        while (str.length() !=0) {
            if (str.toLowerCase().contains("hi")) {
                count++;
            }
        }
            return count;
        }

     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println(countHi(str));

    }

}
