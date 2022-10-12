package Day44.Practice.Ibrahim.Saturday.Portfolio;

import Day44.Practice.Ibrahim.Saturday.Crypto.Bitcoin;
import Day44.Practice.Ibrahim.Saturday.Crypto.Ethereum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BuyCrypto {
    private static int transactionId;
    private final static HashMap<String, ArrayList<Double>> portfolio = new HashMap<>();
    private final static ArrayList<Bitcoin> bitcoinTransactions = new ArrayList<>();
    private final static ArrayList<Ethereum> ethereumTransactions = new ArrayList<>();

    public BuyCrypto(String crypto, double amount) {
        transactionId++;

        if (crypto.equalsIgnoreCase("BTC")){
            Bitcoin btc = new Bitcoin(amount);
            btc.transactionId = transactionId;
            bitcoinTransactions.add(btc);
            ArrayList<Double> arr = new ArrayList<>(Arrays.asList(Bitcoin.getTotalAmount(), Math.round(Bitcoin.getTotalValue()*100) / 100.0));
            portfolio.put(crypto, arr);
        } else if (crypto.equalsIgnoreCase("ETH")) {
            Ethereum eth = new Ethereum(amount);
            eth.transactionId = transactionId;
            ethereumTransactions.add(eth);
            ArrayList<Double> arr = new ArrayList<>(Arrays.asList(Ethereum.getTotalAmount(), Math.round(Ethereum.getTotalValue()*100) / 100.0));
            portfolio.put(crypto, arr);
        }
    }

    public String toString(){
        return "Portfolio{" + portfolio + "}"+
                "\n==================TRANSACTION==================" +
                "\n" + bitcoinTransactions +
                "\n" + ethereumTransactions +
                "\n================================================";
    }
    public static void main(String[] args) {
        BuyCrypto buyCrypto = new BuyCrypto("BTC", 1.2);
        BuyCrypto buyCrypto1 = new BuyCrypto("ETH", 1);

        System.out.println(buyCrypto1);

    }
}
