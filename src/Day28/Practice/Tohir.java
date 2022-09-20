package Day28.Practice;

import java.util.ArrayList;

public class Tohir {
    public static void main(String[] args) {
        ArrayList<String> strl = new ArrayList<>();
        strl.add("Tju");
        strl.add("Tju1");
        System.out.println(strl);
        strl.add(0,"TJU");
        System.out.println(strl);
        strl.add(0,"TJi");
        System.out.println(strl);
        System.out.println(strl.get(2));
        System.out.println(strl);
        strl.add(0,"TJi");
        System.out.println(strl);
        System.out.println(strl.get(2));
        strl.add(3,"juma");
        strl.add("last");
        for (int i = 0; i < strl.size(); i++) {
            System.out.println(i+" = " + strl.get(i));
        }

    }
}
