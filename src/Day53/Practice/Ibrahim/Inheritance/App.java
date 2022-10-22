package Day53.Practice.Ibrahim.Inheritance;

import javax.xml.stream.events.StartDocument;

public class App {
    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.setName("Fruit");
        fruit.setPrice(200);
        fruit.setColor("Any color");

        System.out.println(fruit);

        Apple apple = new Apple();
        apple.setName("Red Apple");
        apple.setColor("RED");
        apple.setDiscount(15);
        apple.setPrice(100); // 100 - 100*0/100
        System.out.println(apple);

        Banana banana = new Banana();
        banana.setStoreAddress("Canada");
        banana.setName("Organic");
        banana.setColor("Yellow");
        banana.setPrice(150);
        System.out.println(banana);

        Strawberry strawberry = new Strawberry();
        strawberry.setBrand("Str");
        strawberry.setOwner("Ibrahim");
        strawberry.setColor("Red");
        strawberry.setPrice(99);
        strawberry.setName("Strawberry");
        System.out.println(strawberry);


    }
}
