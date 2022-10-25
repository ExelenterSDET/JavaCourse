package Day55.Java.Abstraction;

public abstract class A {
    String name;
    final int age = 20;
    public static boolean isTrue;

    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    public static void read(){
    }
    public final void print(){
        System.out.println("Class A");
    }

    public abstract void print2(String str);

    public abstract void print3();

    public abstract void print4();
}
