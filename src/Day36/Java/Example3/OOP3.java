package Day36.Java.Example3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OOP3 {
    public static void main(String[] args) {
        Student student = new Student();

        School school = new School();
        school.schoolAddress = "123 Bond St NY";
        school.schoolName = "Harward";
        school.website = "www.com";
        school.tuition = 1500D;
        school.emailAddress = "harward@gmail.com";

        Info info = new Info();
        info.name = "Ibrahim";
        info.lastName = "Altiyaprak";
        info.email = "ibrahim@gmail.com";
        info.phoneNumber = "555 222 33 22";
        info.address = "Toronto city";

        student.school = school;
        student.info = info;

        System.out.println(student.info.name);
        System.out.println(student.school.emailAddress);

        Student student2 = new Student();
        student2.school.schoolAddress = "Oxford st";
        student2.school.schoolName = "Oxford";
        student2.school.website = "www.oxford.com";
        student2.school.tuition = 2500D;
        student2.school.emailAddress = "oxford@gmail.com";
        student2.info.name = "Mehmet Ali";
        student2.info.lastName = "Aydin";
        student2.info.email = "mehmet.ali@gmail.com";
        student2.info.phoneNumber = "555 266 44 33";
        student2.info.address = "New York city";

        System.out.println(student2.info.name + " " +student2.info.lastName + " : " +student2.info.id);

    }
}
class Info{
    String name;
    String lastName;
    int id = new Random().nextInt((99999 - 10000) + 1) + 10000;
    String email;
    String phoneNumber;
    String address;
}
class Student{
    Info info = new Info();
    School school = new School();
}
class School{
    String schoolName;
    String schoolAddress;
    double tuition;
    String website;
    String emailAddress;
}
class Teacher {
    Info info;
    School school;
}
