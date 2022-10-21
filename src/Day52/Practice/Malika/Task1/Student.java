package Day52.Practice.Malika.Task1;

public class Student {
 /*1. Create a class as Student
    1.a attributes: name and lastName
    1.b constructor (overloaded)
    1.c toString()*/

    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

