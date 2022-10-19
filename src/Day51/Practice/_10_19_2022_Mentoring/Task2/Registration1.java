package Day51.Practice._10_19_2022_Mentoring.Task2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration1 {

    private LocalDateTime startTime1;

    public ArrayList<User1> registry(){
        startTime1 = LocalDateTime.now();
        ArrayList<User1> userList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String userName = "";

        while (!userName.equalsIgnoreCase("exit")){
            System.out.print("Enter user name (or type 'exit'): ");
            userName = scan.nextLine();
            if (!userName.equalsIgnoreCase("exit")){
                User1 user = new User1(userName);
                userList.add(user);
            }
        }
        return userList;
    }

    public void printHappyUsers1(ArrayList<User1> users){
        for (User1 user : users) {
            Duration durationDiff = Duration.between(startTime1, user.registration1);
            if (durationDiff.getSeconds() <= 10)
            System.out.println(user.name1 + ", registered in " + durationDiff.getSeconds() + " seconds");
        }
    }
}
