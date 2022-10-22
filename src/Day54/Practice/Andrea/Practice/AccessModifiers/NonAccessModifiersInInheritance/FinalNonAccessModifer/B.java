package Day54.Practice.Andrea.Practice.AccessModifiers.NonAccessModifiersInInheritance.FinalNonAccessModifer;

public class B extends A {
    // super.name

    private void calculate(){}
// cannot override the methods that are final,
// except private, which is not being overridden anyway
//    void print(){}
//
//    public void getPrice(){}
//
//    protected void sum(){}
}
