package Day21.Practice._09_07_2022_Mentoring;

public class SP4_Task8 {
        /*    Task8:
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
        String str = "$15.2 156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132";
        double dollarTotal = 0, euroTotal = 0, poundTotal = 0, liraTotal = 0, mainCurTotal = 0;

        String[] prices = str.split(" ");

        for (String price : prices) {
            if (price.contains("$")) {
                dollarTotal += Double.parseDouble(price.replace("$", "")) * 3.5;
            } else if (price.contains("€")) {
                euroTotal += Double.parseDouble(price.replace("€", "")) * 4.2;
            } else if (price.contains("£")) {
                poundTotal += Double.parseDouble(price.replace("£", "")) * 6.7;
            } else if (price.contains("₺")) {
                liraTotal += Double.parseDouble(price.replace("₺", "")) * 1.8;
            } else {
                mainCurTotal += Double.parseDouble(price);
            }
        }
        System.out.println("dollarTotal = " + dollarTotal);
        System.out.println("euroTotal = " + euroTotal);
        System.out.println("poundTotal = " + poundTotal);
        System.out.println("liraTotal = " + liraTotal);
        System.out.println("mainCurTotal = " + mainCurTotal);
        System.out.println("Total of all Currencies: " + (dollarTotal + euroTotal + poundTotal + liraTotal + mainCurTotal));
    }

}
