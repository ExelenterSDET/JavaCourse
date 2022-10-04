package Day39.Practice._10_03_2022_Mentoring.Task2;

public class School {
    public static void main(String[] args) {
        Lesson physics = new Lesson("Physics", 6);
        Lesson science = new Lesson("Science", 6 );
        Lesson biology = new Lesson("Biology", 3 );
        Lesson english = new Lesson("English", 4);
        Lesson calculus = new Lesson("Calculus", 6);

        Student student = new Student("Jack", 1);

        student.takeLesson(student, physics, 80);
        student.takeLesson(student, science, 90);
        student.takeLesson(student, physics, 80);
        student.takeLesson(student, science, 90);
        System.out.println(student);
    }
}
