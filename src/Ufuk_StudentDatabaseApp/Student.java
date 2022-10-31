package StudentDatabaseApp;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String cources="";
    private  int tuitionBalance;
    private static int costOfCource=600;
    private static int id=1000;

    //contructor (prompt user to enter name and year)

    public Student() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName= scan.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName= scan.nextLine();

        System.out.println("1-Freshmen\n2-Sophomore\n3-Junior\n4-Senior\nEnter student class level: ");
        this.gradeYear=scan.nextInt();

        setStudentId();

//        System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentId);


    }
    //generate Id

    private void setStudentId() {
        //grade level + id
        id++;
        this.studentId = gradeYear+""+id;
    }

    //enroll cources
    public void enroll(){
        do{
        System.out.print("Enter the cources to enroll (Q for quit): ");
        Scanner scan=new Scanner(System.in);
        String course= scan.nextLine();
        if(!course.equalsIgnoreCase("Q")){
            cources+="\n  "+course;
            tuitionBalance+=costOfCource;
        }else {
            break;
        }
        }while (1!=0);
//        System.out.println("Cources : "+cources);
    }

    //view balance
    public void viewBalance(){
        System.out.println("Your Balance is : $"+tuitionBalance);
    }

    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment : $");
        Scanner scan=new Scanner(System.in);
        int payment= scan.nextInt();
        tuitionBalance-=payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }

    //show status

    public String showInfo() {
        return  "Name : " + firstName + " "+lastName +
                "\nstudentId='" + studentId +
                "\nEnrolled cources : "+cources +
                "\nBalance : $" + tuitionBalance ;
    }
}
