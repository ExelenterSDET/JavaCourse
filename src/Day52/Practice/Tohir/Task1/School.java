package Day52.Tohir.Task1;

import java.util.List;

public class School {
   public String Name;
   public int schoolSize;
   public int phoneNumber;
   public String email;
   public String address;
   public List<Day52.Tohir.Task1.Student> ListofStudent;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSchoolSize() {
        return schoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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

    public List<Day52.Tohir.Task1.Student> getListofStudent() {
        return ListofStudent;
    }

    public void setListofStudent(Day52.Tohir.Task1.Student student) {
        if(this.ListofStudent.size()+1 > schoolSize){
            throw new RuntimeException("You have reached maximum limit.");
        }
        this.ListofStudent.add(student);
    }

    public School(String name, int schoolSize, int phoneNumber, String email, String address, List<Day52.Tohir.Task1.Student> studentList) {
        this.Name = name;
        this.schoolSize = schoolSize;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.ListofStudent = studentList;
    }

    @Override
    public String toString() {
        return "School{" +
                "Name='" + Name + '\'' +
                ", schoolSize=" + schoolSize +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", ListofStudent=" + ListofStudent +
                '}';
    }
}
