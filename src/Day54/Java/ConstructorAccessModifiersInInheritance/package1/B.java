package Day54.Java.ConstructorAccessModifiersInInheritance.package1;

public class B extends A {
    // private access can not be called in the subclasses.

    // default constructors can be called in the subclass
    // if it is in the same package.

    B(String name) {
        super(name);
    }

    // Protected constructors can be
    // called in the subclass in all levels.

    B(String name, int number){
        super(name, number);
    }

    // Public constructors can be
    // called in the subclass in all levels.

    B(int number){
        super(number);
    }
}
