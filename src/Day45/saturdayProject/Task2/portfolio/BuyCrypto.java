package Day45.saturdayProject.Task2.portfolio;

import Day45.saturdayProject.Task2.crypto.Bitcoin;
import Day45.saturdayProject.Task2.crypto.Ethereum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BuyCrypto {
    static int transactionId = 0;
    static final private HashMap<String, ArrayList<Double>> portfolio = new HashMap<>();
    static final private ArrayList<Bitcoin> bitcoinTransactionsList = new ArrayList<>();
    static final private ArrayList<Ethereum> ethereumTransactionsList = new ArrayList<>();


    public BuyCrypto(String crypto, double amount) {
        transactionId++;
        switch (crypto) {
            case "bitcoin":
                Bitcoin bitcoin = new Bitcoin(amount);
                bitcoin.transactionId = transactionId;
                bitcoinTransactionsList.add(bitcoin);
                portfolio.put(Bitcoin.shortName, new ArrayList<>(Arrays.asList(Bitcoin.getTotalAmount(), Bitcoin.getTotalValue())));
            break;
            case "ethereum":
                Ethereum ethereum = new Ethereum(amount);
                ethereum.transactionId = transactionId;
                ethereumTransactionsList.add(ethereum);
                portfolio.put(Ethereum.shortName, new ArrayList<>(Arrays.asList(Ethereum.getTotalAmount(), Ethereum.getTotalValue())));
            break;
        }
    }
    public static void printAllDetails () {
        for (Bitcoin eachBitcoin : bitcoinTransactionsList) {
            System.out.println(eachBitcoin);
        }
        for (Ethereum eachEthereum : ethereumTransactionsList) {
            System.out.println(eachEthereum);
        }
    }

    public String toString(){
        return "Portfolio = " + portfolio;
    }

}
