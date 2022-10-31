package Day58.Practice.Dilnoza.SaturdayProject.StudentDataBase;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.enroll();
//        student.payTuition();
//        System.out.println(student.toString());

        System.out.println("enter number of new students to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = scan.nextInt();
        Student []students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            students[i]=new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students.toString());
        }
    }





}
