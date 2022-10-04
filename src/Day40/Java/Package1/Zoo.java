package Day40.Java.Package1;

import java.util.Random;

public class Zoo {
    public static void main(String[] args) {

//        Animal animal = new Animal();
        Animal animal2 = new Animal("lion", 50, "orange");
        Animal animal3 = new Animal("tiger", 60);

        animal2.print();
        animal3.print();

    }
}
