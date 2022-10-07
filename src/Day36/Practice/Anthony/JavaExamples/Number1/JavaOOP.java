package Day36.Practice.Anthony.JavaExamples.Number1;

public class JavaOOP {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Anthony A.";
        student.lastName = "Hermann";
        student.age = 36;
        student.gender = "M";
        student.email = "herrmanthony@gmail.com";
        student.phone = "949 689 8601";

        Student student2 = new Student();
        student2.name = "Casper";
        student2.lastName = "Ghost";
        student2.phone = "999 999 9999";
        student2.email = "freindly.ghost@gmail.com";
        student2.age = 115;
        student2.gender = "U";

        System.out.println(student.name + "\n" + student.lastName
                + "\n" + student.age + "\n" + student.gender+ "\n" + student.phone+ "\n" + student.email);

        System.out.println("====================");

        System.out.println(student2.name + "\n" + student2.lastName
                + "\n" + student2.age + "\n" + student2.gender+ "\n" + student2.phone+ "\n" + student2.email);

        School school1 = new School();

        System.out.println("====================");
        System.out.println(school1.schoolName + "\n" + school1.address + "\n" + school1.webSite);
    }
}

class Student{
    String name;
    String lastName;
    int age;
    String gender;
    String phone;
    String email;
}

/*
    School
    give attributes to the class (at least 3)

 */

class School{
    String schoolName;
    String address;
    String webSite;
}
