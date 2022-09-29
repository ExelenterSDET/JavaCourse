package Day37.Practice.Anthony;



import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        ArrayList<ProductAnthony> cart = new ArrayList<>();
        ProductAnthony laptop = getProductDetails(" ,Laptop ", 1,2000);
        ProductAnthony phone = getProductDetails(" Phone ", 2,500);
        ProductAnthony TV = getProductDetails(" ,Samsung ", 1,2800);
        cart.add(phone);
        cart.add(laptop);
        cart.add(TV);

        ConsumerAnthony consumer = getConsumerDetails2("Anthony ",cart);
        System.out.println("=======================================");
        print(consumer);






    }
    public static ProductAnthony getProductDetails (String productName, int qty, double price){
        ProductAnthony product = new ProductAnthony();
        product.productName = productName;
        product.productQty = qty;
        product.productPrice = price < 0 ? 0 : price;
        return product;
    }

//    public static Consumer getConsumerDetails (String name, double balanceDue,Product product) {
//        Consumer consumer = new Consumer();
//        consumer.name = name;
//        consumer.balanceDue = balanceDue;
//        consumer.product = product;
//        return consumer;
//}
//    public static double getPaymentTotal(Product product){
//
//       return product.productQty*product.productPrice;
//
//   }
    public static double getPaymentTotal2(ArrayList<ProductAnthony> cart) {
        double total = 0;
        for(ProductAnthony productAnthony  : cart){
            total += productAnthony.productQty * productAnthony.productPrice;
        }
        return total;
    }
//    public static Consumer getConsumerDetails (String name, Product product){
//        Consumer consumer = new Consumer();
//        consumer.name = name;
//        consumer.product = product;
//        consumer.balanceDue = getPaymentTotal(product);
//        return consumer;
//
//
//    }
    public static ConsumerAnthony getConsumerDetails2 (String name, ArrayList<ProductAnthony> cart) {
        ConsumerAnthony consumer = new ConsumerAnthony();
        consumer.name = name;
        consumer.cart = cart;
        consumer.balanceDue = getPaymentTotal2(cart);
        return consumer;
    }

    public static void print(ConsumerAnthony consumer){
        System.out.println(" Consumer name: " + consumer.name);
        System.out.println("=======================================");
        print(consumer.cart);
        System.out.println("\n" + "=======================================");
        System.out.println(" Balance Due : $" + consumer.balanceDue);
    }
    public static void print (ArrayList<ProductAnthony> cart){
        System.out.println("Items in the cart: ");
        for (ProductAnthony product : cart){
            System.out.print(product.productName + ": "
                    + product.productQty + " * $"
                    + product.productPrice);
        }
    }

}
