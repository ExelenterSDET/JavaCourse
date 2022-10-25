package Day53.Practice.Malika.Task1;

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
        banana.setPrice(2.59);
        banana.setStoreAddress("Uskudar str. 15");
        System.out.println(banana);


        Strawberry strawberry = new Strawberry();
        strawberry.setName("Strawberry");
        strawberry.setColor("Red");
        strawberry.setPrice(3.99);
        strawberry.setBrand("Antalya");
        strawberry.setOwner("Demiral");
        System.out.println(strawberry);
    }
    }

