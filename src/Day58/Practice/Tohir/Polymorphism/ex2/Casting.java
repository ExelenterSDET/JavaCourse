package Day58.Practice.Tohir.Polymorphism.ex2;

public class Casting {
    public static void main(String[] args) {
        A aa = new A();
        aa.print();
        C c = (C) aa;
        ((C) aa).read();
        ((C) aa).write();

        A ac = new C();
        ((C) ac).read();



        A ab = new B();
        ab.print();
        B b = (B) ab;
        ((B) ab).read();
        ((C) ab).read();

        C cc = new C();
        cc.write();
        cc.print();
        cc.read();

        A a = (A) cc;
        a.print();

        C ca = (C)new A();
        //B ba = (A)new A();
        C cb = (C) new B();

    }
}
class A{
    void print(){
        System.out.println("Print A");
    }

}

class B extends A{

    void read(){
        System.out.println("Read B");
    }

}
class C extends B{
    void write(){
        System.out.println("Write C");
    }
}