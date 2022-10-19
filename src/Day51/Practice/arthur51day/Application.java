package Day49.SaturdayHmwk.Task2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Registration newReg = new Registration();
        LocalDateTime test = LocalDateTime.now();

        ArrayList<User> regList = newReg.register();

        System.out.println(test);
        System.out.println("Happy users, that receive giveaways are: ");
        for(User d: regList){
            Duration last10 = Duration.between(test,d.registration);

            int seconds = (int) last10.getSeconds();
            if(seconds<=10){
                System.out.println("Username = " + d.name + " registered in "+ seconds + "seconds");

            }
//            System.out.println("seconds " + seconds);
//            System.out.println(test);
//            System.out.println(last10);
//            System.out.println(d.registration);
        }
//        Registration.printHappyUsers(regList);

    }
}
