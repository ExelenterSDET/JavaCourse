package Day17.Practice.Mentoring_08_31_2022;

public class Pattern_Tasks {
    public static void main(String[] args) {

        /*
        *
        *
        ** * * * *
         * * * *
         * * *
         * *
         *
        *
        * */

        for (int row = 5; row >=1 ; row--) {

            for (int col = row; col >=1 ; col--) {

                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
