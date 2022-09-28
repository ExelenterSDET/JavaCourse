package Day36.Java.Example1;

public class JavaOOP {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Furkat Ali";
        student.lastName = "Khalilov";
        student.age = 41;
        student.gender = "M";
        student.email = "khalilov.furkat.ali@gmail.com";
        student.phone = "551 804 6612";

        Student student2 = new Student();
        student2.name = "Bahodur";
        student2.lastName = "Otayev";
        student2.phone = "512 663 2152";
        student2.email = "bahodur.otayev@gmail.com";
        student2.age = 38;
        student2.gender = "M";

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
