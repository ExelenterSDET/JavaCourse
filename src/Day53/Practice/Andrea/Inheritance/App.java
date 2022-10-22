package Day53.Practice.Andrea.Inheritance;

public class App {
    public static void main(String[] args) {

        SuperClass superClass = new SuperClass();
        superClass.name = "I am Super CLass";
        System.out.println(superClass);

        SubClass subClass = new SubClass();
        subClass.name = "I am Sub Class";
        System.out.println(subClass);
}
 }