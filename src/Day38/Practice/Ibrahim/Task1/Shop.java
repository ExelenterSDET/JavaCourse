package Day38.Practice.Ibrahim.Task1;

import java.util.ArrayList;


public class Shop {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Product product = new Product();
        Consumer consumer = new Consumer();

        Product phone = product.getProduct("phone", 2, 500);
        Product laptop = product.getProduct("MacBook Pro", 1, 1700);
        Product tv = product.getProduct("LG", 1, 500);
        Product tablet = product.getProduct("IPad", 2, 850);

        cart.add(phone);
        cart.add(laptop);
        cart.add(tv);
        cart.add(tablet);

        Consumer consumer1 = consumer.getConsumer("Ibrahim", cart);
        consumer.print(consumer1);

        System.out.println("consumer1 = " + consumer1);
    }
}



