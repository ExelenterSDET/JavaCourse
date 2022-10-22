package Day52.Practice.Ibrahim.Task1;

import java.util.ArrayList;

public class SchoolManagement {

    public static void main(String[] args) {

        School school = new School();

        school.setName("Oxford");
        school.setPhoneNumber("555-555-5555");
        school.setAddress("UK");
        school.setEmail("oxford@oxford.com");
        school.setSchoolSize(3);
        school.register(new Student("Ibrahim", "Altiyaprak"));
        school.register(new Student("Zubeyir", "Bayram"));

        System.out.println("school = " + school);

        school.register(new Student("Mehmet", "Ali"));


        String address = school.getAddress();
        System.out.println("address = " + address);
        ArrayList<Student> studentList = school.getStudentList();
        System.out.println("studentList = " + studentList);
        String email = school.getEmail();
        System.out.println("email = " + email);
    }
}
