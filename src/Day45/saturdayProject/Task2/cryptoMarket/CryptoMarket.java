package Day45.saturdayProject.Task2.cryptoMarket;

import Day45.saturdayProject.Task2.portfolio.BuyCrypto;

public class CryptoMarket {
    public static void main(String[] args) {
        BuyCrypto bitcoin = new BuyCrypto("bitcoin", 1.2);
        BuyCrypto ethereum = new BuyCrypto("ethereum", 1);
        BuyCrypto ethereum2 = new BuyCrypto("ethereum", 1);

        System.out.println(bitcoin);

        BuyCrypto.printAllDetails();

        /*    Portfolio{{BTC=[1.2, 23448.108], ETH=[1.0, 1329.17]}}
        ===============TRANSACTIONS==================
        Bitcoin{transactionId=1, transactionAmount=1.2, price=19540.09, transactionValue=23448.108}
        Ethereum{transactionId=2, transactionAmount=1.0, price=1329.17, transactionValue=1329.17}*/

    }
}
