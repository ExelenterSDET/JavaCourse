package Day58.Practice.Tohir.Instanceof;


import java.util.ArrayList;
import java.util.List;

public class InsanceofJava {
    public static void main(String[] args) {

        List<I> list = new ArrayList<>();
        list.add(new A());
        list.add(new B());
        list.add(new C());
        for(I object:list){
            if (object instanceof C){
                ((C) object).run();
            } else if (object instanceof B) {
                ((B) object).read();
            }else if (object instanceof A){
                ((A) object).print();
            }
        }
    }

}
class A implements I{
    void print(){
        System.out.println("Class A");
    }
}
class B extends A{
    void read(){
        System.out.println("Class B");
    }
}
class C extends B{
    void run(){
        System.out.println("Class C");
    }
}

class D implements Ia{
    void open(){
        System.out.println("Class D");
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