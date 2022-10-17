package Week10.Task2;

import java.time.LocalDateTime;

public class User {
    public String name;
    public LocalDateTime registration;

    public User(String name) {
        this.name = name;
        this.registration = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
