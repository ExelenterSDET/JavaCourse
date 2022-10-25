package Day55.Part1.StaticandInitializerBlocks;

public class InitializerBlock2 {
    {
        System.out.println("Initializer Block");
    }
    {
        System.out.println("Initializer Block2");
    }
    {
        System.out.println("Initializer Block3");
    }
    public InitializerBlock2(){
        System.out.println("Constructor ");
    }

    public static void main(String[] args) {
        InitializerBlock2 initializerBlock2 = new InitializerBlock2();
    }
}
