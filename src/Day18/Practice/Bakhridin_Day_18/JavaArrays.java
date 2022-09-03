package Day18.Practice.Bakhridin_Day_18;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {

        String str[] = new String[7];
        str[0] = "Anthony";
        str[1] = "Andrea";
        str[2] = "Sabahattin";
        str[3] = "Malika";
        str[4] = "Arthur";
        str[5] = "Furkat";
        str[6] = "Tohir";

        System.out.println(Arrays.toString(str));

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);


        }

        int a[]=new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Index of "+i+" is "+(a[i]=i+1));

        }





    }
}
