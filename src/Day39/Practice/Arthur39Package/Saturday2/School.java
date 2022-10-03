package Day39.Practice.Arthur39Package.Saturday2;

public class School {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson("physics", 5, 4.0);
        Lesson lesson2 = new Lesson("chemistry", 6, 3.0);
        Lesson lesson3 = new Lesson("english", 4, 3.5);
        Lesson lesson4 = new Lesson("pyschology", 7, 2.6);
        Lesson lesson5 = new Lesson("gym", 2, 4.0);

        Student student1 = new Student("mike",1234);
        Student student2 = new Student("bill",4321);


        student1.takeLesson(lesson1);
        student1.takeLesson(lesson1);
        student2.takeLesson(lesson2);
        student2.takeLesson(lesson2);



        System.out.println(student1);
        System.out.println(student2);

    }
}
