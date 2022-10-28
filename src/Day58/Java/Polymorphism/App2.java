package Day58.Java.Polymorphism;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<II> list = new ArrayList<>();
        II a = new AA();
        II b = new BB();
        II c = new CC();

        list.add(a);
        list.add(b);
        list.add(c);

        for (II aa : list) {
            System.out.println(aa.getClass().getSimpleName());
            aa.print();
        }

        AbstractDD a1 = new AA();
        AA a2 = new AA();
        AbstractDD b1 = new BB();
        AbstractDD c1 = new CC();

    }
}

class AA extends AbstractDD implements II{
    public String str = "Class A";

    @Override
    public void print() {
        System.out.println("I am class A");
    }

    public void read(){
        System.out.println("read method in class A");
    }

    @Override
    void write() {
        System.out.println("Write method in A");
    }
}

class BB extends AA {
    public String str = "Class B";

    @Override
    public void print() {
        System.out.println("I am class B");
    }

    public void read(){
        System.out.println("read method in class A");
    }

    @Override
    void write() {
        System.out.println("Write method in B");
    }
}
class CC extends BB{
    public String str = "Class C";

    @Override
    public void print() {
        System.out.println("I am class C");
    }

    public void read(){
        System.out.println("read method in class A");
    }

    @Override
    void write() {
        System.out.println("Write method in C");
    }
}
abstract class AbstractDD{
    int age = 50;
    abstract void write();
    void dosmtg(){
        System.out.println("I am abstract class");
    }
}
interface II{
    int number = 10;
    void print();
}