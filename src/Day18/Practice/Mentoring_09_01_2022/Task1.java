package Day18.Practice.Mentoring_09_01_2022;

public class Task1 {

    public static void main(String[] args) {

        /*
        *
        ** * * * *
         * * * *
         * * *
         * *
         *
        *
        *
        * */

        for (int row = 5; row >= 1; row--) {

            for (int col = row; col >= 1; col--) {

                System.out.print(" *");
            }
            System.out.println("");
        }

    // *            row = 1  colCount = 1
    // * *          row = 2  colCount = 2
    // * * *        row = 3  colCount = 3
    // * * * *      row = 4  colCount = 4
    // * * * * *    row = 5  colCount = 5
    // * * * *      row = 6  colCount = 4  // 2*n - row = 4
    // * * *        row = 7  colCount = 3  // 2*n - row = 3
    // * *          row = 8  colCount = 2
    // *            row = 9  colCount = 1


        int n = 5;


        for (int row = 1; row < 2*n ; row++) {

            int totalColsInRow = row > n ? 2*n - row : row;

            for (int i = 1; i <= totalColsInRow ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*Task1
         * Write a program in Java to display the n terms of odd natural number and their sum.
         *
         * n = 5  => oddNum = 1 3 5 7 9  sum = 1 + 3 + 5 + 7 + 9
         * */

        int oddNum = 0, sum = 0;

        for (int i = 1; i <=n ; i++) {

            oddNum = 2*i-1;
            System.out.println(oddNum);
            sum += oddNum;
        }
        System.out.println("sum = " + sum);
    }
}
