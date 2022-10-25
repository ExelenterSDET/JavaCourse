package Day55.Part1.StaticandInitializerBlocks;

public class StaticandNonStatic {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Initializer Block");
    }
    StaticandNonStatic(){
        System.out.println("Constructor ");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        StaticandNonStatic staticandNonStatic = new StaticandNonStatic();

    }
}
