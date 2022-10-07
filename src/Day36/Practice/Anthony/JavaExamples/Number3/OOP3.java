package Day36.Practice.Anthony.JavaExamples.Number3;

import java.util.Random;

public class OOP3 {
    public static void main(String[] args) {
        Student student = new Student();

        School school = new School();
        school.schoolAddress = "123 Ivy League St";
        school.schoolName = "Yale";
        school.website = "www.com";
        school.tuition = 1400D;
        school.emailAddress = "Yale@gmail.com";

        Info info = new Info();
        info.name = "Anthony";
        info.lastName = "Hermann";
        info.email = "herrmanthony@gmail.com";
        info.phoneNumber = "123 456 6890";
        info.address = "Las Vegas";

        student.school = school;
        student.info = info;

        System.out.println(student.info.name);
        System.out.println(student.school.emailAddress);

        Student student2 = new Student();
        student2.school.schoolAddress = "Oxford st";
        student2.school.schoolName = "Princeton";
        student2.school.website = "www.Princeton.com";
        student2.school.tuition = 3000D;
        student2.school.emailAddress = "Priceton@gmail.com";
        student2.info.name = "Casper";
        student2.info.lastName = "Ghost";
        student2.info.email = "GFr.ali@gmail.com";
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
