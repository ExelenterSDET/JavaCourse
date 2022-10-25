package Day55.Part1.StaticandInitializerBlocks;

import java.util.ArrayList;

public class StaticBlock {
    private static final ArrayList<Person> list1 = new ArrayList<>();

    static {
        int a = 3;
        System.out.println(a);
    }
    static {
        int b = 5;
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println("Main ");
    }

}
