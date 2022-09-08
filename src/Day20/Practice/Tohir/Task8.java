package Day20.Practice.Tohir;
import java.util.Arrays;
public class Task8 {
    public static void main(String[] args) {
        //Task8:
        //        Given a String as "$15.2  156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132"
        //        if a price starts with $, multiply with 3.5
        //        if a price starts with €, multiply with 4.2
        //        if a price starts with £, multiple with 6.7
        //        if a price starts with ₺, multiply with 1.8
        //        if a price doesnt start with any currency, return it`s own value.
        //        1. Get total of each currency`s prices.
        //        2. Get total of all prices.
        String str = "$15.2  156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132";
        String[] split = str.split(" ");
        double totalusd = 0;
        double totaluero = 0;
        double totalpound = 0;
        double totallira = 0;
        double total= 0;
        System.out.println("split = " + Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            if(split[i].contains("$")){
                split[i] = split[i].replace("$","");
                totalusd=totalusd + Double.parseDouble(split[i]);
            }
            else if ((split[i].contains("€"))){
                split[i] = split[i].replace("€","");
                totaluero=totaluero + Double.parseDouble(split[i]);
            }
            else if ((split[i].contains("£"))){
                split[i] = split[i].replace("£","");
                totalpound=totalpound + Double.parseDouble(split[i]);
            }
            else if ((split[i].contains("₺"))){
                split[i] = split[i].replace("₺","");
                totallira=totallira + Double.parseDouble(split[i]);
            }
            // else {
            //    total = total + Double.parseDouble(split[i].replaceAll([^0-9],""));

        }
        System.out.println("Total USD " + totalusd);
        System.out.println("Total UERO " + totaluero);
        System.out.println("Total POUND " + totalpound);
        System.out.println("Total LIRA " + totallira);
        System.out.println("Total  " + total);
        System.out.println("Total is " + (totalusd*3.5+totaluero*4.2+totalpound*6.7+totallira*1.8+total));
    }

}
