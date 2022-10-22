package Day54.SuperKeyWords;

public class B extends A {
    //String name = "SubClass";
   public void print(){
        System.out.println("Print method in Subclass");
    }
    public B(){
        super.print();
        this.print();

        super.name = "Change in Super Class";
        this.name = "Change in SubClass";

    }


}
