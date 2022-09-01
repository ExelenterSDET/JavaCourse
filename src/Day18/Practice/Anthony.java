package Day18.Practice;

public class Anthony {

    public static void main(String[] args) {

        System.out.println("TASK 1");
        //TASK 1
        //12345
        //"ABCDE"
        // name loops as outer loop (for numbers) and inner loop (string)
        //if inner loop index of string equals 'D' or 'B', break inner loop

        int num = 12345;
        String str = "ABCDE";
        //1A 1B 1C 2A 2B 2C 3A 3B 3C
        outerLoop:
        for (int i = 1; i <= 5; i++) {

            innerLoop:
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'D' || str.charAt(j) == 'B') {
                    break innerLoop;
                }
                System.out.print("" + i + str.charAt(j) + " "); // "" shortcut of call it a string
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("TASK 2");
        //TASK 2
        //12345
        //"ABCDE"
        // name loops as outer loop (for numbers) and inner loop (string)
        //if outer loop index of string equals 'D' or 'B', break inner loop

        int num2 = 12345;
        String str2 = "ABCDE";
        //1A 1B 1C 2A 2B 2C 3A 3B 3C
        outerLoop:
        for (int i = 1; i <= 5; i++) {

            innerLoop:
            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == 'D' || str2.charAt(j) == 'B') {
                    break outerLoop;
                }
                System.out.print("" + i + str2.charAt(j) + " "); // "" shortcut of call it a string
            }
            System.out.println();
        }

        System.out.println("\n" + "---------------------------------------------------------------------------");
        System.out.println("TASK 3");
        //TASK 3
        //12345
        //"ABCDE"
        // name loops as outer loop (for numbers) and inner loop (string)
        //if outer loop index of string equals 'D' or 'B', break inner loop

        int num3 = 12345;
        String str3 = "ABCDE";
        //1A 1B 1C 2A 2B 2C 3A 3B 3C
        outerLoop:
        for (int i = 1; i <= 5; i++) {

            innerLoop:
            for (int j = 0; j < str3.length(); j++) {
                if (str3.charAt(j) == 'D' || str3.charAt(j) == 'B') {
                    continue innerLoop;
                }
                System.out.print("" + i + str3.charAt(j) + " "); // "" shortcut of call it a string
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("TASK 4");

        //TASK 4
        //12345
        //"ABCDE"
        // name loops as outer loop (for numbers) and inner loop (string)
        //if outer loop index of string equals 'D' or 'B', break inner loop

        int num4 = 12345;
        String str4 = "ABCDE";
        //1A 1B 1C 2A 2B 2C 3A 3B 3C
        outerLoop4:
        for (int i4 = 1; i4 <= 5; i4++) {

            innerLoop:
            for (int j = 0; j < str4.length(); j++) {
                if (str4.charAt(j) == 'D' || str4.charAt(j) == 'B') {
                    continue outerLoop4;
                }
                System.out.print("" + i4 + str4.charAt(j) + " "); // "" shortcut of call it a string
            }
            System.out.println();
        }
    }


}
