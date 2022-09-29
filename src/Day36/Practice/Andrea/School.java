package Day36.Practice.Andrea;

public class School {

    String name;
    String address;
    String grades;
    int numberOfStudents;


    public static void main(String[] args) {

        School school1 = new School();
        school1.name = "Lotus";
        school1.address = "11001 E Alameda Ave";
        school1.grades = "K-12";
        school1.numberOfStudents = 950;

        System.out.println(school1.name);
        System.out.println(school1.address);
        System.out.println(school1.grades);
        System.out.println(school1.numberOfStudents);
    }
}

class Student{

    String name;
    String lastName;
    String address;
    String phoneNumber;
    int age;
    String gender;

    public static void main(String[] args) {
        Student student = new Student();
        createStudent("Andrea", "Mikulin");
        createStudent("Mikulin", 41);
    }

    public static Student createStudent (String name, String lastName){
        Student student = new Student();
        student.name = name;
        student.lastName = lastName;
        return student;
    }

    public static Student createStudent(String lastName, int age){
        Student student = new Student();
        student.lastName = lastName;
        student.age = age;
        return student;
    }

    public static Student createStudent(String address) {
        Student student = new Student();
        student.address = address;
        return student;
    }

    public static void printStudentName(Student student){
        System.out.println(student.name + " " + student.lastName);
        System.out.println(student.phoneNumber);
        System.out.println(student.address);
        System.out.println(student.age);
    }

}


