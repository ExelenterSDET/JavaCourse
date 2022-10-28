package Day58.Java.Polymorphism;

import java.util.*;

public class App {
    static ArrayList<Object> listOfObjects = new ArrayList<>();
    static ArrayList<AbstractClass> listOfAbstract = new ArrayList<>();
    static ArrayList<I> listOfI = new ArrayList<>();
    static I[] arr = new I[5];
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        listOfObjects.add(a);
        listOfObjects.add(b);
        listOfObjects.add(c);

        listOfI.add(a);
        listOfI.add(b);
        listOfI.add(c);

        listOfAbstract.add(a);
        listOfAbstract.add(b);
        listOfAbstract.add(c);

        arr[1] = new A();
        arr[2] = new B();
        arr[3] = new C();

        System.out.println(arr[1].getClass().getSimpleName());

        for (Object listOfObject : listOfI) {
            System.out.print(listOfObject.getClass().getSimpleName() + "");
        }
        System.out.println();
        for (Object listOfObject : listOfObjects) {
            System.out.print(listOfObject.getClass().getSimpleName() + "");
        }
        System.out.println();
        for (Object listOfObject : listOfAbstract) {
            System.out.print(listOfObject.getClass().getSimpleName() + "");
        }




    }
}


class A extends AbstractClass implements I {

}

class B extends AbstractClass implements I{

}

class C extends AbstractClass implements I{

}

class AbstractClass{

}
interface I{

}
