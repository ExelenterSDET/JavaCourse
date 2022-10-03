package Day39.Practice.Anthony.GroupProject8.Task2;

public class Lesson {

    String name;
    int credit;
    double grade;

    public Lesson(String name, int credit, double grade) {
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    public Lesson() {

    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ",\n credit=" + credit +
                ", grade=" + grade +
                '}';
    }
}
