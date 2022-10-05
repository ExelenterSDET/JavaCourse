package Day40.Practice.Andrea.Mentoring.Task2;

public class Lesson {
    String name;
    int credit;
    double grade;


    public Lesson(String name, int credit, double grade){
        this.name = name;
        this.credit = credit;
    }

    public void takeLesson (Student student, Lesson lesson, double grade){
        if (student.totalCredit + lesson.credit > student.maxCredit){
            System.out.println("You cannot add this lesson. Not valid credit amount.");
        }
    }


}
