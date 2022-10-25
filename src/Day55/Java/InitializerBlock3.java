package Day55.Java;

public class InitializerBlock3 {
    static{
        System.out.println("Static block");
    }
    {
        System.out.println("Initializer block");
    }

    public InitializerBlock3() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        InitializerBlock3 ib = new InitializerBlock3();
        System.out.println("Main method");
    }
}
