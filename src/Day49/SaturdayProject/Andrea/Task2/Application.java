package Day49.SaturdayProject.Andrea.Task2;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Registration registration = new Registration();
        ArrayList<User> userList = registration.register();
        registration.printHappyUsers(userList);
    }
}
