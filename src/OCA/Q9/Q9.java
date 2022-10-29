package OCA.Q9;

public class Q9 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class C{
    public C() {
        System.out.println("C");
    }
}

class B extends C{
    public B() {
        System.out.println("B");
    }
}

class A extends B{
    public A() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a = new A();
    }
}
