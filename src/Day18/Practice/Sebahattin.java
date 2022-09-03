package Day18.Practice;

public class Sebahattin {
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
        System.out.println("~~~~~~~~~~~~TASK1~~~~~~~~~~~~");
        String str = "ABCDE";
        outerLoop:
        for (int i = 1; i <= 5 ; i++) {
            innerloop:
            for (int j = 0; j < str.length() ; j++) {
                if (str.charAt(j) == 'B' || str.charAt(j) == 'D'){
                    break innerloop;
                }
                System.out.print(""+i+str.charAt(j)+" ");
            }
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~TASK2~~~~~~~~~~~~");
        outerLoop:
        for (int i = 1; i <= 5 ; i++) {
            innerloop:
            for (int j = 0; j < str.length() ; j++) {
                if (str.charAt(j) == 'B' || str.charAt(j) == 'D'){
                    break outerLoop;
                }
                System.out.print(""+i+str.charAt(j)+" ");
            }
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~TASK3~~~~~~~~~~~~");
        outerLoop:
        for (int i = 1; i <= 5 ; i++) {
            innerloop:
            for (int j = 0; j < str.length() ; j++) {
                if (str.charAt(j) == 'B' || str.charAt(j) == 'D'){
                    continue innerloop;
                }
                System.out.print(""+i+str.charAt(j)+" ");
            }
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~TASK4~~~~~~~~~~~~");
        outerLoop:
        for (int i = 1; i <= 5 ; i++) {
            innerloop:
            for (int j = 0; j < str.length() ; j++) {
                if (str.charAt(j) == 'B' || str.charAt(j) == 'D'){
                    continue outerLoop;
                }
                System.out.print(""+i+str.charAt(j)+" ");
            }
        }
    }
}
