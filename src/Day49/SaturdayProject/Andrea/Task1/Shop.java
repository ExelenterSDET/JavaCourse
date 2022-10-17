package Day49.SaturdayProject.Andrea.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;



public class Shop {

    @Test
    public void test1(){
        double usdAmountBeforeTransaction = Transaction.totalUSDAmount;
        Transaction t1 = new Transaction();
        t1.addFunds(3000);
        Transaction t2 = new Transaction();
        t2.addFunds(4000);
        System.out.println(Transaction.getTotalUSDAmount());
        Assert.assertEquals(Transaction.getTotalUSDAmount(), usdAmountBeforeTransaction+7000);
    }

    @Test
    public void test2(){
        Product p2 = Product.TABLET;
        Transaction t2 = new Transaction();
        Integer quantityBeforeTransaction;
        if (Transaction.stock.containsKey(p2.getNameOfProduct())){
            quantityBeforeTransaction = Transaction.stock.get(p2.getNameOfProduct());
        }
        else{
            quantityBeforeTransaction = 0;
        }
        double usdAmountBeforeTransaction = Transaction.totalUSDAmount;
        t2.addFunds(1000);
        t2.processTransaction(TransactionType.BUY, p2, 1);
        Transaction.print(p2);
        System.out.println(Arrays.asList(Transaction.stock));
        Assert.assertEquals(Transaction.getTotalUSDAmount(), usdAmountBeforeTransaction+750);
        Integer quantity = Transaction.stock.get(p2.getNameOfProduct()) + quantityBeforeTransaction;
        Assert.assertEquals((Transaction.stock.get(p2.getNameOfProduct())), quantity);
    }

    @Test
    public void test3(){
        Transaction t3 = new Transaction();
        Product p3 = Product.TABLET;
        Product p4 = Product.PHONE;
        Integer quantityBeforeTransactionP3;
        Integer quantityBeforeTransactionP4;
        if (Transaction.stock.containsKey(p3.getNameOfProduct())){
            quantityBeforeTransactionP3 = Transaction.stock.get(p3.getNameOfProduct());
        }
        else{
            quantityBeforeTransactionP3 = 0;
        }
        if (Transaction.stock.containsKey(p4.getNameOfProduct())){
            quantityBeforeTransactionP4 = Transaction.stock.get(p4.getNameOfProduct());
        }
        else{
            quantityBeforeTransactionP4 = 0;
        }
        System.out.println("quantityBeforeTransactionP3 = " + quantityBeforeTransactionP3);
        System.out.println("quantityBeforeTransactionP4 = " + quantityBeforeTransactionP4);
        double usdAmountBeforeTransaction = Transaction.totalUSDAmount;
        System.out.println("usdAmountBeforeTransaction = " + usdAmountBeforeTransaction);
        t3.addFunds(2500);
        System.out.println(Transaction.getTotalUSDAmount());
        t3.processTransaction(TransactionType.BUY, p3, 1);
        Transaction.print(p3);
        t3.processTransaction(TransactionType.BUY, p4, 1);
        Transaction.print(p4);
        System.out.println(Arrays.asList(Transaction.stock));
        Assert.assertEquals(Transaction.getTotalUSDAmount(), usdAmountBeforeTransaction + 1449.6);
        Integer quantityP3 = quantityBeforeTransactionP3 +1;
        Integer quantityP4 = quantityBeforeTransactionP4 +1;
        System.out.println("Quantity before trans: " + quantityBeforeTransactionP3);
        Assert.assertEquals(Transaction.stock.get(p3.getNameOfProduct()), quantityP3);
        Assert.assertEquals(Transaction.stock.get(p4.getNameOfProduct()), quantityP4);
    }

    @Test
    public void test4(){
        Transaction t4 = new Transaction();
        Product p5 = Product.TABLET;
        Integer quantityBeforeTransactionP5;
        double usdAmountBeforeTransaction = Transaction.totalUSDAmount;
        if (Transaction.stock.containsKey(p5.getNameOfProduct())){
            quantityBeforeTransactionP5 = Transaction.stock.get(p5.getNameOfProduct());
            if (Transaction.stock.get(p5.getNameOfProduct()) > 0){
                t4.processTransaction(TransactionType.SELL, p5, 1);
            }
        }
        else{
            quantityBeforeTransactionP5 = 0;
        }
        Transaction.print(p5);
        System.out.println(Transaction.getTotalUSDAmount());
        Integer quantityP5 = quantityBeforeTransactionP5 -1;
        System.out.println("Quantity before trans: " + quantityBeforeTransactionP5);
        System.out.println(Arrays.asList(Transaction.stock));
        Assert.assertEquals(Transaction.stock.get(p5.getNameOfProduct()), quantityP5);
        Assert.assertEquals(Transaction.getTotalUSDAmount(), usdAmountBeforeTransaction+285.35);
    }

