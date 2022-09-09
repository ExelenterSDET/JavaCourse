package Day22.Practice;

import java.util.Arrays;

public class Arhtur22Day {


        public static void main(String[] args) {
            int sampArr[] = {1,2,3,4,5,6,8};
            String str[] = {"apple", "watermelon", "grapes"};

            getMaxNum(sampArr);
            getMinNum(sampArr);
            getTotal(sampArr);
            reversedArray(str);


        }

        static void getMaxNum(int[] s){
            int maxVal = 0;
            for(int a: s){
                if (maxVal<a) {
                    maxVal=a;
                } else {
                    continue;
                }
            }
            System.out.println("maxVal = " + maxVal);
        }

        static void getMinNum(int[] s){
            int minVal = s[0];
            for(int a: s){
                if (minVal>a) {
                    minVal=a;
                }
            }
            System.out.println("minVal = " + minVal);
        }

        static void getTotal(int[] s){
            int ctr = 0;
            for(int a: s){
                ctr=ctr+a;
            }
            System.out.println("total = " + ctr);
        }

        static void reversedArray(String[] s){
            char rev;
            String newStr = "";
            System.out.println("original array = " + Arrays.toString(s));
            for (String str: s
            ) {
                for (int i = str.length()-1 ; i >=0 ; i--) {

                    rev = str.charAt(i);

                    newStr = newStr + rev;



                }
                System.out.print(newStr + " ");
                newStr="";
                rev = ' ';




            }

        }

    }



