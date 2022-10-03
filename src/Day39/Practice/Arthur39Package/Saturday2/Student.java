package Day39.Practice.Arthur39Package.Saturday2;

import java.util.ArrayList;

public class Student {
    String fullName;
    int studentId;
    int maxCredit;
    ArrayList<Lesson> lesson;
    int totalCredit;

    public Student() {
        maxCredit = 20;
        totalCredit = 0;
        lesson = new ArrayList<>();
    }

    public Student(String fullName, int studentId) {
        this();
        this.fullName = fullName;
        this.studentId = studentId;
    }

    public void takeLesson(Lesson lesson){
        this.lesson.add(lesson);
        if(this.totalCredit+lesson.credit>this.maxCredit){
            System.out.println("You can not add this lesson. it is " + maxCredit);

        } else if(this.totalCredit<0) {
            System.out.println("You can not add this lesson. Not valid credit amount.");
        } else {
            this.totalCredit += lesson.credit;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", studentId=" + studentId +
                ", maxCredit=" + maxCredit +
                ", lesson=" + lesson +
                ", totalCredit=" + totalCredit +
                '}';
    }
}
