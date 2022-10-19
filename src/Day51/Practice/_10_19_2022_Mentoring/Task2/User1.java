package Day51.Practice._10_19_2022_Mentoring.Task2;

import java.time.LocalDateTime;

public class User1 {

    public String name1;
    public LocalDateTime registration1;

    public User1(String name) {
        this.name1 = name;
        this.registration1 = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name1 + '\'' +
                '}';
    }
}
