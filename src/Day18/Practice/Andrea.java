package Day18.Practice;

import java.util.Arrays;

public class Andrea {

    public static void main(String[] args) {

        String str = "ABC";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < str.length(); j++) {
                System.out.print("" + i +str.charAt(j));
            }
        }

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        iLoop:
        for (int i = 0; i < 3; i++) {
            jLoop:
            for (int j = 0; j < 3; j++) {
                kLoop:
                for (int k = 0; k < 3; k++) {
                    if(k==2){
                        break jLoop;
                    }
                    System.out.print("k = " + k);
                    System.out.print("j = " + j);
                    System.out.print("i = " + i);
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        //Task1

        String str1 = "ABCDE";
        int number = 12345;

        outerLoop:
        for (int i = 1; i <= 5; i++) {

            innerLoop:
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == 'D' || str1.charAt(j) == 'B') {
                    break innerLoop;
                }
                System.out.print("" + i + str1.charAt(j));
            }
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        //Task2
        String str2 = "ABCDE";

        outerLoop2:
        for (int i = 1; i <= 5; i++) {

            innerLoop2:
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(j) == 'D' || str2.charAt(j) == 'B') {
                    break outerLoop2;
                }
                System.out.print("" + i + str2.charAt(j) + "  ");
            }
        }

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        //Task3
        String str3 = "ABCDE";

        outerLoop2:
        for (int i = 1; i <= 5; i++) {

            innerLoop2:
            for (int j = 0; j < str3.length(); j++) {
                if (str1.charAt(j) == 'D' || str3.charAt(j) == 'B') {
                    continue innerLoop2;
                }
                System.out.print("" + i + str3.charAt(j) + "  ");
            }
        }

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        //Task4
        String str4 = "ABCDE";

        outerLoop2:
        for (int i = 1; i <= 5; i++) {

            innerLoop2:
            for (int j = 0; j < str4.length(); j++) {
                if (str1.charAt(j) == 'D' || str4.charAt(j) == 'B') {
                    continue outerLoop2;
                }
                System.out.print("" + i + str4.charAt(j) + "  ");
            }
        }

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        //Arrays
        int numArray[] = new int[5];
        System.out.println(numArray.length); //this is length function - no parentheses

        numArray[0] = 15;
        numArray[1] = 20;
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));

        //initialize arrays
        int numArray2[] = {2, 20, 34, 44, 66};

        //String arrays
        String students[] = new String[3];
        students[0] = "Anthony";
        students[1] = "Andrea";
        students[2] = "Arthur";

        System.out.println("strA = " + Arrays.toString(students));

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        char c[] = {'J','A','V','A'};

        System.out.println(Arrays.toString(c));

        String strJ = "JAVA";
        String[] spl = strJ.split("");
        System.out.println(Arrays.toString(spl));

    }
}
