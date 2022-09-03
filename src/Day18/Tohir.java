package Day18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tohir {
    public static void main(String[] args) {
        int intArr[] = {12, 35, 5, 7, 96, 12};
        int a = 12;
        int b = 0;
        int sum = 0;
        /*for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
            if (intArr[i] == a) {
                System.out.println(" = " + i + "th element");
                b++;
            }
        }
        System.out.println("sum = " + sum);
        System.out.print("Average = " + sum / intArr.length);
        if (b == 0) {
            System.out.println("not found");
        }*/

        //Enhanced loop:
        for (int i : intArr) {
            System.out.println("i = " + i);
            i = i == 12 ? 1:0;
            System.out.println("i = " + i);
            }
        System.out.println( Arrays.toString(intArr));
        //Task1
        String strArr [] = {"$50","$150","$5","$18","$25"};
        for (String s : strArr) {
            System.out.print(s = s.replace("$","")+ " ");
                    }
        int Total = 0;
        int Average = 0;
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].replace("$","");
            Total += Integer.valueOf(strArr[i]);

        }

        System.out.println("Total is = " +Total+" and average is "+Total/strArr.length);
    }
}
