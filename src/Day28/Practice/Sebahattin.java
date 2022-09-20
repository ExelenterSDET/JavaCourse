package Day28.Practice;

import java.util.ArrayList;

public class Sebahattin {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Pear");
        list.add("Grape");
        list.add("Orange");
        list.add(0,"Strawberry");
        list.add("Lemon");
        list.add(1,"Cherry");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(4));
    }
}
