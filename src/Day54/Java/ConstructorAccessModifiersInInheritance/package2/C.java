package Day54.Java.ConstructorAccessModifiersInInheritance.package2;

import Day54.Java.ConstructorAccessModifiersInInheritance.package1.A;

public class C extends A {

    // default constructors can not be called here.
    // we may call only protected and public constructors under the different package.

    public C(String name, int number) {
        super(name, number);
    }

    public C(int number) {
        super(number);
    }
}
