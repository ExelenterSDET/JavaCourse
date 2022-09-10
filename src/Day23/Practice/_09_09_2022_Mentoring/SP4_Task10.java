package Day23.Practice._09_09_2022_Mentoring;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class SP4_Task10 {
            /*Task10:
        Create a String array. The length of array should be the count of Exelenter students.
        Use scanner class to Enter Students names and insert them into the array.
        Use Random class, to generate number(index) between 0 and length of array.
        Return the name of the student, whose name is stored under the generated index.
        Print: WINNER IS + <<Student Name>>!!! (All capital letters)
        Example:
        [Anthony, Arthur, Andrea, Malika, Bahridin, Sebahattin, Dilnoza, Mehmet, Tohir, Mustafa]

        if random number is 0, print WINNER IS ANTHONY!!!!
        */

    public static void main(String[] args) {

        String names = "";
        String [] students = new String[5];
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

//        System.out.print("Enter Students Names: ");
//        names = scan.nextLine();
//
//        students = names.contains(",") ? names.split(", ") : names.split(" ");
//
//        System.out.println("WINNER IS " + students[rnd.nextInt(students.length)].toUpperCase() + "!!!");

        for (int i = 0; i < students.length; i++) {

            System.out.print("Enter Students Names: ");
            students[i] = scan.nextLine();
        }
        System.out.println("WINNER IS " + students[rnd.nextInt(students.length)].toUpperCase() + "!!!");
    }
}
