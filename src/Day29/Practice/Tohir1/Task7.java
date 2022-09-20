package Day29.Practice.Tohir1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task7 {
    public static void main(String[] args) {
        Task7 asg = new Task7();
    ArrayList<Integer> list =new ArrayList<Integer>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        System.out.println(asg.noduplicate(list));
    }

    ArrayList<Integer> noduplicate(ArrayList<Integer> num)
    {
        Collections.sort(num);
        ArrayList<Integer> newlist = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
           if (newlist.contains(num.get(i))==false)
           {
               newlist.add(num.get(i));
           }
        }
        return newlist;
    }
/*    Task 7
    Create a method that has an Arraylists of Integer as a parameter.

    Remove all duplicates and return new ArrayList of Integer


    Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

    output should be:
            [1,2,3,4,5,6]*/
}
