package Day52.Practice.Sebahattin.Task1;

public class Student {
    private String name;
    private String lastName;


    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
