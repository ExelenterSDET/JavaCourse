package Day55.Java;

public class InitializerBlock {

    static{
        System.out.println("Static block 1");
    }

    static{
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static{
        System.out.println("Static block 3");
    }

    static{
        System.out.println("Static block 4");
    }

}
