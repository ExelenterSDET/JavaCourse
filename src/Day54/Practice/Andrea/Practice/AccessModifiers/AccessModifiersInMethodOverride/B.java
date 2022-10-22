package Day54.Practice.Andrea.Practice.AccessModifiers.AccessModifiersInMethodOverride;
//can override the method from parent class if you use the same modifier or larger
//public > protected > default > private
//cannot "narrow" access but can widen

//public in parent class must be only public in child class
//protected in parent class must be only protected or public in child class
//default in parent class must be only default, protected, or public
//private in parent class can be any access modifier in child (not overriding - creating new)
public class B extends A{
    public void calculate(){}
    void print(){} //cannot be private
    public void getPrice(){} //cannot be private or default or protected
    public void sum(){} //cannot be private or default


}
