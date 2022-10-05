package Day41.Practice.Anthony;

public class JavaFinalMethods {

    public final void print(){
        System.out.println("HELLO WORLD");
    }

    public void print2(String str){
        System.out.println(str);
    }

    public JavaFinalMethods() {
    }
}

class A extends JavaFinalMethods{
    @Override
    public void print2(String str){
        System.out.println(str.toLowerCase());
    }

    // final methods can not be inherited.

//    @Override
//    public void print(){
//        System.out.println("I LOVE JAVA");
//    }
}
