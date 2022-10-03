package Day39.Practice._10_03_2022_Mentoring.Task2;

import java.util.ArrayList;

public class Student {
    String fullName;
    int studentId;
    int maxCredit;
    ArrayList<Lesson> lesson;
    int totalCredit;

    public Student(){
        this.maxCredit = 20;
        this.totalCredit = 0;
        this.lesson = new ArrayList<>();
    }
    public Student(String studentName, int id){
        this();
        this.fullName = studentName;
        this.studentId = id;
    }
    public void takeLesson(Student student, Lesson lesson, double grade){
        if (student.totalCredit + lesson.credit > student.maxCredit){
            System.out.println("You can not add this lesson. Your maximum allowed credit is"
                    + student.maxCredit + ". You credit availability is "
                            + (student.maxCredit - student.totalCredit));
            System.out.println("==========================================");
        } else if (lesson.credit <= 0) {
            System.out.println("You can not add this lesson. Not valid credit amount.");
        }
        else {
            Lesson l1 = new Lesson();
            l1.name = lesson.name;
            l1.credit = lesson.credit;
            l1.grade = grade;
            student.totalCredit += lesson.credit;
            student.lesson.add(l1);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName +
                ", studentId=" + studentId +
                ", totalCredit=" + totalCredit +
                ", lesson=" + lesson +
                '}';
    }
}
