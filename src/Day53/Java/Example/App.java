package Day53.Java.Example;

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
        banana.setName("Banana");
        banana.setColor("Yellow");
        banana.setPrice(1.99);
        banana.setStoreAddress("123 Bond St");
        System.out.println(banana);

        Strawberry strawberry =  new Strawberry();
        strawberry.setName("Strawberry");
        strawberry.setColor("Pink");
        strawberry.setPrice(4.55);
        strawberry.setBrand("Brazilian");
        strawberry.setOwner("Grocery Shop");

        System.out.println(strawberry);

    }
}
