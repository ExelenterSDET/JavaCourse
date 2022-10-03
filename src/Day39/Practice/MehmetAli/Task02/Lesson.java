package Day39.Practice.MehmetAli.Task02;
/*Task 2
        - Create a class Lesson with fields:
            String name
            int credit
            double grade

        - Create a class Student with fields:
            String fullName;
            int studentId;
            int maxCredit;
            ArrayList<Lesson> lesson;
            int totalCredit;

        - In the Student class create a default constructor that will set:
            *   maxCredit as 20,
            *   totalCredit as 0
            *   initialize the Lesson list as new ArrayList<>()

        - In the Student class create another constructor that will set:
            *   reuse default constructor
            *   add value to fullName
            *   add value to studentId

        - In the Student class create a method named as takeLesson(Lesson lesson)
            This method should:
             *  add lesson to the Student Lesson list
             *  add lesson credit to the totalCredit

             notes:
             *  You should be able to add lessons only up to allowed maxCredit amount (20 credit in total).
                If, adding lesson credit amount to totalCredit is more then allowed maxCredit, then print:
                "You can not add this lesson. Your maximum allowed credit is " + maxCredit + ". You credit availability is " + (maxCredit - totalCredit)

             * You should be able to add lessons only if their credit is not less or equal 0.
                If credit is less or equal 0, print:
                "You can not add this lesson. Not valid credit amount."

        - Create a School class and a main method.

            Create 5 instances of Lesson class
            Create 2 instances of Student class

            Assign to Students some lessons
            Print your result.

 */

public class Lesson {
    String name;
    int credit;
    double grade;

    public Lesson(String name, int credit, double grade) {
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\nLesson {" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                ", grade=" + grade +
                '}';
    }
}
