package Day48.Practice.SP.transactions;

import Day48.Practice.SP.cryptos.CryptoCurrency;
import Day48.Practice.SP.portfolio.BuyCrypto;


public class Market {
    public static void main(String[] args) {
       BuyCrypto crypto1 = new BuyCrypto(CryptoCurrency.BITCOIN, 1.2);
       BuyCrypto crypto2 = new BuyCrypto(CryptoCurrency.ETHEREUM, 1);

       System.out.println(crypto1);

        BuyCrypto.printTransactionDetails();

    }
}
