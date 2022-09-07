package Day20.Practice.Sebahattin;

public class Task08 {
    public static void main(String[] args) {
/*Task8:
        Given a String as "$15.2  156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132"
        if a price starts with $, multiply with 3.5
        if a price starts with €, multiply with 4.2
        if a price starts with £, multiple with 6.7
        if a price starts with ₺, multiply with 1.8
        if a price doesnt start with any currency, return it`s own value.
        1. Get total of each currency`s prices.
        2. Get total of all prices.
*/
        String str = "$15.2  156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132";
        String [] strArr = str.split(" ");
        double dollar = 0.0;
        double euro = 0.0;
        double lira = 0.0;
        double pound = 0.0;

        for (String money : strArr){
            if (money.contains("$")){
                dollar += Double.parseDouble(money.replace("$",""));
            } else if (money.contains("€")) {
                euro += Double.parseDouble(money.replace("€",""));
            } else if (money.contains("£")) {
                pound += Double.parseDouble(money.replace("£", ""));
            } else if (money.contains("₺")) {
                lira += Double.parseDouble(money.replace("₺", ""));
            }
        }
        double totalDollar = dollar*3.5;
        double totalEuro = euro*4.2;
        double totalPound = pound*6.7;
        double totalLira = lira*1.8;
        System.out.println("$ ---> $"+dollar+" * "+ 3.5 +" = $"+ totalDollar);
        System.out.println("€ ---> €"+euro+" * "+ 4.2 +" = €"+ totalEuro);
        System.out.println("£ ---> £"+pound+" * "+ 6.7 +" = £"+ totalPound);
        System.out.println("₺ ---> ₺"+lira+" * "+ 1.8 +" = ₺"+ totalLira);

        System.out.println("Total = " + (totalDollar+totalEuro+totalPound+totalLira));
    }
}
