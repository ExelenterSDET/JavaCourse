package Day55.Java.OCA1;

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.s);
    }
}

class A{
    String s = "Class A";
}
class B extends A{
    String s =  "Class B";
    {
        System.out.println(super.s);
    }
}
class C extends B{
    String s = "Class C";
    {
        System.out.println(super.s);
    }
}
