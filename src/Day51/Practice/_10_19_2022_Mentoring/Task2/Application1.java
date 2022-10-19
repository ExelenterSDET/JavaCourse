package Day51.Practice._10_19_2022_Mentoring.Task2;

import java.util.ArrayList;

public class Application1 {
    public static void main(String[] args) {
        Registration1 registration1 = new Registration1();
        ArrayList<User1> list = registration1.registry();
        registration1.printHappyUsers1(list);
    }
}
