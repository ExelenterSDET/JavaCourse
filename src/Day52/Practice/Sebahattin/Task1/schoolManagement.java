package Day52.Practice.Sebahattin.Task1;

public class schoolManagement {
    public static void main(String[] args) {
        School school = new School();
        school.setName("Exelenter");
        school.setPhoneNumber("555 123 4567");
        school.setEmail("exelenter@gmail.com");
        school.setAddress("23 Main St NY NY 23050");
        school.setSchoolSize(3);
        school.register(new Student("Sebahattin", "Beycur"));
        school.register(new Student("Mehmet","Ates"));

        System.out.println(school);
        school.register(new Student("Ufuk","Sarac"));
//        school.register(new Student("Sinan", "Batmaz"));

        System.out.println("=======Test Getters=======");

        System.out.println(school.getName());
        System.out.println(school.getSchoolSize());
        System.out.println(school.getEmail());
        System.out.println(school.getPhoneNumber());
        System.out.println(school.getListOfStudents());





    }
}
