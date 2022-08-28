package Day15.Practice;
import java.util.Random;
import java.util.Scanner;

public class Tohir {
    public static void main(String[] args) {
        Random ram = new Random();
        Scanner scan = new Scanner(System.in);
        //TAsk #5
        int num_1 = ram.nextInt(0,101);
        int num_2 = ram.nextInt(0,101);
        String str = scan.next();
        System.out.println( "number_1 is "+num_1+" Number_2 is "+num_2);
        System.out.println(str.matches("\\+")? (num_1+num_2):
                str.matches("\\-")? (num_1-num_2):
                        str.matches("\\*")? (num_1*num_2):
                                str.matches("\\/")? (num_1/num_2):
                                        str.matches("\\%")? (num_1%num_2):
                                                str.matches("\\.")? (num_1+"."+num_2):"false");
    }
}
