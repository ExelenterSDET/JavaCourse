package Day55.Java.Abstraction.Example;

public abstract class A {
    abstract void print();
}
abstract class B extends A{
    abstract void read();
    abstract void write();
}

class C extends B{
    @Override
    void read() {}

    @Override
    void write() {}

    @Override
    void print() {}
}
