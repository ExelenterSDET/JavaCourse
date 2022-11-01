package Day58.Practice.Tohir.Polymorphism;

import java.util.ArrayList;

public class App {

   static ArrayList<A> listofA = new ArrayList<>();
   static ArrayList<B> listofB = new ArrayList<>();
   static ArrayList<C> listofC = new ArrayList<>();

   static ArrayList<AbstractClass> listofAbstract = new ArrayList<>();
   static ArrayList<I> listofInterface = new ArrayList<>();

    static ArrayList<Object> listofObject = new ArrayList<>();

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        listofA.add(a);
        listofB.add(b);
        listofC.add(c);
       //listofA.add(b);

        listofAbstract.add(a);
        listofAbstract.add(b);
        listofAbstract.add(c);

        listofInterface.add(a);
        listofInterface.add(b);
        listofInterface.add(c);

        listofObject.add(a);
        listofObject.add(b);
        listofObject.add(c);

        System.out.println(listofAbstract.getClass().getSimpleName());

    }
}

class A extends AbstractClass implements I{


}
class B extends AbstractClass implements I{

}

class C extends AbstractClass implements I{


}

class AbstractClass{

}
interface I{


}