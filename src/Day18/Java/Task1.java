package Day18.Java;

public class Task1 {


    // 12345
    // "ABCDE"
    // name loops as outerloop (for numbers) and inner loop (for string)
    // print as 1A, 1B, 1C, 2A, 2B, 2C, etc...

    // Task1
    // if inner loop index of string equals 'D' or 'B', break inner loop

    // Task2 same as Task1, but break outer loop

    // Task3
    // if inner loop index of string equals 'D' or 'B', continue inner loop

    // Task4
    // if inner loop index of string equals 'D' or 'B', continue outer loop

    public static void main(String[] args) {
        //Task1
        System.out.println("===============TASK1==================");
        String str = "ABCDE";
        outerLoop:
        for (int i = 1; i <= 5 ; i++) {
            innerLoop:
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'D' || c == 'B'){
                    break innerLoop;
                }
                System.out.print("" + i + c + " ");
            }
        }
        System.out.println();
        System.out.println("===============TASK2==================");
        outerLoop:
        for (int i = 1; i <= 5 ; i++) {
            innerLoop:
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'D' || c == 'B'){
                    break outerLoop;
                }
                System.out.print("" + i + c + " ");
            }
        }

        System.out.println();
        System.out.println("===============TASK3==================");
        outerLoop:
        for (int i = 1; i <= 5 ; i++) {
            innerLoop:
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'D' || c == 'B'){
                    continue innerLoop;
                }
                System.out.print("" + i + c + " ");
            }
        }

        System.out.println();
        System.out.println("===============TASK3==================");
        outerLoop:
        for (int i = 1; i <= 5 ; i++) {
            innerLoop:
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'D' || c == 'B'){
                    continue innerLoop;
                }
                System.out.print("" + i + c + " ");
            }
        }

        System.out.println();
        System.out.println("===============TASK4==================");
        outerLoop:
        for (int i = 1; i <= 5 ; i++) {
            innerLoop:
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'D' || c == 'B'){
                    continue outerLoop;
                }
                System.out.print("" + i + c + " ");
            }
        }


    }
}
