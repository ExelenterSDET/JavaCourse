package Day11.Java;

import java.util.Scanner;

public class Task3 {
    /*
    Given a String (grade)
    if grade is "A" then ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"
    if grade is "B" print "You're good"
    else (meaning if not "A" or "B") print "You need to work hard"
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Grade => ");
        String grade = scan.nextLine();

        String output = "";

        if(grade.equalsIgnoreCase("A")){
            System.out.print("Enter your average => ");
            int avg =  scan.nextInt();
            if(avg > 90){
                output = "Congrats";
            }else {
                output =  "Invalid Average";
            }
        }else if(grade.equalsIgnoreCase("B")){
            output = "You`re good";
        }else{
            output = "You need to work hard";
        }

        System.out.println(output);



    }
}
