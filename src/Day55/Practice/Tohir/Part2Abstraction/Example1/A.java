package Day55.Practice.Tohir.Part2Abstraction.Example1;

import javax.swing.plaf.PanelUI;

public abstract class A {
    String name;
    final int Age = 0;
    final static boolean bool = false;


    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(getClass().getSimpleName());
    }
    public static void read(){

    }

    /*public void print(){
            System.out.println("Class A");
        }*/
    public abstract void print2();
    public abstract void print3();
    public abstract void print4();
}
