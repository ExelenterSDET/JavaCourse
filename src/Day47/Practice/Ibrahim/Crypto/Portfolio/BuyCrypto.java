package Day47.Practice.Ibrahim.Crypto.Portfolio;

import Day47.Practice.Ibrahim.Crypto.Crypto.CryptoCoin;
import Day47.Practice.Ibrahim.Crypto.Crypto.Bitcoin;
import Day47.Practice.Ibrahim.Crypto.Crypto.Ethereum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BuyCrypto {
    static int transactionId;
    final static HashMap<String, ArrayList<Double>> portfolio = new HashMap<>();
    final static ArrayList<Bitcoin> bitcoinTransactions = new ArrayList<>();
    final static ArrayList<Ethereum> ethereumTransactions = new ArrayList<>();

    public BuyCrypto(String crypto, double amount) {
        transactionId++;

//        if (crypto.equalsIgnoreCase(CryptoCoin.BITCOIN.shortname)){
//            Bitcoin btc = new Bitcoin(amount);
//            btc.transactionId = transactionId;
//            bitcoinTransactions.add(btc);
//            ArrayList<Double> arr = new ArrayList<>(Arrays.asList(Bitcoin.getTotalAmount(), Math.round(Bitcoin.getTotalValue()*100) / 100.0));
//            portfolio.put(crypto, arr);
//        } else if (crypto.equalsIgnoreCase(CryptoCoin.ETHEREUM.shortname)) {
//            Ethereum eth = new Ethereum(amount);
//            eth.transactionId = transactionId;
//            ethereumTransactions.add(eth);
//            ArrayList<Double> arr = new ArrayList<>(Arrays.asList(Ethereum.getTotalAmount(), Math.round(Ethereum.getTotalValue()*100) / 100.0));
//            portfolio.put(crypto, arr);
//        }



        switch (crypto){
            case "Bitcoin" :
                Bitcoin btc = new Bitcoin(amount);
                btc.transactionId = transactionId;
                bitcoinTransactions.add(btc);
                portfolio.put(CryptoCoin.BITCOIN.shortname,
                        new ArrayList<>(Arrays.asList(Bitcoin.getTotalAmount(), Math.round(Bitcoin.getTotalValue()*100) / 100.0)));
                break;
            case "Ethereum":
                Ethereum eth = new Ethereum(amount);
                eth.transactionId = transactionId;
                ethereumTransactions.add(eth);
                portfolio.put(CryptoCoin.ETHEREUM.shortname,
                        new ArrayList<>(Arrays.asList(Ethereum.getTotalAmount(), Math.round(Ethereum.getTotalValue()*100) / 100.0)));
                break;
        }
    }

    public String toString(){
        return "Portfolio{" + portfolio + "}"+
                "\n==================TRANSACTION==================";
    }
    public static void printDetails(){
        System.out.println("Bitcoins\n==============================");
        bitcoinTransactions.forEach(btc -> System.out.print(btc));
        System.out.println();
        System.out.println("Ethereums\n==============================");
        ethereumTransactions.forEach(eth -> System.out.print(eth));
    }

}
