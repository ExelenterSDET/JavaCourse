package Day52.Practice.Andrea.Task1;

public class SchoolManagement {

    public static void main(String[] args) {
        School school1 = new School();
        school1.setName("Lotus");
        school1.setEmail("teacher@lotus.org");
        school1.setAddress("11001 E Main St");
        school1.setSchoolSize(500);
        school1.setPhoneNumber("555-333-1212");

        Student student1 = new Student("John", "Henry");
        Student student2 = new Student("Amy", "Jones");

        school1.register(student1);
        school1.register(student2);

        System.out.println(school1);
    }
}
