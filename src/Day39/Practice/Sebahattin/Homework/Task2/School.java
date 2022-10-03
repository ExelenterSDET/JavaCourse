package Day39.Practice.Sebahattin.Homework.Task2;

public class School {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson("Math",8,74.5);
        Lesson lesson2 = new Lesson("Music",3,82.5);
        Lesson lesson3 = new Lesson("Science",5,69.4);
        Lesson lesson4 = new Lesson("Picture",3,55.8);
        Lesson lesson5 = new Lesson("Geography",4,80.0);

        Student student1 = new Student("Sebahattin Beycur", 182141);
        Student student2 = new Student("Sinan Batmaz", 182142);

        student1.takeLesson(lesson1);
        student1.takeLesson(lesson2);
        student1.takeLesson(lesson4);
        student1.takeLesson(lesson5);
        System.out.println(student1);
        System.out.println("======================================================");

        student2.takeLesson(lesson1);
        student2.takeLesson(lesson2);
        student2.takeLesson(lesson3);
        student2.takeLesson(lesson4);
        student2.takeLesson(lesson5);
        System.out.println(student2);
    }
}
