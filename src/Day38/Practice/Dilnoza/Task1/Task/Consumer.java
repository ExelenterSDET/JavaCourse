package Day38.Practice.Dilnoza.Task1.Task;

import java.util.ArrayList;

import static Day38.Practice.Dilnoza.Task1.Task.Product.print;


public class Consumer {
    String name;
    double balanceDue;
    Product product;
    ArrayList<Product> cart;

    public  double getTotal(ArrayList<Product> cart){
        double sum =0.0;
        for (Product product : cart) {
            sum+=product.productPrice* product.productQty;
        }
        return sum;
    }

    public  Consumer createConsumer2(String name,ArrayList<Product>cart){
        Consumer consumer = new Consumer();
        consumer.name= name;
        consumer.cart=cart;
        consumer.balanceDue=getTotal(cart);
        consumer.cart=cart;

        return consumer;

    }
    public void toPrint(Consumer consumer){
        System.out.println("Name: " +consumer.name);
        System.out.println("====================");
        print(consumer.cart);
        System.out.println("====================");
        System.out.println("Balance Due : $"+consumer.balanceDue);
    }

//public String toString(){
//        return"Name: "+ name+" "+"balance $"+balanceDue;
//}

    @Override
    public String toString() {
        Product product = new Product();
        print(cart);
        return "Consumer{" +
                "name='" + name + '\'' +
                ", balanceDue= $" + balanceDue +

                '}';
    }
}