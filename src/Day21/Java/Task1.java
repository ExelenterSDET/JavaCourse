package Day21.Java;

public class Task1 {
    public static void main(String[] args) {

        String[] names = {"Michael", "John", "Jim"};
        String[] lastNames = {"Jordan", "Travolta", "Kerry"};

        /*
        1. Initialize 2DArray.
        2. Print without for loop.
        Michael Jordan
        John Travolta
        Jim Kerry
         */
        String[][] dArr = new String[2][];
        dArr[0] = names;
        dArr[1] = lastNames;

        System.out.println("===================TASK1======================");
        System.out.println(dArr[0][0] + " " + dArr[1][0]);
        System.out.println(dArr[0][1] + " " + dArr[1][1]);
        System.out.println(dArr[0][2] + " " + dArr[1][2]);

        System.out.println("===================TASK2======================");
        /*
        Task2
        Print same result using for loop
        Hint: you don`t have to use nested loop.
         */
        for (int i = 0; i < dArr[0].length; i++) {
            System.out.println(dArr[0][i] + " " + dArr[1][i]);
        }

        /*
        Task3
        Print same result using nested for loop
         */

        System.out.println("==================TASK3=======================");

        for (int i = 0; i < dArr[0].length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(dArr[j][i] + " ");
            }
            System.out.println();
        }

    }
}
