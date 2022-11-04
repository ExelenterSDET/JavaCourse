package OCA.Q95;

public class Q95 {
}

class Base{
    public void test(){
        System.out.println("BASE");
    }
}

class DerivedA extends Base{
    public void test(){
        System.out.println("DerivedA");
    }
}

class DerivedB extends DerivedA{
    public void test(){
        System.out.println("DerivedB");
    }

    public static void main(String[] args) {
        // Base -> DerivedA -> DerivedB

        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }
}