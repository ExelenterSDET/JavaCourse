package OCA.Q63;

public class Q63 {
    public static void main(String[] args) {
     C2 obj1 = new C1();
     I obj2 = new C1();

     C2 s = (C2)obj2; // must use casting, or else will have a compile error. you may use to cast (C1) or (C2)
     I t = (I)obj1; // must use casting, or else will have a compile error. you may use to cast (C1) or (I)

     t.displayI();
     s.displayC2();


    }
}

interface I {
    public void displayI();
}

class C2{
    public void displayC2(){
        System.out.println("C2");
    }

}

class C1 extends C2 implements I{

    @Override
    public void displayI() {
        System.out.println("C1");
    }
}
