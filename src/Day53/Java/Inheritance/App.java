package Day53.Java.Inheritance;

public class App {

    public static void main(String[] args) {
        SuperClass superclass = new SuperClass();
        superclass.name = "I am Super Class";
        System.out.println(superclass);

        SubClass subClass = new SubClass();
        subClass.name = "I am Sub Class";
        System.out.println(subClass);

    }
}
