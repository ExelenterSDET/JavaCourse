package Day55.Part1.OCA1;

public class A {
    String s = "Class A";
    static {
        System.out.println("A is 1st");
    }
    {
        System.out.println("Initializer A");
    }
}
