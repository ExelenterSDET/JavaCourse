package Day58.Java.Polymorphism.Example2;

public class Casting {
    public static void main(String[] args) {

        A a = new B();

//        C c = (C)a; // will throw classCastException
//        B b = (B)a;
//        A a1 = (B)a;
//        B b1 = (C)a1;


    }
}

class A{
    void print(){
        System.out.println("Print method in A");
    }
}
class B extends A{
    void read(){
        System.out.println("Read method in B");
    }
}
class C extends B{
    void run(){
        System.out.println("Run method in C");
    }
}