package Day54.Java.NonAccessModifiersInInheritance.StaticInInheritance;

public class C {
    public static void main(String[] args) {

        A a = new A();
        a.number = 150;
        A.staticNumber = 250;

        B b = new B();
        b.number = 100;
        B.staticNumber = 200;

        System.out.println(b.number);
        System.out.println(B.staticNumber);
        System.out.println(a.number);
        System.out.println(A.staticNumber);

    }
}
