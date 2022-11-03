package OCA.Q76;

import java.util.ArrayList;

public class Q76 {
    public static void main(String[] args) {
        ArrayList<Cycle> list = new ArrayList<>();
        list.add(new MotoCycle());

        ArrayList<Cycle1> list2 = new ArrayList<>();
        list2.add(new MotoCycle1());

        ArrayList<Transaction2> list3 = new ArrayList<>();
        list3.add(new MotoCycle2());
        list3.add(new Cycle2());

        ArrayList<Cycle> list4 = new ArrayList<>();
        list4.add(new MotoCycle());
    }
}


interface Cycle1{

}
class MotoCycle1 implements Cycle1{

}

class Cycle{ // it can be abstract or non-abstract class

}
class MotoCycle extends Cycle{

}

class Cycle2 extends Transaction implements Transaction2{

}
class MotoCycle2 extends Transaction implements Transaction2 {

}

class Transaction{

}
interface Transaction2{

}

