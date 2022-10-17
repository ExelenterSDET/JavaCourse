package Day49.SaturdayProject.Ibrahim.Task2;

import com.sun.source.tree.Tree;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Registration {
    LocalDateTime startTime;
    Duration difference;


    public LinkedHashMap<User, Long> register(){
        this.startTime = LocalDateTime.now();

        Scanner scan = new Scanner(System.in);
        LinkedHashMap<User, Long> winnerList = new LinkedHashMap<>();
        ArrayList<User> userList = new ArrayList<>();

        int flag = 1;

        while(flag == 1){
            System.out.print("Please enter a name : ");
            String name = scan.nextLine();

          if (!name.equalsIgnoreCase("Exit")){
              User user = new User(name);
              userList.add(user);
              if (startTime.plusSeconds(10).isAfter(user.registration)){
                  difference = Duration.between(startTime, user.registration) ;
                  winnerList.put(user, difference.getSeconds());

              }
              }else{ flag = 0;
              }
        }
        System.out.println();
        System.out.println("**** SCANNER *****\n" + "Provide name to register: ");
        userList.forEach(name -> System.out.println(name));
        return (winnerList);
    }
    public static void happyUsers(LinkedHashMap<User, Long> winnerList){

        System.out.println("****** print result *********\n" +
                "Happy users, that receive giveaways are : ");
        winnerList.forEach((name, duration) -> System.out.println("Username : " + name + ", registered in " + duration + " seconds"));
        System.out.println("**************************************");
    }

}
