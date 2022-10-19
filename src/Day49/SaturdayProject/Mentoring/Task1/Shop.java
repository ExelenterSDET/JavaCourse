package Day49.SaturdayProject.Mentoring.Task1;

import org.junit.Assert;
import org.junit.Test;

public class Shop {

/*    public static void main(String[] args) {
        Transaction.addFunds(12000);
        Transaction.processTransaction(TransactionType.BUY, Product.COMPUTER, 3);
        Transaction.processTransaction(TransactionType.BUY, Product.PHONE, 5);
        Transaction.processTransaction(TransactionType.BUY, Product.TABLET, 4);
        Transaction.processTransaction(TransactionType.BUY, Product.PLAYSTATION, 2);

        Transaction.processTransaction(TransactionType.SELL, Product.COMPUTER, 3);
        Transaction.processTransaction(TransactionType.SELL, Product.PHONE, 5);
        Transaction.processTransaction(TransactionType.SELL, Product.TABLET, 4);
        Transaction.processTransaction(TransactionType.SELL, Product.PLAYSTATION, 2);

        Transaction.print();
    }*/

    @Test
    public void Test1() {
        double initialUSDAmount = Transaction.totalUSDAmount;
        double amountToAdd = 10000.0;
        Transaction.addFunds(amountToAdd);
        Assert.assertEquals(Transaction.totalUSDAmount, initialUSDAmount + amountToAdd, 0.0);
    }

    @Test
    public void Test2() {
        double initialUSDAmount = Transaction.totalUSDAmount;
        double amountToAdd = 1000.0;
        Integer pcQty = 2;
        Transaction.addFunds(amountToAdd);
        Transaction.processTransaction(TransactionType.BUY, Product.COMPUTER, pcQty);

        Assert.assertEquals((initialUSDAmount + amountToAdd) - Product.COMPUTER.getBuyPrice() * pcQty,
                Transaction.totalUSDAmount, 0.0);
        Assert.assertEquals(Transaction.stock.get(Product.COMPUTER.getProductName()), pcQty);
    }

    @Test
    public void Test3() {
        double initialUSDAmount = Transaction.totalUSDAmount;
        double amountToAdd = 3000.0;
        int pcInitQty = Transaction.stock.get(Product.COMPUTER.getProductName());
        Integer pcQty = 2;
        Integer phoneQty = 3;
        Transaction.addFunds(amountToAdd);
        Transaction.processTransaction(TransactionType.BUY, Product.COMPUTER, pcQty);
        Transaction.processTransaction(TransactionType.BUY, Product.PHONE, phoneQty);

        Assert.assertEquals((initialUSDAmount + amountToAdd) -
                        (Product.COMPUTER.getBuyPrice() * pcQty + Product.PHONE.getBuyPrice() * phoneQty),
                Transaction.totalUSDAmount, 0.0);
        Assert.assertEquals(Transaction.stock.get(Product.COMPUTER.getProductName()), Integer.valueOf(pcInitQty + pcQty));
        Assert.assertEquals(Transaction.stock.get(Product.PHONE.getProductName()), phoneQty);
    }

    @Test
    public void Test4() {
        double initialUSDAmount = Transaction.totalUSDAmount;
        int pcInitQty = Transaction.stock.get(Product.COMPUTER.getProductName());
        int pcQty = 20;
        Transaction.processTransaction(TransactionType.SELL, Product.COMPUTER, pcQty);

        Assert.assertEquals(initialUSDAmount, Transaction.totalUSDAmount, 0.0);
        Assert.assertEquals(pcInitQty, Transaction.stock.get(Product.COMPUTER.getProductName()), 0.0);
    }

    @Test
    public void Test5() {
        double initialUSDAmount = Transaction.totalUSDAmount;
        int pcInitQty = Transaction.stock.get(Product.COMPUTER.getProductName());
        int phoneInitQty = Transaction.stock.get(Product.PHONE.getProductName());
        Double amountToAdd = 8000.0;
        int tabletQty = 5, ps4Qty = 4, pcQty = 5, phoneQty = 3, sellQty = 3;

        Transaction.addFunds(amountToAdd);
        Transaction.processTransaction(TransactionType.BUY, Product.COMPUTER, pcQty);
        Transaction.processTransaction(TransactionType.BUY, Product.PHONE, phoneQty);
        Transaction.processTransaction(TransactionType.BUY, Product.TABLET, tabletQty);
        Transaction.processTransaction(TransactionType.BUY, Product.PLAYSTATION, ps4Qty);
        Transaction.processTransaction(TransactionType.SELL, Product.COMPUTER, sellQty);
        Transaction.processTransaction(TransactionType.SELL, Product.PHONE, sellQty);
        Transaction.processTransaction(TransactionType.SELL, Product.TABLET, sellQty);
        Transaction.processTransaction(TransactionType.SELL, Product.PLAYSTATION, sellQty);

        Assert.assertEquals(((initialUSDAmount + amountToAdd) - (Product.COMPUTER.getBuyPrice() * pcQty
                + Product.PHONE.getBuyPrice() * phoneQty + Product.TABLET.getBuyPrice() * tabletQty
                + Product.PLAYSTATION.getBuyPrice() * ps4Qty) + ((Product.COMPUTER.getSellPrice() + Product.PHONE.getSellPrice()
                + Product.TABLET.getSellPrice() + Product.PLAYSTATION.getSellPrice()) * sellQty)), Transaction.totalUSDAmount, 0.0001);
        Assert.assertEquals(Transaction.stock.get(Product.COMPUTER.getProductName()), Integer.valueOf((pcInitQty + pcQty) - sellQty));
        Assert.assertEquals(Transaction.stock.get(Product.PHONE.getProductName()), Integer.valueOf((phoneInitQty + phoneQty) - sellQty));
        Assert.assertEquals(Transaction.stock.get(Product.TABLET.getProductName()), Integer.valueOf(tabletQty - sellQty));
        Assert.assertEquals(Transaction.stock.get(Product.PLAYSTATION.getProductName()), Integer.valueOf(ps4Qty - sellQty));
    }
}
