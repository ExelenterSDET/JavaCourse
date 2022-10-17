package Week10.Task2;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Registration registration = new Registration();
        List<User> users = registration.register();
        registration.printHappyUsers(users);
    }
}
