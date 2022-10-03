package Day39.Practice.Ibrahim.Saturday.Task2;

import java.util.ArrayList;

public class Student {
    String fullName;
    int studentId;
    int maxCredit;
    ArrayList<Lesson> lesson;
    int totalCredit;

    public Student() {
        this.maxCredit = 20;
        this.totalCredit = 0;
        this.lesson = new ArrayList<>() ;
    }
    public Student(String fullName, int studentId){
        this();
        this.fullName = fullName;
        this.studentId =studentId;
    }


    public void takeLesson(Lesson lesson){
        if (lesson.credit > 0){
            this.totalCredit += lesson.credit;
            this.lesson.add(lesson);
            if (totalCredit > maxCredit){
                this.totalCredit -= lesson.credit;
                this.lesson.remove(lesson);
                System.out.println("*** You can not add " + lesson.name + "(" + lesson.credit + ")." +
                        "\nYour maximum allowed credit is " + maxCredit + " and your credit availability is " + (maxCredit - totalCredit) + "\n");
            }
        }else {
            System.out.println("*** You can not add " + lesson.name + ". It's credit (" + lesson.credit + ") is not valid\n");
        }

    }
    @Override
    public String toString() {
        return "Student{" +
                "Full Name = '" + fullName + '\'' +
                ", Student Id = " + studentId +
                ", Max Credit = " + maxCredit +
                ", Total Credit = " + totalCredit +
                "\n===================================" +
                "\nLessons List\n" + lesson +
                "\n===================================" +
                "\n===================================";
    }
}
