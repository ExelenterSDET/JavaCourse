package SaturdayUdemyProject.Andrea.Task2;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int year;
    private String id;
    private Course course;
    private int balance;
    private int courseCost = 600;
    private static int idNum = 1000;

    //constructor with prompt for name and year

    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = scan.nextLine();
        System.out.print("Enter student's last name: ");
        this.lastName = scan.nextLine();
        System.out.print("Enter student's grade level: " +
                "\n1 for Freshman \n2 for Sophmore \n3 for Junior \n4 for Senior\n");
        this.year = scan.nextInt();
        setID();
        System.out.println("Name: " + firstName + " " + lastName + " " + year + " " + id);
    }

    //generate student ID
    private void setID() {
        idNum++;
        this.id = year + "" + idNum;
    }

    //enroll in courses

    //view balance

    //pay tuition

    //print status
}
