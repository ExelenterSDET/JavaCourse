package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task7 {

    /*
    Given a String ,
            if the number of the characters in the given String is odd then print true else print false
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide a string==> ");
        String s = scanner.nextLine();
        System.out.println(s.length());
        if(s.length()%2==1){
            System.out.println("true");
        }else{
            System.out.println("false");

        }


    }

}
