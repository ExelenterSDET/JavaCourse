package Day52.Practice.Sebahattin.Task;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class User {
    private static int id;
    private String userName;
    private String password;
    private String birthDay;
    private int age;

    public User(){
    }

    public User(String userName, String password, String birthDay) {
        this.userName = userName;
        this.password = password;
        this.birthDay = birthDay;
        setAge();
        ++id;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.parse(this.getBirthDay(), DateTimeFormatter.ofPattern("MM dd yyy"));
        this.age = Period.between(now,birthday).getYears();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", age=" + age +
                '}';
    }
}
