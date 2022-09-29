package Day37.Practice.Dilnoza;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        Product product = new Product();
        Product productDetails = getProductDetails("Electronics", 2, 500.00);
        double total = getTotal(productDetails);
        Consumer name = createConsumer("Sam", productDetails);
        Consumer consumer = new Consumer();
        toPrint(name);

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


        public static double getTotal(Product product){
       double sum=product.productQty*product.productPrice;
       return sum;
        }
        public static double getTotal(ArrayList<Product> cart){
        double sum =0.0;
            for (Product product : cart) {
                sum+=product.productPrice* product.productQty;
            }
            return sum;
            }





        public static Consumer createConsumer(String name,Product product){
        Consumer consumer = new Consumer();
        consumer.name= name;
        consumer.product=product;
        consumer.balanceDue=getTotal(product);

       return consumer;

        }
    public static Consumer createConsumer2(String name,ArrayList<Product>cart){
        Consumer consumer = new Consumer();
        consumer.name= name;
        consumer.cart=cart;
        consumer.balanceDue=getTotal(cart);
        consumer.cart=cart;

        return consumer;

    }
        public static void toPrint(Consumer consumer){
            System.out.println("Name =>" +consumer.name);
            print(consumer.cart);
            System.out.println(" +consumer.balanceDue =>"+consumer.balanceDue);
        }

public static void print(ArrayList<Product>cart){
    System.out.println("Items in the cart are :");
    for (Product product : cart) {
        System.out.print(product.productName+" "
                +product.productQty+" * "+product.productPrice);

    }

}


}
