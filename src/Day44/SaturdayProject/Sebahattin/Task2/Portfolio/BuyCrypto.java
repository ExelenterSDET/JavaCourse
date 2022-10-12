package Day44.SaturdayProject.Sebahattin.Task2.Portfolio;

import Day44.SaturdayProject.Sebahattin.Task2.Crypto.Bitcoin;
import Day44.SaturdayProject.Sebahattin.Task2.Crypto.Ethereum;

import java.util.ArrayList;
import java.util.HashMap;

public class BuyCrypto {
    private static int transactionId;
    private final HashMap<String, ArrayList<Double>> portfolio;
    private final ArrayList<Bitcoin> bitcoinTransactions;
    private final ArrayList<Ethereum> ethereumTransactions;

    public BuyCrypto(String crypto, double amount){

        Bitcoin bitcoin = new Bitcoin(amount);
        Ethereum ethereum = new Ethereum(amount);
        bitcoinTransactions = new ArrayList<>();
        ethereumTransactions = new ArrayList<>();
        portfolio = new HashMap<>();
        if (crypto.equals(bitcoin.shortname)){
            bitcoin.transactionId = transactionId;
            bitcoinTransactions.add(0,bitcoin);
            ArrayList<Double> btcArr = new ArrayList<>();
            btcArr.add(0,Bitcoin.getTotalAmount());
            btcArr.add(1,Bitcoin.getTotalValue());
            portfolio.put(bitcoin.shortname,btcArr);
        } else if (crypto.equals(ethereum.shortname)) {
            ethereum.transactionId = transactionId;
            ethereumTransactions.add(0,ethereum);
            ArrayList<Double> ethArr = new ArrayList<>();
            ethArr.add(0,Ethereum.getTotalAmount());
            ethArr.add(1,Ethereum.getTotalValue());
            portfolio.put(bitcoin.shortname,ethArr);
        }
        transactionId++;
    }

    @Override
    public String toString() {
        return "BuyCrypto{" +
                "portfolio=" + portfolio +
                '}';
    }

//    @Override
//    public String toString() {
//        return "BuyCrypto{" +
//                "bitcoinTransactions=" + bitcoinTransactions +
//                ", ethereumTransactions=" + ethereumTransactions +
//                '}';
//    }
}
