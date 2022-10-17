package Day49.SaturdayProject.Ibrahim.Task1;

import java.util.HashMap;

public class Transaction {
    public static double totalUSDAmount;
    final static HashMap<String, Integer> stock = new HashMap<>();
    static double transactionAmount;

    public static void addFunds(double fund){
        totalUSDAmount += fund;

    }

    public void processTransaction(TransactionType transactionType, Product product, int qty){
        switch (transactionType) {
            case BUY -> {
                transactionAmount = qty * product.getBuyingPrice();
                buyProduct(product, qty);
            }
            case SELL -> {
                transactionAmount = qty * product.getSellingPrice();
                sellProduct(product, qty);
            }
        }
    }
    private static void buyProduct(Product product, int qty){
        if(qty <= 0){
            System.out.println("Wrong Amount");
        } else if (transactionAmount > totalUSDAmount) {
            System.out.println("Your purchase amount is " + transactionAmount +
                    "\nYour available balance is " + totalUSDAmount +
                    "\nNot enough funds to cover your purchase. Please try less qty or add more funds.");
        }else{
            totalUSDAmount -= transactionAmount;
            stock.computeIfPresent(product.productName, (k, v) -> v + qty);
            stock.computeIfAbsent(product.productName, k-> qty);

        }
    }
    
    private static void sellProduct(Product product, int qty){
        if (qty <= 0){
            System.out.println("Wrong Amount");
        }else if(!stock.containsKey(product.productName) || qty > stock.get(product.productName)){
            System.out.println("Your stock for " + product.productName + " is " + stock.get(product.productName) +
                    "\nYou don`t have enough stock. Please try less qty");
        }else{
            totalUSDAmount += transactionAmount;
            stock.computeIfPresent(product.productName, (k, v) -> v - qty);

        }
    }
    public static void print(){
        System.out.println("totalUSDAmount = " + totalUSDAmount);
        System.out.println(stock);
    }
}
