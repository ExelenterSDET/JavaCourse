package Day55.Practice.Andrea;

public class InitializerBlock {

    static {
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static { //runs before main
        System.out.println("Static block 2");
    }
}
