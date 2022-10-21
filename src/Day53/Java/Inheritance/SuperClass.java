package Day53.Java.Inheritance;

public class SuperClass {
    String name;

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +
                " { name='" + name + '\'' +
                '}';
    }
}
