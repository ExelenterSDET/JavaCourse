package Day49.SaturdayProject.Andrea.Task1;

import java.util.HashMap;

public class Transaction {

    static double totalUSDAmount;
    static HashMap<String, Integer> stock = new HashMap<>();
    static double transactionAmount;

    void addFunds(double amt){
        totalUSDAmount += amt;
    }

    public void processTransaction(TransactionType type, Product product, int qty){
        if(type==TransactionType.SELL){
            transactionAmount = product.sellPrice * qty;
            sellProduct(product, qty);
        }
        else if(type==TransactionType.BUY){
            transactionAmount = product.buyPrice * qty;
            buyProduct(product, qty);
        }
    }

    private void buyProduct(Product product, int qty) {
        if (qty <= 0) {
            System.out.println("Wrong amount");
        } else {
            if(transactionAmount > totalUSDAmount){
                System.out.println("Your purchase amount is $" + transactionAmount +
                        "\n Your available balance is $" + totalUSDAmount +
                        "\n Not enough funds to cover your purchase. Please try less qty or add more funds.");
            }
            else{
                totalUSDAmount -= transactionAmount;
                int quantity;
                if (stock.containsKey(product.getNameOfProduct())) {
                    quantity = stock.get(product.getNameOfProduct()) + qty;
                    stock.put(product.getNameOfProduct(), quantity);
                }
                else {
                    stock.put(product.getNameOfProduct(), qty);
                }
            }
        }
    }

    private void sellProduct(Product product, int qty) {
        if (qty <= 0) {
            System.out.println("Wrong amount");
        } else {
            int quantity;
            if (stock.containsKey(product.getNameOfProduct())) {
                quantity = stock.get(product.getNameOfProduct());
                if((quantity-qty) <= 0){
                    System.out.println("Your stock for " + product.getNameOfProduct() +
                            " is " + quantity + ". You don't have enough stock. Please try less qty.") ;
                }
                else {
                    quantity -= qty;
                    stock.put(product.getNameOfProduct(), quantity);
                    totalUSDAmount += transactionAmount;
                }
            }
            else {
                System.out.println("This item is not in stock.");
            }
        }
    }

    static void print(Product product){
        System.out.println("Product name: " + product.getNameOfProduct() + "\nTotal USD = $" + totalUSDAmount + "\n Quantity of stock is: " + stock.get(product.getNameOfProduct()));
    }

    public static double getTotalUSDAmount() {
        return totalUSDAmount;
    }
}
