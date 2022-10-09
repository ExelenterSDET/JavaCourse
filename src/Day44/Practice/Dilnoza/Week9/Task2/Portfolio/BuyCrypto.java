package Day44.Practice.Dilnoza.Week9.Task2.Portfolio;

import GroupProjects.Week9.Task2.Crypto.Bitcoin;
import GroupProjects.Week9.Task2.Crypto.Ethereum;

import java.util.ArrayList;
import java.util.HashMap;

public class BuyCrypto {
    int transactionId;
    private static final  HashMap<String, ArrayList<Double>> portfolio=new HashMap<>();
    private static final ArrayList<Bitcoin> bitcoinTransactions= new ArrayList<>();
    private static final ArrayList<Ethereum> ethereumTransactions=new ArrayList<>();


    public BuyCrypto(String crypto,double amount) {
        transactionId++;

        if(crypto.equals("BTC")){
            Bitcoin btc = new Bitcoin(amount);
            btc.transactionId=transactionId;
            bitcoinTransactions.add(1,btc);
            ArrayList<Double> btcArray= new ArrayList<>();
            btcArray.add(0,Bitcoin.getTotalAmount());
            btcArray.add(0,Bitcoin.getTotalValue());
            portfolio.put(btc.shortName,btcArray);


        }
    }





}