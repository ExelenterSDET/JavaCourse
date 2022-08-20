package Day6.Practice;
import javax.swing.*;
import java.util.Scanner;
public class Tohir {
    public static void main(String[] args) {

        // Task #1
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char ch = (char) s.length();
        //System.out.print("Your string "+s+ " has the lenght of "+s.length()+" and converted to char is "+ch);
        // Task #2
        String S = s.concat("has lenght of "+s.length()+" ").concat("and its ASCII is "+ ch + " ");
        System.out.println(S);


    }
}
