package Day54.Practice.Andrea.Practice.AccessModifiers.NonAccessModifiersInInheritance.FinalNonAccessModifer;

public class A {

    final String name = "Name";

    public A(){

    }
    private final void calculate(){} //private methods cannot be overridden, so final is redundant

    final void print(){}

    public final void getPrice(){}

    protected final void sum(){}

}
