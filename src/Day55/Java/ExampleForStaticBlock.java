package Day55.Java;

import java.util.ArrayList;

public class ExampleForStaticBlock {
    private static final ArrayList<Person> list = new ArrayList<>();

    public static void main(String[] args) {
        list.forEach(a -> System.out.println(a));


    }

    static{
        list.add(new Person("Furkat", "Ali", 41));
        list.add(new Person("Bahriddin", "Bahriddin", 40));
        list.add(new Person("John", "Wick", 35));
    }
}
