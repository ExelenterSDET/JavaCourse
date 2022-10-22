package Day53.Practice.Sebahattin.Example;

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
            banana.setStoreAddress("23. St Anamur/Antalya");
            banana.setName("Banana");
            banana.setColor("Yellow");
            banana.setPrice(4.99);
            System.out.println(banana);

            Strawbery strawbery = new Strawbery();
            strawbery.setBrand("Star");
            strawbery.setOwner("Sinan");
            strawbery.setName("Strawbery");
            strawbery.setColor("Purple");
            strawbery.setPrice(3.99);
            System.out.println(strawbery);

        }
    }
