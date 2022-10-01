package Day38.Practice.Andrea;

import java.util.ArrayList;

public class Product {

    String productName;
    double productPrice;
    int quantity;

    public Product getProductDetails(String name, int qty, double price){
        Product product = new Product();
        product.productName = name;
        product.quantity = qty;
        product.productPrice = price<0 ? 0 : price;
        return product;
    }
    //not using - for a future topic
    public void getProductDetails1(String name, int qty, double price) {
        this.productName = name;
        this.quantity = qty;
        this.productPrice = price < 0 ? 0 : price;
    }
    public void print (ArrayList<Product> cart) {
        System.out.println("Items in the cart: ");
        for (Product product : cart) {
            System.out.println(product.productName + " : " + product.quantity + " : $" + product.productPrice);
        }
    }
}
