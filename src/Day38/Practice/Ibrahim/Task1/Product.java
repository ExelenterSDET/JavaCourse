package Day38.Practice.Ibrahim.Task1;

import java.util.ArrayList;

class Product {
    String productName;
    int productQty;
    double productPrice;

    Product getProduct(String name, int qty, double price){
        Product product = new Product();
        product.productName = name;
        product.productQty = qty;
        product.productPrice = price < 0 ? 0 : price;
        return product;
    }


    void print(ArrayList<Product> cart){
//        for (Product product : cart) {
//            System.out.println(product.productName + " : "
//                                + product.productQty + " : $"
//                                + product.productPrice );
//        }

        cart.forEach(a-> {System.out.println(a.productName + " : "
                + a.productQty + " : $"
                + a.productPrice );});
    }
}
