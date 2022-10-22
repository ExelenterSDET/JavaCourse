package Day54.Java.AccessModifiersInInheritance.AccessModifiersInMethodOverride;

public class B extends A {

    // public > protected > default > private

    // public => must be only public
    // protected => must be protected or public
    // default => must be default, protected or public
    // private => can be any

    public void calculate(){}

    @Override
    protected void print(){}

    @Override
    public void getPrice(){}

    @Override
    public void sum(){}

}
