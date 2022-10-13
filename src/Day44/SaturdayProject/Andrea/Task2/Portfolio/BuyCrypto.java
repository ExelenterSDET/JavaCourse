package Day44.SaturdayProject.Andrea.Task2.Portfolio;

import Day44.SaturdayProject.Andrea.Task2.Crypto.Bitcoin;
import Day44.SaturdayProject.Andrea.Task2.Crypto.CryptoCurrency;
import Day44.SaturdayProject.Andrea.Task2.Crypto.Ethereum;

import java.util.ArrayList;
import java.util.HashMap;


public class BuyCrypto {

    private static int transactionId = 0;
    final HashMap<String, ArrayList<Double>> portfolio = new HashMap<>();
    private final ArrayList<Bitcoin> bitcoinTransactions = new ArrayList<>();
    private final ArrayList<Ethereum> ethereumTransactions = new ArrayList<>();

    public BuyCrypto(CryptoCurrency crypto, int amount) {
        if (crypto.shortname.equalsIgnoreCase("BTC")){
            Bitcoin btc = new Bitcoin(amount);
            btc.transactionId = transactionId;
            bitcoinTransactions.add(0, btc);
            ArrayList<Double> btcArr = new ArrayList<>();
            btcArr.add(0, Bitcoin.getTotalAmount());
            btcArr.add(1, Bitcoin.getTotalValue());
            portfolio.put(btc.shortname,btcArr);
        }
        else if (crypto.shortname.equalsIgnoreCase("ETH")){
            Ethereum eth = new Ethereum(amount);
            eth.transactionId = transactionId;
            ethereumTransactions.add(0, eth);
            ArrayList<Double> ethArr = new ArrayList<>();
            ethArr.add(0, Ethereum.getTotalAmount());
            ethArr.add(1, Ethereum.getTotalValue());
            portfolio.put(eth.shortname,ethArr);
        }
        transactionId++;
    }

    @Override
    public String toString() {
        return "BuyCrypto{" +
                "portfolio=" + portfolio +
                '}';
    }
//        - create another package as portfolio
//    - create a class BuyCrypto
//        transactionId
//                HashMap<String, ArrayList<Double>> portfolio
//    ArrayList<Bitcoin> bitcoinTransactions
//    ArrayList<Ethereum> ethereumTransactions
//
//    Note:
//            -- all attributes are accessible only within the class.
//            -- all attributes are class attributes.
//            -- except transactionId, all other attributes are constant
//
//    - create a constructor
//        -- parameters are String crypto and double amount
//        -- everytime when constructor is called, transactionId should be increased
//
//        -- if parameter String crypto is bitcoin:
//            --- create an object for Bitcoin
//            --- assign value to Bitcoin`s transactionId value of BuyCrypto`s transactionId
//            --- add object to the bitcoinTransactions list
//            --- update portfolio map as follows:
//    key should be Bitcoin shortname, value should be totalAmount and totalValue
//    Example:
//    Portfolio{{BTC=[1.2, 23448.108], ETH=[1.0, 1329.17]}}
//
//         -- if parameter String crypto is ethereum:
//            --- create an object for Ethereum
//                    --- assign value to Ethereum`s transactionId value of BuyCrypto`s transactionId
//                    --- add object to the ethereumTransactions list
//                    --- update portfolio map as follows:
//    key should be Ethereum shortname, value should be totalAmount and totalValue
//    Example:
//    Portfolio{{BTC=[1.2, 23448.108], ETH=[1.0, 1329.17]}}
//
//        -- Create a method to print only the Portfolio (you may use toString method)
//        -- Create a method to print all detailed crypto transactions. (print both ethereumTransactions and bitcoinTransactions lists)
//
//    Example:
//    Portfolio{{BTC=[1.2, 23448.108], ETH=[1.0, 1329.17]}}
//        ===============TRANSACTIONS==================
//    Bitcoin{transactionId=1, transactionAmount=1.2, price=19540.09, transactionValue=23448.108}
//    Ethereum{transactionId=2, transactionAmount=1.0, price=1329.17, transactionValue=1329.17}
//        ===============================================
//
//                -- Create another package portfolio
//        -- Create class CryptoMarket
//        -- in the main method perform multiple transactions with different cryptos by calling BuyCrypto class.
//            -- print the portfolio and detailed transactions.
//
//            -- Optional:
//            try to use Test methods and add some validations. (at least test three different scenarios)

}
