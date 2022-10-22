package Day54.Java.AccessModifiersInInheritance.AccessModifiersInAttributesAndMethods.Ex1;

public class A {
    private String str; // private will not be accessible in the subclass
    protected int number; // protected will be accessible in the subclass in all levels
    double price; // default will be accessible in subclass, only within the same package
    public boolean isTrue;

}
