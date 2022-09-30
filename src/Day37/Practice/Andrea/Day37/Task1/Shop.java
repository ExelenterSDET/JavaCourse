package Day37.Practice.Andrea.Day37.Task1;



import java.util.ArrayList;

public class Shop {

    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Product laptop = getProductDetails("MacBook Pro", 1, 1700);
        Product tv = getProductDetails("LG", 1, 500);
        Product vaccuum = getProductDetails("vaccuum", 8, 100.00);
        cart.add(laptop);
        cart.add(tv);
        cart.add(vaccuum);

        Consumer consumer = getConsumerDetails("Andrea", cart);
        print(consumer);
    }

    public static Product getProductDetails(String name, int qty, double price){
        Product product = new Product();
        product.productName = name;
        product.quantity = qty;
        product.productPrice = price<0 ? 0 : price;
        return product;
    }

    public static double getPayment (Product product){
        return product.productPrice * product.quantity;
    }

    public static double getPayment (ArrayList<Product> cart){
        double total = 0;
        for (Product product : cart) {
            total += product.productPrice * product.quantity;
        }
        return total;
    }
    public static Consumer getConsumerDetails (String name, ArrayList<Product> cart){
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.cart = cart;
        consumer.balanceDue = getPayment(cart);
        return consumer;
    }
//    public static Consumer getConsumerDetails (String name, Product prod){
//        Consumer consumer = new Consumer();
//        consumer.name = name;
//        consumer.balanceDue = getPayment(prod);
//        consumer.product = prod;
//        return consumer;
//    }

    public static void print (Consumer cons){
        System.out.println("Consumer name: " + cons.name);
        print(cons.cart);
        System.out.println("Total amount due: $" + cons.balanceDue);
    }

    public static void print (ArrayList<Product> cart){
        System.out.println("Items in the cart: ");
        for (Product product : cart) {
            System.out.println(product.productName + " : " + product.quantity + " : $" + product.productPrice );

        }

    }

}




