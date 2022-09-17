package Day28.Practice.Andrea;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Bahodur");
        list.add("Andrea");
        System.out.println(list);

        list.add(1, "Furkat");
        System.out.println(list);

        String s = list.get(0);
        System.out.println(s);

        for (String value : list) {
            System.out.println(value);
        }
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
