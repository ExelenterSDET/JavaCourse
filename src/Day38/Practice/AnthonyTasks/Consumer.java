package Day38.Practice.AnthonyTasks;

import java.util.ArrayList;

public class Consumer {
    String name;
    double balanceDue;
    ArrayList<Product> cart;

    public double getPaymentTotal(ArrayList<Product> cart){
        double total = 0;
        for(Product product : cart){
            total += product.productPrice * product.productQty;
        }
        return total;
    }

    public Consumer getConsumerDetails(String name, ArrayList<Product> cart){
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.cart = cart;
        consumer.balanceDue = getPaymentTotal(cart);
        return consumer;
    }

    public void print(Consumer consumer){
        Product product = new Product();
        System.out.println("Consumer name : " + consumer.name);
        System.out.println("================");
        product.print(consumer.cart);
        System.out.println("================");
        System.out.println("Balance Due : $" + consumer.balanceDue);
    }

    public String toString() {
        Product product = new Product();
        product.print(cart);
        return "{" +
                "" + name +
                ", $" + balanceDue +
                '}';
    }
}
