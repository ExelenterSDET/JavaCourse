package Day38.Practice.Dilnoza.Task1.Task;

import java.util.ArrayList;

public class Product {
    String productName;
    int productQty;
    double productPrice;

    public static void print(ArrayList<Product> cart){
        System.out.println("Items in the cart are :");
        for (Product product : cart) {
            System.out.println(product.productName+" "
                    + " "+product.productQty+" *"+" $"+ product.productPrice);

        }

    }
}
