package Day55.Practice.Andrea.Example1;

public class A {
    static {
        System.out.println("Static block A");
    }
    {
        System.out.println("Initializer A");
    }

    public A(){
        System.out.println("Constructor A");
    }
}
