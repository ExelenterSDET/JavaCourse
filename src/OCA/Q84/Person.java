package OCA.Q84;

public class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
//        new Person(name);
        this(name);
        this.age = age;
    }
}
