package Day38.Practice.Dilnoza.Task1.Task;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        Consumer consumer = new Consumer();
        Product phone = getProductDetails("phone", 2, 500);
        Product laptop = getProductDetails("MacBook Pro", 1, 1700);
        Product tv = getProductDetails("LG", 1, 500);
        Product tablet = getProductDetails("IPad", 2, 850);

        ArrayList<Product> cartOfConsumer1 = new ArrayList<>();
        cartOfConsumer1.add(phone);
        cartOfConsumer1.add(laptop);
        cartOfConsumer1.add(tv);
        cartOfConsumer1.add( tablet);

        Consumer consumer1 = consumer.createConsumer2("Ali",cartOfConsumer1);
        consumer.toPrint(consumer1);

        ArrayList<Product> cartOfConsumer2 = new ArrayList<>();
        cartOfConsumer2.add(phone);
        cartOfConsumer2.add(laptop);
        System.out.println("==================");
        Consumer consumer2 = consumer.createConsumer2("John",cartOfConsumer2);
        consumer.toPrint(consumer2);


        System.out.println("consumer2 = " + consumer2);


    }
        public static Product getProductDetails(String productName, int productQty, double productPrice){
            Product product = new Product();
            product.productName= productName;
            product.productQty = productQty;
            product.productPrice= productPrice;
            if(product.productPrice<0){
                product.productPrice=0;
            }
            return product;
        }








}
