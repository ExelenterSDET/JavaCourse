package Day58.Practice.Tohir.Polymorphism;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<AA> listofAA = new ArrayList<>();

        AA aa = new AA();
        AA bb = new BB();
        BB cc = new CC();
        listofAA.add(aa);
        listofAA.add(bb);
        listofAA.add(cc);
        //listofAA.forEach(aa1 -> System.out.println(aa.getClass().getSimpleName()));

        cc.print();

        ArrayList<II> listofII = new ArrayList<>();

        II aa1 = new AA();
        II bb1 = new BB();
        II cc1 = new CC();
        listofII.add(aa1);
        listofII.add(bb1);
        listofII.add(cc1);
       // listofII.forEach(aa2 -> System.out.println(aa2.getClass().getSimpleName()));

        aa1.print();
        bb1.print();
        aa.read();
        bb.read();

        AbstractDD abstractDD = new AA();
        AbstractDD abstractDD1 = new BB();
        AbstractDD abstractDD2 = new CC();

    }
}
class AA extends AbstractDD implements II{

    @Override
    public void print() {

        System.out.println("I am class AA");

    }

    public void read(){
        System.out.println("Read method for class AA");
    }

    @Override
    void write() {

    }
}

class BB extends AA{
    @Override
    public void print() {

        System.out.println("I am class BB");

    }

    public void read(){
        System.out.println("Read method for class BB");
    }
}

class CC extends BB{
    @Override
    public void print() {

        System.out.println("I am class CC");

    }
    public void read(){
        System.out.println("Read method for class CC");
    }
}

interface II{
void print();
}

abstract class  AbstractDD{
    int age = 56;
    abstract void write();
    void dosmt(){
        System.out.println("I am abstract class");
    }
}