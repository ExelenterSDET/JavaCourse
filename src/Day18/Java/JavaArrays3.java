package Day18.Java;

import java.util.Arrays;

public class JavaArrays3 {
    public static void main(String[] args) {

        String students[] = new String[7];
        students[0] = "Anthony";
        students[1] = "Andres";
        students[2] = "Arthur";
        students[3] = "Dilnoza";
        students[4] = "Bahriddin";
        students[5] = "Malika";
        students[6] = "Bahriddin";

        System.out.println("students = " + Arrays.toString(students));

        String students1[] = {"Anthony", "Andres", "Arthur", "Dilnoza", "Bahriddin", "Malika", "Bahriddin"};
        System.out.println("students1 = " + Arrays.toString(students1));



    }
}
