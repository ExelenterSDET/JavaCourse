package Day39.Practice.Tohir_Week_8.Task2;

import java.util.ArrayList;

public class Student {
    String FullName;
    int StudentId;
    int MaxCredit;
    ArrayList<Lesson> Lesson;
    int TotalCredit;

    public Student() {
        MaxCredit = 20;
        Lesson = new ArrayList<Lesson>();
        TotalCredit = 0;
    }

    public Student(String fullName, int studentId)
    {
        this();
        FullName = fullName;
        StudentId = studentId;
    }
    public Student takeLesson(Lesson lesson)
    {

        if(lesson.Credit<1)
        {
            System.out.println("You can not add this lesson. Not valid credit amount.");
        }
        else
        {

            ;
            if ((this.TotalCredit+lesson.Credit)>this.MaxCredit)
            {
                System.out.println("You can not add this lesson. Your maximum allowed credit is " + this.MaxCredit + ". You credit availability is ");
            }
            else {
                this.Lesson.add(lesson);
                this.TotalCredit += lesson.Credit;
            }

        }
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FullName='" + FullName + '\'' +
                ", StudentId=" + StudentId +
                ", MaxCredit=" + MaxCredit +
                ", Lesson=" + Lesson +
                ", TotalCredit=" + TotalCredit +
                '}';
    }
}
