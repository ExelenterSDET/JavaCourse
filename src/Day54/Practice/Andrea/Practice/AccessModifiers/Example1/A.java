package Day54.Practice.Andrea.Practice.AccessModifiers.Example1;

public class A {
    private String str; //cannot see in any other class including sub classes
    protected int num; //will be accessible in the subclass
    double price; //default is accessible only in sublcasses in same package
    public boolean isTrue; //accessible everywhere
}
