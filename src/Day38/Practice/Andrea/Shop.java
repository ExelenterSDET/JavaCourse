package Day38.Practice.Andrea;

import java.util.ArrayList;

public class Shop {

    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Product product = new Product();
        Consumer consumer = new Consumer();

        Product laptop = product.getProductDetails("MacBook Pro", 1, 1700);
        Product tv = product.getProductDetails("LG", 1, 500);
        Product vaccuum = product.getProductDetails("vaccuum", 8, 100.00);
        cart.add(laptop);
        cart.add(tv);
        cart.add(vaccuum);

        Consumer consumer1 = consumer.getConsumerDetails("Andrea", cart);
        consumer.print(consumer1);
    }




}




