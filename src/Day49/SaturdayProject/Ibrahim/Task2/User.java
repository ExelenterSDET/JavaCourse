package Day49.SaturdayProject.Ibrahim.Task2;

import java.time.LocalDateTime;

public class User {
    public String name;
    public LocalDateTime registration;

    public User(String name) {
        this.name = name;
        registration = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return name;
    }
}
