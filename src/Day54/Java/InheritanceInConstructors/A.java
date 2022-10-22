package Day54.Java.InheritanceInConstructors;

public class A {
    public A() {
        System.out.println("A");
    }
}
class B extends A{
    public B() {
        System.out.println("B");
    }
}
class C extends B{
    public C() {
        System.out.println("C");
    }
}

class App{
    public static void main(String[] args) {
        C c = new C();
    }
}
