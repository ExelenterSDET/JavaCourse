package Week10.Task2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    public LocalDateTime startTime;

    public List<User> register() {
        List<User> user = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String USER = "";
        while (USER.equals("EXIT") == false) {
            USER = scanner.next();
            user.add(new User(USER));
        }
        return user;
    }

    public void printHappyUsers(List<User> users)
    {
        LocalDateTime after10seconds = users.get(0).registration.plusSeconds(10);
        System.out.println("Happy users, that receive giveaways are: ");
        for (User user : users) {

            if (user.registration.isBefore(after10seconds))
            {
                System.out.println(user.name + " with registation time of "+user.registration.minusSeconds(users.get(0).registration.getSecond()).getSecond());
            }
        }
    }
}
