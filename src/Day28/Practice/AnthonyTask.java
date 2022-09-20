package Day28.Practice;

import java.util.ArrayList;

public class AnthonyTask {
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
        byte b = 10;
        Byte bb1 = b;
//        Byte bb = new Byte("10");
        Byte bb2 = 10;

        short sh = 15;
        Short ssh = sh;
//        Short ssh1 = new Short("15");
        Short ssh2 = 15;


        int i = 100;
        Integer ii = i;
//        Integer ii1 = new Integer("100");
        Integer ii2 = 100;

        long l = 200;
        Long ll = l;
//        Long ll1 = new Long("200");
        Long ll2 = 500L;

        float f = 10.0F;
        Float ff = f;
//        Float ff1 = new Float("10");
        Float ff2 = 10.0F;

        double db = 20.2;
        Double db1 = db;
//        Double db2 = new Double("20");
        Double db3 = 12.5;

        char ch = 'a';
        Character ch1 = ch;
//        Character ch2 = new Character('A');
        Character ch3 = 'c';

        boolean bl = false;
        Boolean bl1 = bl;
        Boolean bl2 = Boolean.TRUE;
//        Boolean bl3 = new Boolean(true);
//        Boolean bl4 = new Boolean("true");
        Boolean bl5 = false;


    }
}
