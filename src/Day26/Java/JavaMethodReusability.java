package Day26.Java;

import java.util.Arrays;

public class JavaMethodReusability {
    public static void main(String[] args) {

        String s = "$";
        double[] arr = {1.0002, 12.5555684, 32.84913221, 65.65419321};

//        double[] result = {"$1.00", "$12.56", "$32.84", "$65.66"};
        JavaMethodReusability jr = new JavaMethodReusability();
        String[] priceArray = jr.createPriceArray(arr, s);
        System.out.println(Arrays.toString(priceArray));
    }

    double formatDouble(double d){
        return Math.round(d*100.0)/100.0;
    }

    String addDollarSign(String s, double num){
        return s+num;
    }

    String[] createPriceArray(double[] arr, String s ){
        String [] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = formatDouble(arr[i]);
            result[i] = addDollarSign(s, arr[i]);
        }
        return result;
    }
}
