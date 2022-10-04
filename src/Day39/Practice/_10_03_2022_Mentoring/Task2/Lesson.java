package Day39.Practice._10_03_2022_Mentoring.Task2;

public class Lesson {

    String name;
    int credit;
    double grade;
    public Lesson (){}
    public Lesson(String name, int credit){
        this.name = name;
        this.credit = credit;
    }
    public Lesson(String name, int credit, double grade){
        this(name, credit);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\nLesson{" +
                "name='" + name  +
                ", credit=" + credit +
                ", grade=" + grade +
                '}';
    }
}
