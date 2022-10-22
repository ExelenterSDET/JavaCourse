package Day54.Java.SuperKeyWord;

public class App {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("=============");
        b.print();

        System.out.println("=============");
        System.out.println(b.name);
        System.out.println(b.name);

        b.name = "New name";
        System.out.println(b.name);

    }
}
