package Day39.Practice.Sebahattin.Homework.Task2;

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
        this.lesson = new  ArrayList<>();
    }
    public Student(String fullName, int studentId){
        this();
        this.fullName = fullName;
        this.studentId = studentId;
    }
    public void takeLesson(Lesson lesson){
        this.lesson.add(lesson);
        this.totalCredit += lesson.credit;

        if(lesson.credit>0){
              if(totalCredit<=20) {
              }
              else {
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
                ", maxCredit=" + maxCredit +'\n' +
                "lesson=" + lesson +'\n' +
                "totalCredit=" + totalCredit +
                '}';
    }
}