    @Test
    public void test5(){
        Transaction t5 = new Transaction();
        double usdAmountBeforeTransaction = Transaction.totalUSDAmount;
        t5.addFunds(1000);
        Product p6 = Product.COMPUTER;
        Product p7 = Product.PLAYSTATION;
        Product p8 = Product.PHONE;
        Product p9 = Product.PLAYSTATION;
        Integer quantityBeforeTransactionP6;
        Integer quantityBeforeTransactionP7;
        Integer quantityBeforeTransactionP8;
        if (Transaction.stock.containsKey(p6.getNameOfProduct())){
            quantityBeforeTransactionP6 = Transaction.stock.get(p6.getNameOfProduct());
        }
        else{
            quantityBeforeTransactionP6 = 0;
        }
        if (Transaction.stock.containsKey(p7.getNameOfProduct())){
            quantityBeforeTransactionP7 = Transaction.stock.get(p7.getNameOfProduct());
        }
        else{
            quantityBeforeTransactionP7 = 0;
        }
        if (Transaction.stock.containsKey(p8.getNameOfProduct())){
            quantityBeforeTransactionP8 = Transaction.stock.get(p8.getNameOfProduct());
        }
        else{
            quantityBeforeTransactionP8 = 0;
        }
        t5.processTransaction(TransactionType.BUY, p6, 1);
        Transaction.print(p6);
        t5.processTransaction(TransactionType.BUY, p7, 2);
        Transaction.print(p7);
        t5.processTransaction(TransactionType.BUY, p8, 1);
        Transaction.print(p8);
        System.out.println(Arrays.asList(Transaction.stock));
        Integer quantityP6 = quantityBeforeTransactionP6 +1;
        Integer quantityP7 = quantityBeforeTransactionP7 +2;
        Integer quantityP8 = quantityBeforeTransactionP8 +1;
        Assert.assertEquals(Transaction.stock.get(p6.getNameOfProduct()), quantityP6);
        Assert.assertEquals(Transaction.stock.get(p7.getNameOfProduct()), quantityP7);
        Assert.assertEquals(Transaction.stock.get(p8.getNameOfProduct()), quantityP8);
        Integer quantityBeforeTransactionP9;
        if (Transaction.stock.containsKey(p9.getNameOfProduct())){
            quantityBeforeTransactionP9 = Transaction.stock.get(p9.getNameOfProduct());
            if (Transaction.stock.get(p9.getNameOfProduct()) > 0){
                t5.processTransaction(TransactionType.SELL, p9, 1);
            }
        }
        else{
            quantityBeforeTransactionP9 = 0;
        }
        Integer quantityP9 = quantityBeforeTransactionP9 -1;
        Assert.assertEquals(Transaction.stock.get(p9.getNameOfProduct()), quantityP9);
        System.out.println(usdAmountBeforeTransaction);

        String sValue = String.format("%.2f", usdAmountBeforeTransaction-1201.05);
        double newValue = Double.parseDouble(sValue);
        Assert.assertEquals(Transaction.getTotalUSDAmount(), newValue);
    }
}


//    public static void main(String[] args) {

//        Product p1 = Product.COMPUTER;
//        Product p2 = Product.PHONE;
//
//        Transaction t1 = new Transaction();
//        t1.addFunds(3000);
//        t1.processTransaction(TransactionType.BUY, p1, 2);
//        Transaction.print(p1);
//
//        Transaction t2 = new Transaction();
//        t2.addFunds(4000);
//        t2.processTransaction(TransactionType.BUY, p1, 2);
//        Transaction.print(p1);
//
//        Transaction t5 = new Transaction();
//        t5.processTransaction(TransactionType.SELL, p1, 1);
//        Transaction.print(p1);
//
//
//        Transaction t3 = new Transaction();
//        t3.processTransaction(TransactionType.BUY, p2, 1);
//        Transaction.print(p2);
//
//        Transaction t4 = new Transaction();
//        t4.processTransaction(TransactionType.BUY, p2, 1);
//        Transaction.print(p2);
//
//        Transaction t6 = new Transaction();
//        t6.processTransaction(TransactionType.SELL, p2, 2);
//        Transaction.print(p2);
//    }
