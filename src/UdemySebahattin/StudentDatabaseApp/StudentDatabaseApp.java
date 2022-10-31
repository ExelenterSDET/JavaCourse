package UdemySebahattin.StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.enroll();
        stud.payTuition();
        System.out.println("===========================");
        System.out.println(stud.toString());

//        Student stud2 = new Student();
//        stud2.enroll();
//        stud2.payTuition();
//        System.out.println("===========================");
//        System.out.println(stud2.toString());
//
//        Student stud3 = new Student();
//        stud3.enroll();
//        stud3.payTuition();
//        System.out.println("===========================");
//        System.out.println(stud3.toString());

        System.out.println("Enter number of new students to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(stud.toString());
        }
    }
}
