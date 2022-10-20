package Day52.Practice.Task1;

public class Student {

private String name;
private String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
