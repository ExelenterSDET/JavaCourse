package Day52.Practice.Ibrahim.Task1;

public class Student {
    private String name;
    private String lastname;


    public Student() {
    }

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
