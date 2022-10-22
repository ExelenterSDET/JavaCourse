package Day53.Practice.Sebahattin.Inheritance;

public class App {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.name = "I am Super Class";
        System.out.println(superClass);

        SubClass subClass = new SubClass();
        subClass.name = "I am Sub Class";
        System.out.println(subClass);

    }
}
