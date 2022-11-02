package OCA.Q46;

import Day52.Java.User;

import java.util.ArrayList;
import java.util.List;

public class Q46 {
    public static void main(String[] args) {

        String names [] = {"Thomas", "Peter", "Joseph"};
        String pwd [] = new String [3];
        int idx = 0;
        try {
            for (String n : names){
                pwd [idx] = n.substring(2,6); // omas
                idx++;
            }
        }
        catch (Exception e){
            System.out.println("Invalid Name");
        }
        for (String p : pwd){
            System.out.println(p);
        }


    }
}
