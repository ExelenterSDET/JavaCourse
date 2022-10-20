package Day52.Practice.Task1;

public class SchoolManagement {
    public static void main(String[] args) {
        School school= new School();
        school.setName("Exelenter");
        school.setPhoneNumber("123-456-7899");
        school.setAddress("122 main str");
        school.setEmail("exelemnter@gmail.com");
        school.setSchoolSize(2);
        school.registerStudents(new Student("Sam","Jonson"));
        school.registerStudents(new Student("Mehmet","Atesh"));

        System.out.println("school = " + school);
        school.registerStudents(new Student("Maria", "Simons"));
        System.out.println("======================Test===================");
        System.out.println(school.getName());
        System.out.println(school.getPhoneNumber());
        System.out.println(school.getAddress());
        System.out.println(school.getEmail());


    }





}
