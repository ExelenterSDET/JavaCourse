package Day20.Practice.Tohir;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Task10:
        //        Create a String array. The length of array should be the count of Exelenter students.
        //        Use scanner class to Enter Students names and insert them into the array.
        //        Use Random class, to generate number(index) between 0 and length of array.
        //        Return the name of the student, whose name is stored under the generated index.
        //        Print: WINNER IS + <<Student Name>>!!! (All capital letters)
        //        Example:
        //        [Anthony, Arthur, Andrea, Malika, Bahridin, Sebahattin, Dilnoza, Mehmet, Day20.Practice.Tohir, Mustafa]
        //
        //        if random number is 0, print WINNER IS ANTHONY!!!!
        Scanner scan = new Scanner(System.in);
        Random ram = new Random();
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextLine();
        }
        int randomindex = ram.nextInt(0,10);
        System.out.println("WINNER IS + " + list[randomindex].toUpperCase());
    }
}
