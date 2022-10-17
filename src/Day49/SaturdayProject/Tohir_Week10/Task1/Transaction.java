package Week10.Task1;

import java.util.HashMap;
import java.util.Map;

public class Transaction {
    public double totalUSDAmount; //(should be class attribute and accessible for all classes)
    public static HashMap<String, Integer> stock; // (should be class attribute, not editable and accessible for all classes)
    private double transactionAmount; // (should be class object attribute and accessible only within the class)

    public Transaction(HashMap<String, Integer> stock) {
        this.stock = stock;
    }
    //2. Create a method named as addFunds.
    // It should update totalUSDAmount. (should be class method and accessible for all classes)
    public void addFunds(double funds)
    {
        this.totalUSDAmount+=funds;
    }
    //    3. Create a method named as processTransaction (method should be a public class method)
    //       Parameters:
    //       TransactionType,
    //       Product,
    //       int qty
    //       -- In this method, depending on TransactionType, you should assign value to transactionAmount.
    //            --- if TransactionType is BUY, use Product buy price multiplied by qty
    //            --- if TransactionType is SELL, use Product sell price multiplied by qty
    //       -- Depending on TransactionType, you should switch between the methods buyProduct() or sellProduct().
    //       Note: probably you should first create steps 5 and 6 (create methods buyProduct() and sellProduct())
    public void processTransaction(EnumTransactionType TransactionType, String Product, int qty)
    {
       switch (TransactionType)
       {
           case BUY:
               System.out.println("Buy");
           case SELL:
               System.out.println("Sell");
       }
    }
    //    4. Create a method named as buyProduct (method should be a private class object method)
    //       Parameters:
    //       Product
    //       int qty
    //       -- if qty is less or equal 0, then print Wrong amount and do not take any actions.
    //           --- if qty is greater then 0, but transactionAmount is greater then totalUSDAmount, then print following:
    //                "Your purchase amount is " + transactionAmount
    //                "Your available balance is " + totalUSDAmount
    //                "Not enough funds to cover your purchase. Please try less qty or add more funds. "
    //           --- if not above conditions,
    //                deduct transactionAmount from totalUSDAmount
    //                update/add to stock MAP. Key -> Product`s name, Value -> qty

    private void buyProduct(String Product, int qty){
        if(qty>0)
        {
            if(this.transactionAmount>this.totalUSDAmount)
            {
                System.out.println("Your purchase amount is " + this.transactionAmount);
                System.out.println("Your available balance is " + this.totalUSDAmount);
                System.out.println("Not enough funds to cover your purchase. Please try less qty or add more funds. ");
            }
            else {
                totalUSDAmount-=transactionAmount;
                stock.put(Product,qty);
            }
        }
        else {
            System.out.println("Wrong amount");
        }
    }
    //    5. Create a method named as sellProduct (method should be a private class object method)
    //       Parameters:
    //       Product
    //       int qty
    //        -- if qty is less or equal 0, then print Wrong amount and do not take any actions.
    //            -- in this method you will check the Map stock. If you don`t have Product in stock, or don`t have enough quantity to sell print:
    //                "Your stock for " + {product name} + " is " + {product stock amount}
    //                "You don`t have enough stock. Please try less qty"
    //            --- if not above conditions,
    //                add transactionAmount to totalUSDAmount
    //                update/deduct from stock MAP. Key -> Product`s name, Value -> qty
    //        }
    private void sellProduct(String Product, int qty){
        if(qty>0&&stock.containsKey(Product))
        {
            if(stock.containsKey(Product)&&stock.get(Product)<qty)
            {
                totalUSDAmount+=transactionAmount;
                int newstock = stock.get(Product)-qty;
                stock.replace(Product,newstock);
            }
            else {
                System.out.println("Your stock for " + Product + " is " + stock.get(Product));
                System.out.println("You don`t have enough stock. Please try less qty");
            }
        }
        else {
            System.out.println("Wrong amount or product does not exist in the stock");
        }
    }
    public void print()
    {
        System.out.println(this.totalUSDAmount);
        this.stock.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "totalUSDAmount=" + totalUSDAmount +
             //   ", transactionAmount=" + transactionAmount +
                '}';
    }
}
