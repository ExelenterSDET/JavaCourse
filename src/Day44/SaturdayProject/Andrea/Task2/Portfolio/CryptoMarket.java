package Day44.SaturdayProject.Andrea.Task2.Portfolio;


import Day44.SaturdayProject.Andrea.Task2.Crypto.Bitcoin;
import Day44.SaturdayProject.Andrea.Task2.Crypto.CryptoCurrency;
import Day44.SaturdayProject.Andrea.Task2.Crypto.Ethereum;

public class CryptoMarket {
    public static void main(String[] args) {

        BuyCrypto buy1 = new BuyCrypto(CryptoCurrency.BITCOIN, 2);
        BuyCrypto buy2 = new BuyCrypto(CryptoCurrency.ETHEREUM, 3);
        BuyCrypto buy3 = new BuyCrypto(CryptoCurrency.ETHEREUM, 1);
        Bitcoin btc = new Bitcoin (2.4);
        Ethereum eth = new Ethereum(3);
        System.out.println("btc = " + btc);
        System.out.println("eth = " + eth);

        System.out.println("buy1 : " + buy1);
        System.out.println("buy2 : " + buy2);
        System.out.println("buy3 : " + buy3);
        System.out.println(buy1.portfolio);
    }
}
