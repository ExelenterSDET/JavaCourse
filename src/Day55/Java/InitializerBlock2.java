package Day55.Java;

public class InitializerBlock2 {

    {
        System.out.println("Initializer Block1");
    }

    public InitializerBlock2() {
        System.out.println("Constructor ");
    }

    public static void main(String[] args) {
        InitializerBlock2 i = new InitializerBlock2();

    }

    {
        System.out.println("Initializer Block2");
    }

    {
        System.out.println("Initializer Block3");
    }

}
