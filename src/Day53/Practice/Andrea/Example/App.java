package Day53.Practice.Andrea.Example;

public class App {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Fruit");
        fruit.setPrice(1.99);
        fruit.setColor("color");
        System.out.println(fruit);

        Apple apple = new Apple();
        apple.setName("Read apple");
        apple.setColor("red");
        apple.setPrice(100);
        System.out.println(apple);

        Banana banana = new Banana();
        banana.setStoreAddress("123 Main St");
        System.out.println(banana);

        Strawberry strawberry = new Strawberry();
        strawberry.setOwner("Farmer John");
        System.out.println(strawberry);
    }
}
