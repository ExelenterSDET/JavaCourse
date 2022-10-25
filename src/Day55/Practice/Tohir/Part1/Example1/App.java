package Day55.Part1.Example1;

public class App {
    static {
        System.out.println("Static Block App");
    }
    {
        System.out.println("InitializerBlock App");
    }
    public static void main(String[] args) {
        B b = new B();
    }
}
