package Day49.SaturdayHmwk.Task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class User {
   String name;
   LocalDateTime registration;


    public User(String name) {
        this.name = name;
        registration = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
