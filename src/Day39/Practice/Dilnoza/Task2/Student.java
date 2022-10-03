package Day39.Practice.Dilnoza.Task2;

import java.util.ArrayList;

public class Student {
    String fullName;
    int studentId;
    int maxCredit;
    ArrayList<Lesson>lesson;
    int totalCredit;

    public Student() {
        this.maxCredit = 20;
        this.lesson =new ArrayList<>();
        this.totalCredit = 0;
    }

    public Student(String fullName, int studentId) {
        this();
        this.fullName =fullName ;
        this.studentId = studentId;
    }
     public void takeLesson(Lesson lesson){
 if(lesson.credit>0){
     totalCredit+=lesson.credit;
     this.lesson.add(lesson);
     if(totalCredit<maxCredit){
         this.totalCredit-=lesson.credit;
         this.lesson.remove(lesson);
         System.out.println("You can not add " + lesson.name + "(" + lesson.credit + ")." +
                 "\nYour maximum allowed credit is " + maxCredit + ". You credit availability is " + (maxCredit - totalCredit));
     }

     }else{System.out.println("You can not add " + lesson.name + ". It's credit (" + lesson.credit + ") is not valid");
 }

 }




}
