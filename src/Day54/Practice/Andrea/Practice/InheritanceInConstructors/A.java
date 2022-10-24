package Day54.Practice.Andrea.Practice.InheritanceInConstructors;

public class A {
    public A(){
        System.out.println("A");
    }
}

class B extends A {
    public B(){
        System.out.println("B");
    }
}

class C extends B {
    public C(){
        System.out.println("C");
    }
}

class App {
    public static void main(String[] args) {
        A a = new A(); //Prints A
        System.out.println("==================");
        B b = new B(); //prints A B
        System.out.println("==================");
        C c = new C(); //prints A B C
    }
}
