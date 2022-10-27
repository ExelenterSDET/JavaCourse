package Day57.Java.Ex3;

public interface I {
    // Interface may have default methods. It should have a default keyword.
    default void print(){
        System.out.println("Interface default method");
    }

    // Interface may have static methods.
    static void write(){
        System.out.println("Interface static method");
    }

    // static and default methods are not required to be overridden in the concrete class.
}

class A implements I{

}

class App{
    public static void main(String[] args) {
        A a = new A();
        a.print();
        I.write();
    }
}
