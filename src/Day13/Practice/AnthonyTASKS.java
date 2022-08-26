package Day13.Practice;

import java.util.Scanner;

public class AnthonyTASKS {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number between 0-24");
        int time = scan.nextInt();

        String output = "";

        output = (7 <= time && time <= 20)
                ? (time <= 12) ? "Good Morning" : "Good Day"
                : (20 < time && time <= 22) ? "Good Evening" : "Good Night";

        System.out.println(output);
        System.out.println("-----------------------------------------------------------------------");


        String staff = "TV";
        String res = null;

        res = staff.equals("TV") ?  "Walter" : staff.equals("Movie") ? "White" : "No results";
        System.out.println(res);
        System.out.println("-----------------------------------------------------------------------");

        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
        System.out.println("-----------------------------------------------------------------------");

    }
}
