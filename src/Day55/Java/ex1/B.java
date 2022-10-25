package Day55.Java.ex1;

public class B extends A{
    static{
        System.out.println("Static block B");
    }
    {
        System.out.println("Initializer B");
    }
    public B() {
        System.out.println("Constructor B");
    }
}
