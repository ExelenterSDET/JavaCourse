package Day18.Practice;

public class Malika {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("--------------TASK1-----------------");

        String str = "ABCDE";
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            innerLoop:
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'D' || str.charAt(j) == 'B') {
                    break innerLoop;
                }
                System.out.print(" " + i + str.charAt(j) + " ");
            }
        }

        //Task2
        System.out.println();
        System.out.println("--------------TASK2-----------------");

        String str1 = "ABCDE";
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            innerLoop:
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == 'D' || str1.charAt(j) == 'B') {
                    break outerLoop;
                }
                System.out.print(" " + i + str1.charAt(j) + " ");
            }
        }

        //Task3
        System.out.println();
        System.out.println("--------------TASK3-----------------");
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            innerLoop:
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == 'D' || str1.charAt(j) == 'B') {
                    continue innerLoop;
                }
                System.out.print(" " + i + str1.charAt(j) + " ");
            }
        }

        //Task4
        System.out.println();
        System.out.println("--------------TASK4-----------------");
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            innerLoop:
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == 'D' || str1.charAt(j) == 'B') {
                    continue outerLoop;
                }
                System.out.print(" " + i + str1.charAt(j) + " ");
            }
        }
    }
}
