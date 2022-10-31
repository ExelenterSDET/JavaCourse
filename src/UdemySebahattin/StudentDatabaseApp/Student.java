package UdemySebahattin.StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private int id = 1000;

    public Student() {
        System.out.println("Enter student first name : ");
        Scanner scan = new Scanner(System.in);
        this.firstName = scan.nextLine();

        System.out.println("Enter student last name : ");
        this.lastName = scan.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junier\n4 - Senior\nEnter student class level : ");
        this.gradeYear = scan.nextInt();

        setStudentId();


    }
    // Generate an id
    private String setStudentId() {
        id++;
        this.studentId = gradeYear+""+id;
        return studentId;
    }

    public void enroll(){
        do {
        System.out.println("Enter course to enroll (Q to quit): ");
        Scanner scan = new Scanner(System.in);
        String course = scan.nextLine();
            if (!course.equals("Q")){
                courses = courses+"\n "+course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
            System.out.println("BREAK!");
            break;
            }
        }
        while (1 != 0);

    }
    public void viewBalance(){
        System.out.println("Your balance is : $" + tuitionBalance );
    }

    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    @Override
    public String toString() {
        return "Student: " +
                "firstName : " + firstName + " " + lastName +
                "\nGrade Level : " + gradeYear +
                "\nStudent ID : " + studentId +
                "\nCourses Enrolled : " + courses +
                "\nBalance : " + tuitionBalance;
    }
}
