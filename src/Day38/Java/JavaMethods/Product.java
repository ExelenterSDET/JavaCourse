package Day38.Java.JavaMethods;

import java.util.ArrayList;

public class Product {
    String productName;
    int productQty;
    double productPrice;
    public Product getProductDetails(String productName, int qty, double price){
        Product product = new Product();
        product.productName = productName;
        product.productQty = qty;
        product.productPrice = price<0 ? 0 : price;
        return product;
    }

    public String toString() {
        return "{" +
                "productName = '" + productName + '\'' +
                ", productQty = " + productQty +
                ", productPrice = $" + productPrice +
                '}';
    }

    public void print(ArrayList<Product> cart){
        System.out.println("Items in the cart : ");
        for(Product product : cart){
            System.out.println(product);
        }
    }


}
