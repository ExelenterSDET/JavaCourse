package Day39.Practice.UfukSPTask2;

import java.util.ArrayList;

public class Student {
    String fullName;
    int studentId;
    int maxCredit;
    ArrayList<Lesson> lesson;
    int totalCredit;

    public Student() {
        this.maxCredit = 20;
        this.lesson = new ArrayList<>();
        this.totalCredit = 0;
    }

    public Student(String fullName, int studentId) {
        this();
        this.fullName = fullName;
        this.studentId = studentId;
    }

    public void takeLesson(Lesson lesson){
        if(lesson.credit>0){
            this.totalCredit += lesson.credit;
            if(totalCredit<=20) {
                this.lesson.add(lesson);
            }else
            {
                System.out.println("You can not add "+ lesson.name+". Your maximum allowed credit is "
                        + maxCredit + ". You credit availability is " + (maxCredit - totalCredit));
            }
        }else {
            System.out.println("You can not add "+ lesson.name+". Not valid credit amount.");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", studentId=" + studentId +
                ", maxCredit=" + maxCredit +
                ", totalCredit=" + totalCredit +
                ",\n lessons : " + lesson +
                '}';
    }
}
