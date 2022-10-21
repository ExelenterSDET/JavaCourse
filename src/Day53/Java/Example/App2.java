package Day53.Java.Example;

public class App2 {

    public static void main(String[] args) {

        Apple apple = new Apple("Apple", "Red", 100, 15);
        Banana banana = new Banana("Banana", "Yellow", 1.99, "123 Bond St");
        Strawberry strawberry = new Strawberry("Strawberry", "Pink", 4.99, "Brazilian", "Grocery Owner");

        System.out.println(apple);
        System.out.println(banana);
        System.out.println(strawberry);

        Apple apple2 =  new Apple("Apple2", "Red Red");
        apple2.setDiscount(10);
        apple2.setPrice(1.50);
        System.out.println(apple2);
    }
}
