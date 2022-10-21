package Day52.Practice.Malika.Task1;

public class SchoolManagement {
    /*7. Create a School management class.
   Create a School instance
   initialize attributes.
   add some students.*/
    public static void main(String[] args) {
        School school = new School();
        school.setName("Exelenter");
        school.setPhoneNumber("5302461191");
        school.setEmail("malika.sadykova@yahoo.com");
        school.setAddress("Merkez mah., Bilge Sk, No:13, D:6, Cekmekoy, Istanbul");
        school.setSchoolSize(3);
        school.register(new Student("Malika", "Sadykova"));
        school.register(new Student("Alihan", "Turdiev"));

        System.out.println(school);
        school.register(new Student("Imran", "Turdiev"));

        System.out.println("=========TEST GETTERS==========");
        System.out.println(school.getName());
        System.out.println(school.getSchoolSize());
        System.out.println(school.getEmail());
        System.out.println(school.getPhoneNumber());
        System.out.println(school.getListOfStudents());
    }
}
