package Day26.Practice;

import java.util.Arrays;

public class Sebahattin {
    public static void main(String[] args) {
        String str1 = "$125.9";
        String str2 = "$75.5";

        Sebahattin jm = new Sebahattin();

        double total = jm.getTotal(str1, str2);
        System.out.println(total);

        String str3 = "-TL";
        double[] arr = {45.5, 20.5, 50.7, 15.8};

        String[] result = jm.feedArray2(str3, arr);
        System.out.println(Arrays.toString(result));
    }
    public double getTotal (String str1, String str2){
        double total = 0;
        total = Double.parseDouble(str1.replace("$",""))
                + Double.parseDouble(str2.replace("$",""));
        return total;
    }
       public String[] feedArray2 (String str, double... arr){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result  += arr[i] + str + " ";
        }
        return result.trim().split(" ");
    }
}
