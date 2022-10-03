package Day39.Practice.Anthony.GroupProject8.Task2;

public class School {

    public static void main(String[] args) {
        System.out.println("==============================  TASK2  ====================================");


        Lesson lesson1 = new Lesson("Art",10, 90);
        Lesson lesson2 = new Lesson("Calculus",10, 85);
        Lesson lesson3 = new Lesson("PE",10, 100);
        Lesson lesson4 = new Lesson("Chemistry",10, 79);
        Lesson lesson5 = new Lesson("Elective1",15, 99);
        Lesson lesson6 = new Lesson("Elective2",10, 87);
        Lesson lesson7 = new Lesson("Elective3",10, 75);


        Student student1 = new Student("Anthony", 1000);
        Student student2 = new Student("Joe",1001);

        student1.takeLesson(lesson1);
        student1.takeLesson(lesson4);
        student1.takeLesson(lesson6);

        System.out.println(student1);

        student2.takeLesson(lesson2);
        student2.takeLesson(lesson3);
        student2.takeLesson(lesson5);
        student2.takeLesson(lesson7);

        System.out.println(student2);



    }
}
