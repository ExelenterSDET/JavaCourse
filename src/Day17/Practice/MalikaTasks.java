package Day17.Practice;

public class MalikaTasks {
    public static void main(String[] args) {
        //Task1
        /*Create multiplication table from 1 to 10 */
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.println(i+" * "+k+" = "+i*k);
            }
            System.out.println();
        }

        //Task2
        /*utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang
        print every character and count how many times it appears in the string*/

        String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";
        String toAvoidDuplicates = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (toAvoidDuplicates.contains(String.valueOf(ch))){
                continue;
            }
            toAvoidDuplicates += ch;

            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    counter++;
                }
            }
            System.out.println("" + ch + " = " + counter);
        }

        //Task3
        /*print grid of "#" with 10 rows and 10 columns*/
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }

        //Task4
        /* Write program using nested loops that prints:
         *
         **
         ***
         ****
         ***** */
        for (int row = 1; row <=5; row++) {
            for (int column = 1; column <=5 ; column++) {
                if (column <= row){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //Task5
        /* return how many x, y, z are in that string */

        String str1 = "xyz";
        String str2 = "utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwang";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int counter = 0;
            for (int j = 0; j < str2.length(); j++) {

                counter+=str2.charAt(j)==str1.charAt(i) ? 1 : 0;
            }
            System.out.println(str1.charAt(i) + " = " + counter);
        }

    }
}
