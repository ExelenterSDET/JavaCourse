package Day55.Practice.Andrea;


import java.util.ArrayList;

public class ExampleForStaticBlock {

    private final ArrayList<Person> list = new ArrayList<>();

    public static void main(String[] args) {

    }

     {
        list.add(new Person("Tom", "Jones", 33));
        System.out.println(list);
        // got lost here
    }
}
