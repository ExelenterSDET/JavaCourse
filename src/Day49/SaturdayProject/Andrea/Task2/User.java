package Day49.SaturdayProject.Andrea.Task2;

import java.time.LocalDateTime;

public class User {

    String name;
    LocalDateTime registration;

    public User(String name) {
        this.name = name;
        registration = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
