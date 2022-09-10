package Day24.Java;

import java.util.Scanner;

public class JavaVarArgs2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean doYouWantToContinue = true;

        String str = "";

        while(doYouWantToContinue){
            System.out.print("Enter the students name => ");
            String student = scan.nextLine();
            str += student + " ";
            System.out.print("Do you want to continue? Type Y for yes N for exit =>");
            String answer = scan.nextLine();
            if(!answer.equalsIgnoreCase("Y")){
                doYouWantToContinue = false;
            }
        }

        String[] array = str.trim().split(" ");

        int i = numberOfStudents(array);
        System.out.println(i);

        System.out.println("=====================================");
        int i1 = numberOfStudents("Andrea", "Anthony", "Dilnoza", "Bahriddin",
                "Andrea", "Anthony", "Dilnoza", "Bahriddin",
                "Andrea", "Anthony", "Dilnoza", "Bahriddin",
                "Andrea", "Anthony", "Dilnoza", "Bahriddin",
                "Andrea", "Anthony", "Dilnoza", "Bahriddin",
                "Andrea", "Anthony", "Dilnoza", "Bahriddin",
                "Andrea", "Anthony", "Dilnoza", "Bahriddin",
                "Andrea", "Anthony", "Dilnoza", "Bahriddin",
                "Andrea", "Anthony", "Dilnoza", "Bahriddin",
                "Andrea", "Anthony", "Dilnoza", "Bahriddin"
                );
        System.out.println(i1);

    }

    public static int numberOfStudents(String... args){
        return args.length;
    }
}
