package Day57.Java;

// not 100%
public abstract class AbstractionClass {

    void read(){
        System.out.println("Read method");
    }

    abstract void print();

}

// 100%
abstract class SecondClass{
    abstract void write();
}

class Subclass extends AbstractionClass{

    @Override
    void print() {

    }

}
