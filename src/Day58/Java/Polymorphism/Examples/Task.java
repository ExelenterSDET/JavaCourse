package Day58.Java.Polymorphism.Examples;

public class Task {

    public static void main(String[] args) {
        B obj = new C();

        obj.print();
        obj.read();
        obj.write();
//        obj.run();


    }
}

class A{
    void read(){
        System.out.println("I am a read method in A");
    }
    void print(){
        System.out.println("Class A");
    }
}
class B extends A{
    void write(){
        System.out.println("I am a write method in class B");
    }
    void print(){
        System.out.println("Class B");
    }
}
class C extends B{
    void run(){
        System.out.println("I am a run method in class C");
    }
    void print(){
        System.out.println("Class C");
    }

    void read(){
        System.out.println("I am a read method in class C");
    }
}
