package Day49.SaturdayHmwk.Task2;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
   private LocalDateTime startTime;

   public ArrayList<User> register() {
       ArrayList<User> dummy = new ArrayList<>();
       LocalTime lt = LocalTime.now();
       System.out.println("Provide name to register: ");
       Scanner scan = new Scanner(System.in);
       String name = scan.nextLine();


       while(!(name.equals("EXIT"))){
           User user = new User(name);
           name = scan.nextLine();

           dummy.add(user);
       }
       return dummy;
   }


public static void printHappyUsers(ArrayList<User> dt) {

       for(User dd: dt){
           System.out.println(dd);
       }

}


}
