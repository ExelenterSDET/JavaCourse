package Day39.Practice.Tohir_Week_8.Task2;

public class School {
    public static void main(String[] args) {
        Student student_tohir = new Student("Tohir",235);
        Student student_zohir = new Student("Zohir",236);
        Lesson Chemistry = new Lesson("Chemisty",5);
        Lesson Physics = new Lesson("Physics",6);
        Lesson Maths = new Lesson("Maths",6);
        Lesson History = new Lesson("Hisory",0);
        Lesson Biology = new Lesson("Hisory",4);
        Lesson Geography = new Lesson("Geography",3);
        System.out.println(student_tohir);
        student_tohir.takeLesson(Chemistry);
        student_tohir.takeLesson(Physics);
        //System.out.println(student_tohir);
        student_tohir.takeLesson(History);
        //System.out.println(student_tohir);
        student_tohir.takeLesson(Biology);
        //System.out.println(student_tohir);
        student_tohir.takeLesson(Maths);
        //System.out.println(student_tohir);
        student_tohir.takeLesson(Geography);
        System.out.println(student_tohir);
        student_zohir.takeLesson(Geography);
        System.out.println(student_zohir);


    }
}
