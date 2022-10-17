package Day49.SaturdayProject.Mentoring.Task1;

import org.junit.Assert;
import org.junit.Test;

public class Shop {

    public static void main(String[] args) {
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
    }

    @Test
    public void Test1(){
        Transaction.addFunds(10000);
        boolean isEqual = Transaction.totalUSDAmount == 10000;
        Assert.assertTrue(isEqual);
    }
}
