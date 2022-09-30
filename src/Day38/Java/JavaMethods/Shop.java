package Day38.Java.JavaMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {
        Product product = new Product();
        Consumer consumer = new Consumer();

        Product phone = product.getProductDetails("phone", 2, 500);
        Product laptop = product.getProductDetails("MacBook Pro", 1, 1700);
        Product tv = product.getProductDetails("LG", 1, 500);
        Product tablet = product.getProductDetails("IPad", 2, 850);

        ArrayList<Product> cartOfConsumer1 = new ArrayList<>();
        cartOfConsumer1.add(phone);
        cartOfConsumer1.add(laptop);
        cartOfConsumer1.add(tv);
        cartOfConsumer1.add( tablet);

        ArrayList<Product> cartOfConsumer2 = new ArrayList<>();
        cartOfConsumer2.add(phone);
        cartOfConsumer2.add( tablet);

        Consumer consumer1 = consumer.getConsumerDetails("Ali",cartOfConsumer1);
        consumer.print(consumer1);

        Consumer consumer2 = consumer.getConsumerDetails("John", cartOfConsumer2);
        consumer.print(consumer2);

        System.out.println("============================");
        System.out.println(consumer2);

    }
}
