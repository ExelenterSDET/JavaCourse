package Day53.Practice.Andrea.Inheritance;

public class SuperClass {

    String name;

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +
                " name= {'" + name + '\'' +
                '}';
    }
}
