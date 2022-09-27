package Day34.Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class arthurday34tsk7 {

    public static void main(String[] args) {

        HashSet<Character> m1 = new HashSet<>();
        HashSet<Character> m2 = new HashSet<>();
        HashSet<Character> dummy = new HashSet<>();


// 97-122
        do {
            char c = (char) ((int) (Math.random() * 25) + 97);
            m1.add(c);
        } while (m1.size()<10);

        do {
            char d = (char) ((int) (Math.random() * 25) + 97);
            m2.add(d);
        } while (m2.size()<10);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("xor" + xor(m1,m2));
        System.out.println(m1);

        System.out.println("intersection" + inter(m1,m2));

        System.out.println("first set " + m1);
        System.out.println(difdif(m1,m2));

    }

    static ArrayList<Character> xor(HashSet<Character> inp1, HashSet<Character> inp2 ){

        HashSet<Character> dummy1 = new HashSet<>();
        HashSet<Character> dummy11 = new HashSet<>();
        dummy1.addAll(inp1);
        dummy11.addAll(inp1);

        HashSet<Character> dummy2 = new HashSet<>();
        HashSet<Character> dummy22 = new HashSet<>();

        dummy2.addAll(inp2);
        dummy22.addAll(inp2);

        dummy1.addAll(dummy2);

        dummy11.retainAll(dummy22);


        dummy1.removeAll(dummy11);

        ArrayList<Character> dummy3 = new ArrayList<>(dummy1);
        return dummy3;

    }

    static ArrayList<Character> inter(HashSet<Character> inp1, HashSet<Character> inp2 ){

        HashSet<Character> dummy1 = new HashSet<>();
        dummy1.addAll(inp1);


        HashSet<Character> dummy2 = new HashSet<>();
        dummy2.addAll(inp2);



        dummy1.retainAll(dummy2);
        ArrayList<Character> dummy = new ArrayList<>(dummy1);
        return dummy;
    }

    static ArrayList<Character> difdif(HashSet<Character> inp1, HashSet<Character> inp2 ){



        ArrayList<Character> dummy = new ArrayList<>(inp1);

        return dummy;
    }
}
