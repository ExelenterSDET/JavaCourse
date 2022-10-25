package Day55.Part1.Example1;

public class B extends A{
    static {
        System.out.println("StaticBlock B");
    }
    {
        System.out.println("InitializerBlock B");
    }
    public B(){
        System.out.println("B");
    }
}
