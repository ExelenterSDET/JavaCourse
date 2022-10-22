package Day54.StaticInheritance;

public class C {
    public static void main(String[] args) {
        B b = new B();
        b.number = 100;
        b.staticNumber = 200;
        System.out.println(b.staticNumber);


        A a = new A();
        a.number = 200;
        a.staticNumber = 300;
        System.out.println(a.number);
        System.out.println(a.staticNumber);
    }

}
