package Day39.Practice.Tohir_Week_8.Task2;

public class Lesson {
    String Name;
    int Credit;
    double Grade;

    public Lesson(String name, int credit) {
        Name = name;
        Credit = credit;

    }

    @Override
    public String toString() {
        return "Lesson{" +
                "Name='" + Name + '\'' +
                ", Credit=" + Credit +
                ", Grade=" + Grade +
                '}';
    }
}
