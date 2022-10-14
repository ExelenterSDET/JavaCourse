package Day48.Practice.SP.portfolio;

import Day48.Practice.SP.cryptos.Bitcoin;
import Day48.Practice.SP.cryptos.CryptoCurrency;
import Day48.Practice.SP.cryptos.Ethereum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BuyCrypto {

    private static int transactionId = 0;
    private static final HashMap<String, ArrayList<Double>> cryptoUSDValue = new HashMap<>();
    private static final ArrayList<Bitcoin> bitcoinTransactions = new ArrayList<>();
    private static final ArrayList<Ethereum> ethereumTransactions = new ArrayList<>();

    public BuyCrypto(CryptoCurrency crypto, double amount) {
        transactionId++;
        switch(crypto){
            case BITCOIN:
                Bitcoin bitcoin = new Bitcoin(amount);
                bitcoin.transactionId = transactionId;
                bitcoinTransactions.add(bitcoin);
                cryptoUSDValue.put(Bitcoin.shortName, new ArrayList<>(Arrays.asList(Bitcoin.getTotalAmount(), Bitcoin.getTotalValue())));
                break;
            case ETHEREUM:
                Ethereum ethereum = new Ethereum(amount);
                ethereum.transactionId = transactionId;
                ethereumTransactions.add(ethereum);
                cryptoUSDValue.put(Ethereum.shortName, new ArrayList<>(Arrays.asList(Ethereum.getTotalAmount(), Ethereum.getTotalValue())));
                break;
            default:
                System.out.println("No transactions with this crypto currencies allowed");
        }
    }


    public static void printTransactionDetails(){
        System.out.println("===============TRANSACTIONS==================");
        for(Bitcoin btc: bitcoinTransactions){
            System.out.println(btc);
        }
        for(Ethereum eth: ethereumTransactions){
            System.out.println(eth);
        }
        System.out.println("===============================================");
    }

    @Override
    public String toString() {
        return "Portfolio{" + cryptoUSDValue + "}";
    }

}
