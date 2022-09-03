package Day18.Practice;

import java.util.Arrays;

public class Tohir {
    /*
    public static void main(String[] args) {
        //Labelled loop
        String str = "ABCDE";
        outerLoop:
        for (int i = 1;i <= 3;i++){
            innerLoop:
            for (int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if (c == 'D'){
                    break;
                }
                System.out.println(i+""+c);
            }
            System.out.print(" *** \n");
        }
        //Labelled loop#1
        outerLoop:
        for (int i = 1;i <= 3;i++){
            innerLoop:
            for (int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if (c == 'D'){
                    break outerLoop;
                }
                System.out.println(i+""+c);
            }
            System.out.print(" *** \n");
        }
        //Labelled loop#2
        outerLoop:
        for (int i = 1;i <= 3;i++){
            innerLoop:
            for (int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if (c == 'D'){
                    break innerLoop;
                }
                System.out.println(i+""+c);
            }
            System.out.print(" *** \n");
        }
        //Labelled loop#3
        outerLoop:
        for (int i = 1;i <= 3;i++){
            innerLoop:
            for (int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if (c == 'D'){
                    continue innerLoop;
                }
                System.out.println(i+""+c);
            }
            System.out.print(" Loop3 *** \n");
        }
        //Labelled loop#4
        outerLoop:
        for (int i = 1;i <= 3;i++){
            innerLoop:
            for (int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if (c == 'D'){
                    continue outerLoop;
                }
                System.out.println(i+""+c);
            }
            System.out.print(" Loop4 *** \n");
        }
    }
    */
    public static void main(String[] args) {
        int numberArr[] = new int[2];
        numberArr[0] = 1;
        numberArr[1] = 4;

        System.out.println("Arrays.toString(numberArr) = " + Arrays.toString(numberArr));

        String strArr[] = new String[3];
        strArr[0] = "Said";
        strArr[1] = "Saafar";

        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        boolean blArr[] = new boolean[3];

        blArr[2] = true;

        System.out.println("Arrays.toString(blArr) = " + Arrays.toString(blArr));

        double dbArr[] = new double[5];
        dbArr[1] = 2.2;
        System.out.println( dbArr.length);

        char c[] = {'J','A','V', 'A'};

        System.out.println(Arrays.toString(c));

        String str = "TOHIR";
        String[] split = str.split("");
        System.out.println(Arrays.toString(split));

        String str2 = "Java is fun. I love java. I am going to be a sdet";
        String[] s = str2.split(" ");
        String[] s1 = str2.split("a");
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s1));

    }
}
