package Day49.SaturdayProject.UfukSaturdayPTask2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    private static LocalTime startTime = LocalTime.now();
    static ArrayList<User> listOfUsers = new ArrayList<User>();

    public static ArrayList<User> register(){
        LocalTime currentTime = LocalTime.now();

        System.out.println("Provide name to register: ");
        while (true) {
            Scanner scan=new Scanner(System.in);
            String name = scan.nextLine();
            if("EXIT".equalsIgnoreCase(name)){
                break;
            }
            User user = new User(name);
            listOfUsers.add(user);
        }
       // System.out.println("list of Users: "+listOfUsers);
        return listOfUsers;
    }

    public static ArrayList<User> printHappyUsers(ArrayList<User> listOfUsers){
        ArrayList<User> happyUsers=new ArrayList<User>();
        System.out.println("Happy users, that receive giveaways are:");
        for (int i = 0; i < listOfUsers.size(); i++) {
            long timeDiff=(listOfUsers.get(i).registration).getSecond()-startTime.getSecond();
            if(timeDiff<=10){
                happyUsers.add(i,listOfUsers.get(i));
                System.out.println("Username= "+listOfUsers.get(i).name+", registered in "+timeDiff+" seconds");
            }
        }
        return happyUsers;
    }
}
