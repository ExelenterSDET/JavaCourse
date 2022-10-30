package Day57.Tohir.Ex3;

public interface I {

    default void print(){
        System.out.println("Print interface default method");
    }

    default void write(){
        System.out.println("Write interface default method");
    }

    void read();
}

class A implements I{

    @Override
    public void read() {

    }
}

class App extends A{
    public static void main(String[] args) {
        App app = new App();

        app.read();
        app.print();
    }
}