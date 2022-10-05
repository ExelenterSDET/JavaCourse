package Day41.Practice.Tohir;

import java.util.Arrays;

public class StaticMethods {
    public static void print(){
        System.out.println("Static");
    }
    public void print2(){
        System.out.println("Non-Static");
    }

    public static void main(String[] args) {
        print();
        StaticMethods asg = new StaticMethods();
        asg.print2();
    }
}
class Test2
{
    public static void main(String[] args) {
        StaticMethods.print();
        StaticMethods asg = new StaticMethods();
        asg.print2();

        int min = Math.min(3,5);
    }
}
