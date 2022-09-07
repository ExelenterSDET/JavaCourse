package Day20.Practice.GroupTasks.Week4;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    /*
    Task10:
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Exelenter Student names: ");
        //Anthony
        // Arthur
        // Andrea
        // Malika
        // Bahridin
        // Sebahattin
        // Dilnoza
        // Mehmet
        // Tohir
        // Mustafa
        Random rnd = new Random();
        int random=0;

        String[]allStudents=new String[10];

        for (int i = 0; i < allStudents.length; i++) {
            allStudents[i]=scan.nextLine();
            random=rnd.nextInt(allStudents[i].length());

        }

        System.out.println("Winner is = "+allStudents[random].toUpperCase()+"!!!!!!!!");
    }
}

