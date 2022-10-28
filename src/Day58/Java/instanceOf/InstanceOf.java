package Day58.Java.instanceOf;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {
    public static void main(String[] args) {
        List<I> list = new ArrayList<>();
        list.add(new A());
        list.add(new B());
        list.add(new C());

        for (I object : list) {
            if(object instanceof Ia || object instanceof A){
                ((A) object).print();
            }else if(object instanceof Ib || object instanceof B){
                ((B)object).read();
            } else if (object instanceof Ic || object instanceof C){
                ((C)object).run();
            }
        }
    }
}
class A implements I, Ia{
    void print(){
        System.out.println("Print method in A");
    }
}
class B implements I, Ib{
    void read(){
        System.out.println("Read method in B");
    }
}
class C implements I, Ic{
    void run(){
        System.out.println("Run method in C");
    }
}

interface I{

}

interface Ia{

}
interface Ib{

}
interface Ic{

}