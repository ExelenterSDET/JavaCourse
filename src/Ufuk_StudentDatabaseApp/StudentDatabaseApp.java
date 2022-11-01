package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
//        Student st1=new Student();
//        st1.enroll();
//        st1.payTuition();
//        System.out.println(st1.showInfo());

        //create how many users we want to add
        System.out.println("Enter number of the new students to enroll : ");
        Scanner scan=new Scanner(System.in);
        int numOfStudents=scan.nextInt();
        Student[] students=new Student[numOfStudents];
        
         //create n number of students
        for (int i = 0; i < numOfStudents; i++) {
            students[i]=new Student();
            students[i].enroll();
            students[i].payTuition();
//            System.out.println(students[i].showInfo());
            
        }
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("================================");
            System.out.println(students[i].showInfo());
        }
    }
}
