package Day39.Practice.UfukSPTask2;

public class School {
    public static void main(String[] args) {
    Lesson lesson1=new Lesson("Math",5,94.5);
    Lesson lesson2=new Lesson("Physics",4,92.0);
    Lesson lesson3=new Lesson("History",3,75.8);
    Lesson lesson4=new Lesson("English",3,72);
    Lesson lesson5=new Lesson("Art",2,71);
    Lesson lesson6=new Lesson("Java",4,93);
    Lesson lesson7=new Lesson("C++",-6,85);

    Student student1=new Student("Ufuk",177);
    Student student2=new Student("Mehmet",305);

    student1.takeLesson(lesson1);
//        System.out.println("student1 = " + student1);
    student1.takeLesson(lesson2);
//        System.out.println("student1 = " + student1);
        student1.takeLesson(lesson7);
        System.out.println("student1 = " + student1);
        student1.takeLesson(lesson6);
        student1.takeLesson(lesson5);
        student1.takeLesson(lesson4);
        student1.takeLesson(lesson3);
        System.out.println("student1 = " + student1);
    }
}
