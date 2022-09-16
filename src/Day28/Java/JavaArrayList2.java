package Day28.Java;

import java.util.ArrayList;

public class JavaArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Bahodur");
        list.add("Andrea");
        list.add(1, "Furkat Ali");
        list.add("Arthur");
        list.add(0, "Bahridin");
        list.add(0, "Anthony");

        System.out.println(list);

        System.out.println("=========================");

        String s = list.get(0);
        System.out.println(s);

        System.out.println("=========================");

        for (String s1 : list) {
            System.out.println(s1);
        }

        System.out.println("=========================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
