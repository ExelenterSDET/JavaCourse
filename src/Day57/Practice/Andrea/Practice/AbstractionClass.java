package Day57.Practice.Andrea.Practice;

//not 100% abstract - has a non-abstract method
public abstract class AbstractionClass {

    void read(){
        System.out.println("Read method");
    }

    abstract void print();
}

//100% abstract class
abstract class SecondClass  {
    abstract void write();
}

class Subclass extends AbstractionClass {

    @Override
    void print() {

    }
}