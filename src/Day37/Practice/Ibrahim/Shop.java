package Day37.Practice.Ibrahim;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Task 1.

        Create class as a Product
        productName
        productQty
        productPrice

        Create class as a Consumer
        name
        balanceDue
        Product

        Task 2.
        In Shop class create a method
        which will set values to the
        Product class attributes

        Task 3.
        In Shop class create a method which will return
        total payment.

        Task 4.
        Create a method which will set values to the Consumer class attributes.
        Note: balanceDue should not be hardcoded

        Task 5.
        Create a method to print all Consumer attributes.

        Task 6.
          In the main method create product, consumer and then print.

        Task 7.
        Modify the code so that if the product price
        is less then 0,
        default price should stay as 0;

        Task 8.
        Modify code so that Consumer
        could buy more type of products.

        Task 9.
        Modify getPaymentTotal method,
        so we can calculate total for all products

        Task 10.
        Modify the getConsumerDetails method so
        that we can handle ArrayList<Product>

        Task 11.
        Modify print method.
 */
public class Shop {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();

        Product phone = getProduct("phone", 2, 500);
        Product laptop = getProduct("MacBook Pro", 1, 1700);
        Product tv = getProduct("LG", 1, 500);
        Product tablet = getProduct("IPad", 2, 850);

        cart.add(phone);
        cart.add(laptop);
        cart.add(tv);
        cart.add(tablet);

        Consumer ibrahim = getConsumer("Ibrahim", cart);
        print(ibrahim);
    }
    static Product getProduct(String name, int qty, double price){
        Product product = new Product();
        product.productName = name;
        product.productQty = qty;
        product.productPrice = price < 0 ? 0 : price;
        return product;
    }

    static double getTotal(Product product){
        return product.productQty * product.productPrice;
    }

    static double getTotal(ArrayList<Product> cart){
        double total = 0;
        for (Product product : cart) {
            total += getTotal(product);
        }
        return total;
    }

    static Consumer getConsumer(String  name, Product product){
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.product = product;
        consumer.balanceDue = getTotal(product);
        return consumer;
    }

    static Consumer getConsumer(String  name, ArrayList<Product> cart){
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.cart = cart;
        consumer.balanceDue = getTotal(cart);

        return consumer;
    }

    static void print(Consumer consumer){
        System.out.println(consumer.name);
        print(consumer.cart);
        System.out.println("$" + consumer.balanceDue);
    }

    static void print(ArrayList<Product> cart){
//        for (Product product : cart) {
//            System.out.println(product.productName + " : "
//                                + product.productQty + " : $"
//                                + product.productPrice );
//        }

        cart.forEach(a-> {System.out.println(a.productName + " : "
                + a.productQty + " : $"
                + a.productPrice );});
    }
}



