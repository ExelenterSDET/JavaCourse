package Day55.Part1.OCA1;

public class B extends A{
    String s = "String B";
    static {
        System.out.println("B is 2nd");
    }

    {
        System.out.println("Initializer B");
    }
    {
        System.out.println(super.s);
    }

}
