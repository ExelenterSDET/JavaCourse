package Day38.Practice.Ibrahim.Task1;

import java.util.ArrayList;

public class Consumer {
    String name;
    double balanceDue;
    Product product;
    ArrayList<Product> cart;

    double getTotal(Product product){
        return product.productQty * product.productPrice;
    }

    double getTotal(ArrayList<Product> cart){
        double total = 0;
        for (Product product : cart) {
            total += getTotal(product);
        }
        return total;
    }
    Consumer getConsumer(String  name, Product product){
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.product = product;
        consumer.balanceDue = consumer.getTotal(product);
        return consumer;
    }

    Consumer getConsumer(String  name, ArrayList<Product> cart){
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.cart = cart;
        consumer.balanceDue = consumer.getTotal(cart);

        return consumer;
    }
    void print(Consumer consumer){
        Product product =new Product();
        System.out.println(consumer.name);
        product.print(consumer.cart);
        System.out.println("$" + consumer.balanceDue);
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", balanceDue=" + balanceDue +
                '}';
    }
}
