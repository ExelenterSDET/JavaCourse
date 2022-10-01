package Day38.Practice.Andrea;

import java.util.ArrayList;

public class Consumer {
    String name;
    //Product product;
    double balanceDue;
    ArrayList<Product> cart;

    public double getPayment(ArrayList<Product> cart) {
        double total = 0;
        for (Product product : cart) {
            total += product.productPrice * product.quantity;
        }
        return total;
    }

    public Consumer getConsumerDetails(String name, ArrayList<Product> cart) {
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.cart = cart;
        consumer.balanceDue = getPayment(cart);
        return consumer;
    }

    public void print (Consumer cons){
        Product product = new Product();
        System.out.println("Consumer name: " + cons.name);
        product.print(cons.cart);
        System.out.println("Total amount due: $" + cons.balanceDue);
    }
}
    
