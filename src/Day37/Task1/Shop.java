package Day37.Task1;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Product phone = getProductDetails("phone", 2, 500);
        Product laptop = getProductDetails("MacBook Pro", 1, 1700);
        Product tv = getProductDetails("LG", 1, 500);
        Product tablet = getProductDetails("IPad", 2, 850);
        cart.add(phone);
        cart.add(laptop);
        cart.add(tv);
        cart.add( tablet);

        Consumer consumer = getConsumerDetails("Ali",cart);
        print(consumer);

    }

    public static Product getProductDetails(String productName, int qty, double price){
       Product product = new Product();
       product.productName = productName;
       product.productQty = qty;
       product.productPrice = price<0 ? 0 : price;
       return product;
    }

//    public static double getPaymentTotal(Product product){
//        return product.productQty*product.productPrice;
//    }

    public static double getPaymentTotal(ArrayList<Product> cart){
        double total = 0;

        for(Product product : cart){
            total += product.productPrice * product.productQty;
        }
        return total;
    }
//    public static Consumer getConsumerDetails(String name, Product product){
//        Consumer consumer = new Consumer();
//        consumer.name = name;
//        consumer.product = product;
//        consumer.balanceDue = getPaymentTotal(product);
//        return consumer;
//    }

    public static Consumer getConsumerDetails(String name, ArrayList<Product> cart){
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.cart = cart;
        consumer.balanceDue = getPaymentTotal(cart);
        return consumer;
    }

    public static void print(Consumer consumer){
        System.out.println("Consumer name : " + consumer.name);
        System.out.println("================");
        print(consumer.cart);
        System.out.println("================");
        System.out.println("Balance Due : $" + consumer.balanceDue);
    }

    public static void print(ArrayList<Product> cart){
        System.out.println("Items in the cart : ");
        for(Product product : cart){
            System.out.println(product.productName + " : "
                    + product.productQty + " * $"
                    + product.productPrice + "; ");
        }
    }
}
