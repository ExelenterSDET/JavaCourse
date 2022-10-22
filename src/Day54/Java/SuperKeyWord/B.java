package Day54.Java.SuperKeyWord;

public class B extends A {
    String name = "SubClass";

    public void print(){
        System.out.println("Print method in Subclass");
    }

    public B() {
        this.print();
        super.print();
        this.name = "Change in SubClass";
        super.name = "Change in Super Class";
    }
}
