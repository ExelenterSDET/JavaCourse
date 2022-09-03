package Day18.Practice.Bakhridin_Day_18;

public class Task4 {

    public static void main(String[] args) {

        int num = 12345;
        String str = "ABCDE";

        outerLoop:
        for (int i = 1; i <=5; i++) {
            innerLoop:
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'D' || str.charAt(j) == 'B') {
                    continue outerLoop;

                }
                System.out.print(" " + i + str.charAt(j) + " ");

            }

        }
        System.out.println();

    }
}
