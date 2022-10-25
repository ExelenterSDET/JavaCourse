package Day55.Practice.Andrea.Example1;

public class B extends A{
    static {
        System.out.println("Static block B");
    }
    {
        System.out.println("Initializer B");
    }

    public B(){
        System.out.println("Constructor B");
    }
}
