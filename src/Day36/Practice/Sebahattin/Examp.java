package Day36.Practice.Sebahattin;

public class Examp {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Sebahattin ";
        student.lastName = "BEYCUR";
        student.age = 42 ;
        student.gender = "M";
        student.email = "beycur@gmail.com";
        student.phone = "505 123 4567";

        Student student2 = new Student();
        student2.name = "Serkan ";
        student2.lastName = "BEYCUR";
        student2.age = 37 ;
        student2.gender = "M";
        student2.email = "beycur23@gmail.com";
        student2.phone = "505 765 4321";

        System.out.println(student.name+"\n"+student.lastName+"\n"+
                student.age+"\n"+student.gender+"\n"+student.phone+"\n"+student.email);
        System.out.println("====================");

        System.out.println(student2.name+"\n"+student2.lastName+"\n"+
                student2.age+"\n"+student2.gender+"\n"+student2.phone+"\n"+student2.email);
        System.out.println("=============");

        School school = new School();
        school.name = "Elazig MTAL";
        school.address = "Turkiye";
        school.webSite = "www.elazigmtal.meb.k12.tr";
        school.phone = "505 987 6543";

        System.out.println(school.name+"\n"+school.address+"\n"+school.webSite+"\n"+school.phone);
    }
}
class Student {
    String name;
    String lastName;
    int age;
    String gender;
    String phone;
    String email;
}
class School{
    String name;
    String address;
    String webSite;
    String phone;
}
