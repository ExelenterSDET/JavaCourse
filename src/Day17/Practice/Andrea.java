package Day17.Practice;

public class Andrea {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }

        }

        String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    counter++;
                }

            }
            System.out.println("" + ch + " " + counter);
            System.out.println(str.charAt(i));


        }

        for (int i = 0; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                System.out.print(" # ");
            }
            System.out.println(" # ");
        }

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                if (column <= row) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        int ii = 0;
        int jj = 7;
        for (ii = 0; ii < jj; ii = ii + 2) {
            System.out.println("ii = " + ii);
        }

        String str1 = "xyz";
        String str2 = "utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwang";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str.charAt(i);
            int counter = 0;
            for (int j = 0; j < str2.length(); j++) {
                counter += str2.charAt(j) == str1.charAt(i) ? 1 : 0;
            }
            System.out.println(str1.charAt(i) + " = " + counter);
            System.out.println(str2.charAt(i));
        }

        String num1 = "368"; //to string
        String num2 = "1020304050"; //increase by 2 = i+=2, substring
        for (int i = 0; i < num1.length(); i++) {
            System.out.println("num1 = " + num1);
            System.out.println("i = " + i);

            for (int j = 0; j < num2.length(); j += 2) {
                num2 = num2.substring(j, (j + 2));
                System.out.println("num2 = " + num2);

                System.out.println("j = " + j);
            }


        }

        //convert back to numbers
        //use nested loop to make 10 20 30 40 50 60
        //outer loop = using 368, take out of remainter

        //homework
        String numA = "368"; //to string
        String numB = "1020304050"; //increase by 2 = i+=2, substring

        for (int i = 0; i < numA.length(); i++) {

            int newNumA = Integer.parseInt(String.valueOf(numA.charAt(i)));
            String result = "";

            for (int j = 0; j < numB.length(); j += 2) {
                int newNumB = Integer.parseInt(numB.substring(j, j + 2));
                result += newNumA % newNumB;
            }
            System.out.println("result = " + result);
        }
    }
}
