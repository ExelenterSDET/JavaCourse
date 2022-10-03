package Day39.Practice.SaturdayProject8Andrea.Task2;

import java.util.ArrayList;
// not finished
public class Student {

    String fullName;
    int studentId;
    int maxCredit;
    ArrayList<Lesson> lessonList;
    int totalCredit;

    public Student(){
        this.maxCredit = 20;
        this.totalCredit = 0;
        ArrayList lessons = new ArrayList<Lesson>();
    }

    public Student(String fullName, int studentId){
        this();
        this.fullName = fullName;
        this.studentId = studentId;
    }

    public void takeLesson(Lesson lesson){

      //  this.lessonList =
    }

}


//- In the Student class create a default constructor that will set:
//        *   maxCredit as 20,
//        *   totalCredit as 0
//        *   initialize the Lesson list as new ArrayList<>()
//
//        - In the Student class create another constructor that will set:
//        *   reuse default constructor
//        *   add value to fullName
//        *   add value to studentId
//
//        - In the Student class create a method named as takeLesson(Lesson lesson)
//        This method should:
//        *  add lesson to the Student Lesson list
//        *  add lesson credit to the totalCredit
//
//        notes:
//        *  You should be able to add lessons only up to allowed maxCredit amount (20 credit in total).
//        If, adding lesson credit amount to totalCredit is more then allowed maxCredit, then print:
//        "You can not add this lesson. Your maximum allowed credit is " + maxCredit + ". You credit availability is " + (maxCredit - totalCredit)
//
//        * You should be able to add lessons only if their credit is not less or equal 0.
//        If credit is less or equal 0, print:
//        "You can not add this lesson. Not valid credit amount."