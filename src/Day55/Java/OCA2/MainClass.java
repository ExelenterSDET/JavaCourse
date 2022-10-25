package Day55.Java.OCA2;

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A{
    static{
        System.out.println("Third");
    }
}
class B extends A{
    static{
        System.out.println("Second");
    }
}
class C extends B{
    static{
        System.out.println("First");
    }
}


