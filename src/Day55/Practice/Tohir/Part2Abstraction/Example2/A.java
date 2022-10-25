package Day55.Part2Abstraction.Example2;

public abstract class A {
    abstract void print();
}
    abstract class B extends A{

       abstract void read();
       abstract void write();

    }

    class C extends B {

        @Override
        void print() {
            System.out.println("Print from class A");
        }

        @Override
        void read() {
            System.out.println("Read ");
        }

        @Override
        void write() {
            System.out.println("Write ");
        }


    public static void main(String[] args) {
        C c = new C();

    }
}
