package Day39.Practice.UfukSPTask2;

public class Lesson {
    String name;
    int credit;
    double grade;

    public Lesson(String name, int credit, double grade) {
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\nLesson {" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                ", grade=" + grade +
                '}';
    }
}
