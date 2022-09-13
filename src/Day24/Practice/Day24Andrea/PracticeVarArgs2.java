package Day24.Practice.Day24Andrea;

import java.util.Scanner;

public class PracticeVarArgs2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean doYouWantToContinue = true;

        String str = "";
        while(doYouWantToContinue){
            System.out.print("Enter name of student: ");
            String student = scan.nextLine();
            str += student + " ";
            System.out.print("Do you want to continue? Y or N: ");
            String answer = scan.nextLine();
            if(!answer.equalsIgnoreCase("Y")) {
                doYouWantToContinue = false;
                }
            }

        String[] array = str.trim().split(" ");
        int i = numberOfStudents(array);
        System.out.println(i);
        }

    public static int numberOfStudents(String... args){
       return args.length;

    }
}
