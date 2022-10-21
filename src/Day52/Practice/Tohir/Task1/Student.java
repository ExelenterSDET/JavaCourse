package Day52.Tohir.Task1;

public class Student {
   public String Name, LastName;

    public Student(String name, String lastName) {
        Name = name;
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
