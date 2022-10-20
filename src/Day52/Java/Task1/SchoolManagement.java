package Day52.Java.Task1;

public class SchoolManagement {
    public static void main(String[] args) {

        School school = new School();
        school.setName("Exelenter");
        school.setPhoneNumber("551 800 2002");
        school.setEmail("exelenter@gmail.com");
        school.setAddress("123 Main St NY NY 10010");
        school.setSchoolSize(3);
        school.register(new Student("Ibrahim", "6Leaves"));
        school.register(new Student ("Mehmet", "Ates"));

        System.out.println(school);
        school.register(new Student("Mehmet", "Ali"));

        System.out.println("======= TEST Getters========");
        System.out.println(school.getName());
        System.out.println(school.getSchoolSize());
        System.out.println(school.getEmail());
        System.out.println(school.getPhoneNumber());
        System.out.println(school.getListOfStudents());




    }
}
