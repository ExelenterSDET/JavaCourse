package Day47.Practice.Ibrahim.Crypto.CryptoMarket;

import Day47.Practice.Ibrahim.Crypto.Portfolio.BuyCrypto;

public class CryptoMarket {

    public static void main(String[] args) {

        BuyCrypto bitcoin = new BuyCrypto("Bitcoin", 1.2);
        BuyCrypto ethereum = new BuyCrypto("Ethereum", 1.2);
        BuyCrypto bitcoin1 = new BuyCrypto("Bitcoin", 1.2);
        BuyCrypto ethereum1 = new BuyCrypto("Ethereum", 1.2);
        System.out.println(bitcoin);
        BuyCrypto.printDetails();

    }
}
