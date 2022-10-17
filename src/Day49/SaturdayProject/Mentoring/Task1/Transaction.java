package Day49.SaturdayProject.Mentoring.Task1;

import java.util.HashMap;

public class Transaction {

    public static double totalUSDAmount;
    public static final HashMap<String, Integer> stock = new HashMap<>();
    private double transactionAmount;

    public static void addFunds(double amount){
        totalUSDAmount += amount;
    }
    public static void processTransaction(TransactionType type, Product product, int qty){
        Transaction transaction = new Transaction();
        switch (type){
            case BUY:
                transaction.transactionAmount = product.getBuyPrice()*qty;
                transaction.buyProduct(product, qty);
                break;
            case SELL:
                transaction.transactionAmount = product.getSellPrice()*qty;
                transaction.sellProduct(product, qty);
                break;
        }
    }
    private void buyProduct(Product product, int qty){
        if (qty <= 0) System.out.println("Wrong amount");
        else {
            if (transactionAmount > totalUSDAmount){
                System.out.println("Your purchase amount is " + transactionAmount);
                System.out.println("Your available balance is " + totalUSDAmount);
                System.out.println("Not enough funds to cover your purchase. Please try less qty or add more funds.");
            } else {
                totalUSDAmount -= transactionAmount;
                stock.put(product.getProductName(), stock.getOrDefault(product.getProductName(), 0) + qty);
            }
        }
    }
    private void sellProduct(Product product, int qty){
        if (qty <= 0) System.out.println("Wrong amount");
        else {
            if (stock.get(product.getProductName()) == null || qty > stock.get(product.getProductName())){
                System.out.println("Your stock for " + product.getProductName() + " is "
                + (stock.get(product.getProductName()) == null ? 0 : stock.get(product.getProductName())));
            } else {
                totalUSDAmount += transactionAmount;
                stock.computeIfPresent(product.getProductName(), (k, v) -> v-qty);
            }
        }
    }
    public static void print(){
        System.out.println("Total funds $" + totalUSDAmount + "\nstock = " + stock);
    }
}
