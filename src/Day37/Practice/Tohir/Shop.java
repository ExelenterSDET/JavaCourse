package Day37.Practice.Tohir;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {

        Product product0 = setProduct("Nivea Deodorant",4,4.5);
        System.out.println(totalPayment(product0));
        Product product1 = setProduct("Adidas Deodorant",2,10.0);
        ArrayList<Product> productlist = new ArrayList<>();
        productlist.add(product0);
        productlist.add(product1);
        Consumer tohir = setConsumers("Tohir",productlist);
        //consumersinfo(tohir);

    }

    public static Product setProduct(String nameofproduct, int quatity, Double productprice)
    {
        Product product = new Product();
        product.productname = nameofproduct;
        product.quatity = quatity;
        product.productprice = (productprice>0)?productprice:0;
        return product;
    }
    public static void basket(Product product)
    {
        System.out.println("Name of product "+product.productname+", Quantity is "+product.quatity+", Price is "+product.productprice);
    }
    public static void consumerinfo(Consumer consumer)
    {
        System.out.println("Name: "+consumer.name+" "+"Name of product "+consumer.product.productname+", Quantity is "+consumer.product.quatity+", Price is "+consumer.product.productprice+", balance due "+consumer.balancedue);
    }
    public static double totalPayment(Product product)
    {
        return (product.quatity* product.productprice);
    }
    public static Consumer setConsumer(String name, Product product)
    {
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.balancedue = totalPayment(product);
        consumer.product = product;
        return consumer;
    }
    public static double totalPayments(ArrayList<Product> cart)
    {   double total = 0.0;
        for (Product product : cart) {
            total += product.productprice*product.quatity;
        }
        return total;
    }
    public static Consumer setConsumers(String name, ArrayList<Product> product)
    {
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.balancedue = totalPayments(product);
        //consumer.cart.addAll(product);
        return consumer;
    }
    public static void consumersinfo(Consumer consumer)
    {
        System.out.println("Name: "+consumer.name);
        print(consumer.cart);
        //System.out.println("Balance due "+consumer.balancedue);

    }
    public static void print(ArrayList<Product> cart)
    {
        for (Product product : cart) {
            System.out.println("Name of product "+product.productname+", Quantity "+product.quatity+", Price "+product.productprice);
        }
    }
}
