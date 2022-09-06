package Day20.Practice.Sebahattin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter students name ==> ");
        Random random = new Random();
        String[] students = new String[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = scan.nextLine();
        }
        System.out.println("Students name ==> "+ Arrays.toString(students));
        int randomindex = random.nextInt(0,10);
        System.out.println("WINNER IS " + students[randomindex].toUpperCase()+ " !!!!");
    }
}
