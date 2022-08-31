package Day17.Practice;

import java.util.Scanner;

public class Tohir {
    /*
Homework
String num1 = "368"
String num2 = "1020304050"

10 20 30 40 50 60
 3  3  3  3  3  3 = 12345
 6  6  6  6  6  6 = 42042
 8  8  8  8  8  8 = 24602
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yor first number = ");
        String str1 = scan.nextLine();
        System.out.println("Enter yor second number = ");
        String str2 = scan.nextLine();
        for(int i=0;i<str1.length();i++){
            int num_1 = Integer.valueOf(str1.substring(i,i+1));
            System.out.println("");
            for(int j=0;j<str2.length();j+=2){
                int num_2 = Integer.valueOf(str2.substring(j,j+2));
                System.out.print(num_2%num_1);
            }

        }

    }
}
