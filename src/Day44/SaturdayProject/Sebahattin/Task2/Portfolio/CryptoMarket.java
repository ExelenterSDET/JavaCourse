package Day44.SaturdayProject.Sebahattin.Task2.Portfolio;

import Day44.SaturdayProject.Sebahattin.Task2.Crypto.Bitcoin;
import Day44.SaturdayProject.Sebahattin.Task2.Crypto.Ethereum;

public class CryptoMarket {
    public static void main(String[] args) {
        BuyCrypto buyCrypto1 = new BuyCrypto("BTC",2);
        BuyCrypto buyCrypto2 = new BuyCrypto("ETH",3);
        BuyCrypto buyCrypto3 = new BuyCrypto("Eth",4);

        Bitcoin bitcoin = new Bitcoin(2.4);
        Ethereum ethereum = new Ethereum(3);

        System.out.println("btc = "+bitcoin);
        System.out.println("eth = "+ethereum);

        System.out.println("buyCrypto1 : "+buyCrypto1);
        System.out.println("buyCrypto2 : "+buyCrypto2);
        System.out.println("buyCrypto3 : "+buyCrypto3);
    }
}
