package Day52.Java.Task1;

import java.util.ArrayList;

public class School {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private int schoolSize;
    private ArrayList<Student>  listOfStudents;

    public School() {
        listOfStudents = new ArrayList<>();
    }

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

    public void register(Student student) {
        if(listOfStudents.size()+1 > schoolSize){
            throw new RuntimeException("You have reached maximum limit.");
        }
        this.listOfStudents.add(student);
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
}
