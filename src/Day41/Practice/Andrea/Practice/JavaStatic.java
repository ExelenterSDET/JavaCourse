package Day41.Practice.Andrea.Practice;

public class JavaStatic {

    public static void print() { //static methods belong to the class
        System.out.println("Static");
    }
    public void print2(){ //non-static methods belong to the object of the class
        System.out.println("Non-static");
    }

    public static void main(String[] args) {
        print();
       // print2(); - can't call - need to create an object
        JavaStatic js = new JavaStatic();
        js.print2();

    }
}
