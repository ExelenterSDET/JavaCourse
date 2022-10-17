package Day49.SaturdayProject.Ibrahim.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;


public class Shop {

    Transaction tr1 = new Transaction();
    double addFund = 100000;

    @Test
    public void testAddingFund(){

        Transaction.addFunds(addFund);
        Assert.assertEquals(addFund, Transaction.totalUSDAmount);
        System.out.println("TotalUSDAmount = " + Transaction.totalUSDAmount);
        System.out.println(" ========================================= ");
    }

    @Test
    public void testBuyOneProduct(){
        Transaction.totalUSDAmount = 0;
        Transaction.addFunds(addFund);


        String p1 = "Macbook";
        double pr1Price = 1000.50;
        int qty = 5;
        double totalAmountAfter = Transaction.totalUSDAmount - pr1Price * qty;


        tr1.processTransaction(TransactionType.BUY, Product.COMPUTER, 5);

        Assert.assertEquals(totalAmountAfter, Transaction.totalUSDAmount);

        System.out.println("Total Amount After = " + totalAmountAfter);
        System.out.println("Product = " + p1 + " : Quantity = " + qty);
        Transaction.print();
        System.out.println(" ========================================= ");
    }

    @Test
    public void testBuyTwoProduct() {
        Transaction.stock.clear();
        Transaction.totalUSDAmount = 0;
        Transaction.addFunds(addFund);

        String pr1Name = "Macbook", pr2Name = "Ipad";
        double pr1Price = 1000.50, pr2Price = 250;
        int pr1Qty = 5, pr2Qty = 10;
        HashMap<String, Integer> list = new HashMap<>();
        list.put(pr1Name, pr1Qty);
        list.put(pr2Name, pr2Qty);

        double totalBuy = (pr1Price * pr1Qty) + (pr2Price * pr2Qty);

        double totalAmountAfter = Transaction.totalUSDAmount - totalBuy;

        tr1.processTransaction(TransactionType.BUY, Product.COMPUTER, 5);
        tr1.processTransaction(TransactionType.BUY, Product.TABLET, 10);

        System.out.println("Product1 Name = " + pr1Name + " : Product1 Quantity : " + pr1Qty );
        System.out.println("Product2 Name = " + pr2Name + " : Product2 Quantity : " + pr2Qty );
        System.out.println("Total Amount After = " + totalAmountAfter);
        Transaction.print();

        Assert.assertEqualsDeep(list, Transaction.stock);
        Assert.assertEquals(totalAmountAfter, Transaction.totalUSDAmount);
        System.out.println(" ========================================= ");
    }

    @Test
    public void testSell(){
        Transaction.stock.clear();
        Transaction.totalUSDAmount = 0;
        Transaction.addFunds(addFund);

        String pr1Name = "Macbook";
        double pr1Price = 1000.50, pr1SellPrice = 1200.30;
        int pr1BuyQty = 5, pr1SellQty = 12;
        HashMap<String, Integer> list = new HashMap<>();
        list.put(pr1Name, pr1BuyQty);

        double totalBuy = (pr1Price * pr1BuyQty);

        double totalAmountAfter = Transaction.totalUSDAmount - totalBuy;

        tr1.processTransaction(TransactionType.BUY, Product.COMPUTER, 5);
        tr1.processTransaction(TransactionType.SELL, Product.COMPUTER, 12);

        System.out.println("Product1 Name = " + pr1Name + " : Product1 Quantity : " + (pr1BuyQty));

        System.out.println("Total Amount After = " + totalAmountAfter);
        Transaction.print();

        Assert.assertEqualsDeep(list, Transaction.stock);
        Assert.assertEquals(totalAmountAfter, Transaction.totalUSDAmount);
        System.out.println(" ========================================= ");


    }

    @Test
    public void testMultiProcess(){
        Transaction.stock.clear();
        Transaction.totalUSDAmount = 0;
        Transaction.addFunds(addFund);

        String pr1Name = "Macbook", pr2Name = "Ipad";
        double pr1BuyPrice = 1000.50, pr2BuyPrice = 250, pr1SellPrice = 1200.30, pr2SellPrice = 285.35;
        int pr1BuyQty = 5, pr2BuyQty = 10, pr1SellQty = 2, pr2SellQty = 5;
        HashMap<String, Integer> list = new HashMap<>();
        list.put(pr1Name, pr1BuyQty - pr1SellQty);
        list.put(pr2Name, pr2BuyQty - pr2SellQty);


        double totalBuy = (pr1BuyPrice * pr1BuyQty) + (pr2BuyPrice * pr2BuyQty);
        double totalSell = (pr1SellPrice * pr1SellQty) + (pr2SellPrice * pr2SellQty);

        double totalAmountAfter = Transaction.totalUSDAmount - totalBuy + totalSell;

        tr1.processTransaction(TransactionType.BUY, Product.COMPUTER, 5);
        tr1.processTransaction(TransactionType.BUY, Product.TABLET, 10);
        tr1.processTransaction(TransactionType.SELL, Product.COMPUTER, 2);
        tr1.processTransaction(TransactionType.SELL, Product.TABLET, 5);

        System.out.println("Product1 Name = " + pr1Name + " : Product1 Quantity : " + (pr1BuyQty - pr1SellQty) );
        System.out.println("Product2 Name = " + pr2Name + " : Product2 Quantity : " + (pr2BuyQty - pr2SellQty) );
        System.out.println("Total Amount After = " + totalAmountAfter);
        Transaction.print();

        Assert.assertEqualsDeep(list, Transaction.stock);
        Assert.assertEquals(totalAmountAfter, Transaction.totalUSDAmount);
        System.out.println(" ========================================= ");

    }
}
