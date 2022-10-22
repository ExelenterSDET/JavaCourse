package Day54.Java.NonAccessModifiersInInheritance.FinalNonAccessModifier;

public class B extends A{

    public B(){
        // final super class attributes, same as final class attributes
        // can not be changed
//        super.name = "New name";
    }

    private void calculate(){}

    // Final methods can not be overridden

//    void print(){}

//    public void getPrice(){}

//    protected void sum(){}
}
