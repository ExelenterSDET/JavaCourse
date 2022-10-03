package Day39.Practice.Ibrahim.Saturday.Task2;

public class School {
    public static void main(String[] args) {

        Lesson lesson1 = new Lesson("Math", 5, 60);
        Lesson lesson2 = new Lesson("Chem", 2, 70);
        Lesson lesson3 = new Lesson("Physics",4, 80);
        Lesson lesson4 = new Lesson("Bio", -6, 90);
        Lesson lesson5 = new Lesson("Geo", 18, 100);

        Student student = new Student("Ibrahim", 10001);
        Student student1 = new Student("Zubeyir", 10002);

        student.takeLesson(lesson1);
        student.takeLesson(lesson2);

        System.out.println(student);



        student1.takeLesson(lesson5);
        student1.takeLesson(lesson4);
        student1.takeLesson(lesson3);

        System.out.println(student1);
    }
}
