package Day26.Java;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods2 {

    public static void main(String[] args) {
        String str1 = "$25.4";
        String str2 = "$41.5";

        JavaMethods2 jm = new JavaMethods2();

        double total = jm.getTotal(str1, str2);
        System.out.println(total);

        String str3 = "$";
        double[] arr = {12.5, 22.5, 30.7, 41.8};

//        String[] result = {"$12.5", "$22.5", "$30.7", "$41.8"};

        String[] result = jm.feedArray(str3, arr);
        System.out.println(Arrays.toString(result));

    }

    public double getTotal (String str1, String str2){
        double total = 0;
        total = Double.parseDouble(str1.replace("$",""))
                + Double.parseDouble(str2.replace("$",""));
        return total;
    }

    public String[] feedArray (String str, double[] arr){
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = str + arr[i];
        }
        return result;
    }

    public String[] feedArray2 (String str, double[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result  += str + arr[i] + " ";
        }
        return result.trim().split(" ");
    }
}
