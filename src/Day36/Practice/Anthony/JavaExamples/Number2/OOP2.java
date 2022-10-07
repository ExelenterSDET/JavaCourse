package Day36.Practice.Anthony.JavaExamples.Number2;

public class OOP2 {

    public static void main(String[] args) {
        Student student = createStudent("Anthony", "Hermann");
        printStudentName(student);
        System.out.println("==================");
        createStudent(student, 12345, "herrmanthony@gmail.com", 36 );
        print(student);
        System.out.println("===================");
        Student student2 = createStudent("Casper", "Ghost", 111111, "friendlyGhost@gmail.com", 110);
        print(student2);
    }

    public static Student createStudent(String name, String lastName){
        Student student = new Student();
        student.name = name;
        student.lastName = lastName;
        return student;
    }

    public static Student createStudent(String name, String lastName, int id, String email, int age){
        Student student = new Student();
        student.name = name;
        student.lastName = lastName;
        student.id = id;
        student.email = email;
        student.age = age;
        return student;
    }

    public static Student createStudent(Student student, int id, String email, int age){
        student.id = id;
        student.email = email;
        student.age = age;
        return student;
    }

    public static void printStudentName(Student student){
        System.out.println(student.name + " " + student.lastName);
    }

    public static void print(Student student){
        System.out.println(student.name + " " + student.lastName + " : " +student.id + " : " + student.age + " : " +student.email);
    }
}
class Student{
    String name;
    String lastName;
    int id;
    String email;
    int age;
}

/*
    1. Add more attributes to the Student class
    2. Create another method to populate Student class attributes
    (use Method Overloading)
    3. Create a print method which prints all Student class attributes.

 */
