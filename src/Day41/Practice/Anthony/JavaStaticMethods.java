package Day41.Practice.Anthony;

import java.util.Random;

public class JavaStaticMethods {
    //Attributes and methods belongs to the class, rather then the object

    public static void print(){
        System.out.println("Hello World - Static");
    }
    public void print2(){
        System.out.println("Non-static");
    }

    public static void main(String[] args) {
        JavaStaticMethods.print();//do not need to this
        print();//with in the same class, calling the method with in the class

        //need to create the object
        JavaStaticMethods jm = new JavaStaticMethods();
        jm.print2();
    }
}

class Test{
    public static void main(String[] args) {

        JavaStaticMethods.print(); //static methods and attributes belong to the class
        JavaStaticMethods jvm = new JavaStaticMethods();
                jvm.print2(); //non static methods and attributes belong to the object/instance of the class


        //what are these methods?

       // Arrays.sort == static
        //int min Math.min(2,5) == (private) static
        System.out.println(Math.E);//public
        System.out.println(Math.PI);//public
        //System.out.println(Math.DEGREE_TO_RADIANTS); it is private

        //Random Class is non static - constructors are built
        //String ==> non-static?? str.length(); ---> these is scary (do not dip inside); separate story

        //Examples for the non-statics methods.
        String str = "hello";
        String str2 = new String();

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        int length = str.length();
        int length2 = str.length();

        Random rnd = new Random();
        rnd.nextInt();

        //Examples for the static methods
    }

}
