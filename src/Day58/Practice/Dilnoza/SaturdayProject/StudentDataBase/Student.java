package Day58.Practice.Dilnoza.SaturdayProject.StudentDataBase;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses=null;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id =1000;

    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter students first name");
        this.firstName=scan.nextLine();

        System.out.println("Enter students last name");
        this.lastName=scan.nextLine();

        System.out.println("1-Freshmen\n2- Sophomore\n3-Junior\n4-Senior\nEnter student class level: ");
        this.gradeYear=scan.nextInt();


        setStudentID();

        System.out.println(firstName + " " + lastName+" "+ gradeYear + " " + studentID);


    }

    private void setStudentID() {
        id++;
        this.studentID= gradeYear + "" + id;

    }
    public void enroll() {
        do {
            System.out.println("Enter course to enroll: (Q to quite):");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.equals("Q")) {
                course = course + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {break;}}
            while (1 != 0) ;

            System.out.println("ENROLLED IN: " + courses);
            System.out.println("TUITION BALANCE: " + tuitionBalance);
    }
    public void viewBalance(){
        System.out.println("Your Balance is: $"+tuitionBalance);
    }
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance=tuitionBalance-payment;
        System.out.print("Thank you for your payments of: $" + payment);
        viewBalance();
    }
}