package Day18.Practice;

public class Dilnoza {

    public static void main(String[] args) {
        // Task1:
        // 12345- outer loop
        // String "ABCDE"- inner loop
        // name loops as outer loop( for numbers) and inner loop (for string)
        // if inner loop indexOf String = D or B, break inner loop
        // print 1A 1B....

        // Task2
        // Break outerLoop

        // Task3:
        //continue inner loop

        // Task4:
        // continue outerloop

        int outerLoopNum = 12345;
        String InnerLoopString = "ABCDE";
        System.out.println();
        System.out.println("=============Task1===========");
        oOuterLoop:
        for (int i = 1; i <= 5; i++) {
            innerLoop:
            for (int j = 0; j < InnerLoopString.length(); j++) {

                if (InnerLoopString.charAt(j) == 'D' || InnerLoopString.charAt(j) == 'B') {
                    break;
                }
                System.out.print(" " + i + "" + InnerLoopString.charAt(j));
            }}

        System.out.println();
        System.out.println("=============Task2===========");
        oOuterLoop2:
        for (int a = 1; a <= 5; a++) {
            innerLoop2:
            for (int b = 0; b < InnerLoopString.length(); b++) {

                if (InnerLoopString.charAt(b) == 'D' || InnerLoopString.charAt(b) == 'B') {
                    break oOuterLoop2;
                }
                System.out.print(" " + a + "" + InnerLoopString.charAt(b));
            }
        }


        System.out.println();
        System.out.println("=============Task3===========");
        oOuterLoop3:
        for (int c = 1; c <= 5; c++) {
            innerLoop3:
            for (int d = 0; d < InnerLoopString.length(); d++) {

                if (InnerLoopString.charAt(d) == 'D' || InnerLoopString.charAt(d) == 'B') {
                    continue ;// Task3
                }
                System.out.print(" " + c + "" + InnerLoopString.charAt(d));
            }

        }
        System.out.println();
        System.out.println("=============Task4===========");

        oOuterLoop4:
        for (int e = 1; e <= 5; e++) {
            innerLoop3:
            for (int f = 0; f < InnerLoopString.length(); f++) {

                if (InnerLoopString.charAt(f) == 'D' || InnerLoopString.charAt(f) == 'B') {
                    continue oOuterLoop4;// Task4
                }
                System.out.print(" " + e + "" + InnerLoopString.charAt(f));
            }

        }

    }
}

