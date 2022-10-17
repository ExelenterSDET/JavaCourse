package Day49.SaturdayProject.Andrea.Task2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    private LocalDateTime startTime;

    public ArrayList<User> register(){
        this.startTime = LocalDateTime.now();
        ArrayList<User> userList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean keepAddingNames = true;
        while(keepAddingNames){
            System.out.print("Enter name to register: ");
            String name = scan.next();
            if(name.equalsIgnoreCase("exit")){
                break;
            }
            User user = new User(name);
            userList.add(user);
            System.out.println();
        }
        return userList;
    }

    public void printHappyUsers(ArrayList<User> list){
        for (User user : list) {
            Duration duration = Duration.between(startTime, user.registration);
            if (duration.getSeconds() <= 10) {
                System.out.println(user);
            }
        }
    }
}
