package Day44.Practice.Dilnoza.Week9.Task2.Portfolio;

import Day44.Practice.Dilnoza.Week9.Task2.Crypto.Bitcoin;
import Day44.Practice.Dilnoza.Week9.Task2.Crypto.CryptoCurrency;
import Day44.Practice.Dilnoza.Week9.Task2.Crypto.Ethereum;

import java.util.ArrayList;
import java.util.HashMap;
    public class BuyCrypto {


        private static int transactionId = 0;
        final HashMap<String, ArrayList<Double>> portfolio = new HashMap<>();
        private final ArrayList<Bitcoin> bitcoinTransactions = new ArrayList<>();
        private final ArrayList<Ethereum> ethereumTransactions = new ArrayList<>();

        public BuyCrypto(String crypto, double amount) {
            if (crypto.equalsIgnoreCase("BTC")){
                Bitcoin btc = new Bitcoin(amount);
                btc.transactionId = transactionId;
                bitcoinTransactions.add(0, btc);
                ArrayList<Double> btcArr = new ArrayList<>();
                btcArr.add(0, Bitcoin.getTotalAmount());
                btcArr.add(1, Bitcoin.getTotalValue());
            }
            else if (crypto.equalsIgnoreCase("ETH")){
                Ethereum eth = new Ethereum(amount);

                eth.transactionId = transactionId;
                ethereumTransactions.add(0, eth);
                ArrayList<Double> ethArr = new ArrayList<>();
                ethArr.add(0, Ethereum.getTotalAmount());
                ethArr.add(1, Ethereum.getTotalValue());
                portfolio.put(CryptoCurrency.ETHERIUM.getShortName(),ethArr );

            }
            transactionId++;
        }

        @Override
        public String toString() {
            return "BuyCrypto{" +
                    "portfolio=" + portfolio +
                    '}';
        }





}