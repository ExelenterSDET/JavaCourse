package Day52.Java;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class User {
    private static int id = 1000;
    private String userName;
    private String password;
    private String birthDay;
    private int age;

    public User() {
    }

    public User(String userName, String password, String birthDay) {
        this.userName = userName;
        this.password = password;
        this.birthDay = birthDay;
        setAge();
        ++id;
    }

    public int getId() {
        return id;
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
        setAge();
    }

    public int getAge() {
        return age;
    }

    private void setAge() {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.parse(this.getBirthDay(), DateTimeFormatter.ofPattern("MM dd yyy"));
        this.age = Period.between(birthday, now).getYears();
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
