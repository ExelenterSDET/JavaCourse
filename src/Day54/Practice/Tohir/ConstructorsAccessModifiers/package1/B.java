package Day54.ConstructorsAccessModifiers.package1;

public class B extends A {

    private B(int number)
    {
        super(number);
    }

   private B(String name){
       super(name);
     //super("2",32);
     //super(4);
    }

}
