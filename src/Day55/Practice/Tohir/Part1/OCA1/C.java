package Day55.Part1.OCA1;

public class C extends B{
    String s = "String C";

    {
        System.out.println("Initializer C");
    }
    {
        System.out.println(super.s);
    }
    static {
        System.out.println("C is 3rd");
    }
}
