package Day18.Java;

public class JavaLabeledLoop {

    /*
    We can have a name of each Java for loop. To
    do so, we use label before the for loop.

    It is useful if we have nested for loop so that we
    can break/continue specific for loop.

    Usually, break and continue keywords
    breaks/continues the innermost for loop only
     */
    public static void main(String[] args) {
        String str = "ABCDE";
        // 1A 1B 1C 2A 2B 2C 3A 3B 3C
        // if we have character C, break outer loop

        outerLoop:
        for (int i = 1; i <= 5; i++) {
            innerLoop:
            for (int j = 0; j < str.length() ; j++) {
                if(str.charAt(j) == 'C'){
                    break outerLoop;
                }
                System.out.print("" + i+ str.charAt(j) + " ");
            }
        }

        System.out.println();
        System.out.println("======================");

        outerLoop:
        for (int i = 1; i <= 5; i++) {
            innerLoop:
            for (int j = 0; j < str.length() ; j++) {
                if(str.charAt(j) == 'C'){
                    break;
                }
                System.out.print("" + i+ str.charAt(j) + " ");
            }
        }

        System.out.println();
        System.out.println("======================");

        outerLoop:
        for (int i = 1; i <= 5; i++) {
            innerLoop:
            for (int j = 0; j < str.length() ; j++) {
                if(str.charAt(j) == 'C'){
                    continue outerLoop;
                }
                System.out.print("" + i+ str.charAt(j) + " ");
            }
        }

        System.out.println();
        System.out.println("======================");



        outerLoop:
        for (int i = 1; i <= 5; i++) {
            innerLoop:
            for (int j = 0; j < str.length() ; j++) {
                if(str.charAt(j) == 'C'){
                    continue;
                }
                System.out.print("" + i+ str.charAt(j) + " ");
            }
        }

    }
}
