package Day52.Practice.Malika.Task1;

import java.util.ArrayList;

public class School {
    /*2. Create a class School
       a name
       phoneNumber
       email
       address
       schoolSize
       List<Student>*/
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSchoolSize() {
        return schoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", schoolSize=" + schoolSize +
                ", listOfStudents=" + listOfStudents +
                '}';
    }

    public void register (Student student) {
        if (listOfStudents.size()+1>schoolSize) {
            throw new RuntimeException("Exceeded the possible size");
        }
        this.listOfStudents.add(student);
    }

    private String email;
    private String address;
    private int schoolSize;
    private ArrayList<Student> listOfStudents;
    public School(){
        listOfStudents = new ArrayList<>();
    }

    public School(String name, String phoneNumber, String email, String address, int schoolSize, ArrayList<Student> listOfStudents) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.schoolSize = schoolSize;
        this.listOfStudents = listOfStudents;
    }

}
