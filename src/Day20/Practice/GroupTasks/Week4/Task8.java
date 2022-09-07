package Day20.Practice.GroupTasks.Week4;

import java.util.Arrays;

public class Task8 {

    /*
     Task8:
        Given a String as "$15.2  156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132"
        if a price starts with $, multiply with 3.5
        if a price starts with €, multiply with 4.2
        if a price starts with £, multiple with 6.7
        if a price starts with ₺, multiply with 1.8
        if a price doesnt start with any currency, return it`s own value.
        1. Get total of each currency`s prices.
        2. Get total of all prices.
     */

    public static void main(String[] args) {
        String str="$15.2 156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132";
        String [] item=str.split(" ",0);
        System.out.println(Arrays.toString(item));

        double dollar=0.0,pound=0.0,euro=0.0,lira=0.0,empty=0.0;

        for (String itemPrice : item) {
            if (itemPrice.contains("$")) {
                dollar+=(3.5)*Double.parseDouble(itemPrice.replaceAll("[^0-9.]",""));

            }
            else if (itemPrice.contains("€")) {
                euro+=(4.2)*Double.parseDouble(itemPrice.replaceAll("[^0-9.]",""));
            }
            else if (itemPrice.contains("£")) {
                pound+=(6.7)*Double.parseDouble(itemPrice.replaceAll("[^0-9.]",""));

            }
            else if (itemPrice.contains("₺")) {
                lira+=(1.8)*Double.parseDouble(itemPrice.replaceAll("[^0-9.]",""));

            }
            else
            {
                empty+=Double.parseDouble(itemPrice.replaceAll("[^0-9.]",""));
            }

        }

        // System.out.println("dollar = " + (dollar*3.5));
        System.out.println("dollar = " +dollar);
        System.out.println("euro = " + euro);
        System.out.println("pound = " + pound);
        System.out.println("lira = " + lira);
        System.out.println("empty = " + empty);
    }
}
