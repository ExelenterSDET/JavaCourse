package Day58.Practice.Dilnoza.SaturdayProject.StudentDataBase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter students first name");
        this.firstName=scan.nextLine();

        System.out.println("Enter students last name");
        this.lastName=scan.nextLine();

        System.out.println("1-Freshmen\n2- Sophomore\n3-Junior\n4-Senior\nEnter student class level: ");
        this.gradeYear=scan.nextInt();
        System.out.println(firstName + "  " + lastName+" "+ gradeYear);




    }





}
