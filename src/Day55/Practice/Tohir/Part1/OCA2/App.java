package Day55.Part1.OCA2;

public class App {
    public static void main(String[] args) {
        C c = new C();
    }

    public static class A {
        String s = "Class A";

        static {
            System.out.println("A is 3rd");
        }

    }

    public static class B extends A {
        String s = "String B";

        static {
            System.out.println("B is 2nd");
        }

    }

    public static class C extends B {
        String s = "String C";

        static {
            System.out.println("C is 1st");
        }
    }
}
