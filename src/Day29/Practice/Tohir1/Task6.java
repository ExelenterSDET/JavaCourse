package Day29.Practice.Tohir1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {
        Task6 asg = new Task6();
        ArrayList<Integer> list =new ArrayList<Integer>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        asg.count(list);

    }
     void count(ArrayList<Integer> num)
    {
        ArrayList<Integer> newlist_1 = noduplicate(num);
        ArrayList<String> newlist_2 = new ArrayList<>();

        for (int i = 0; i < newlist_1.size(); i++) {
            int count = 0;
            for (int i1 = 0; i1 < num.size(); i1++) {
                if (num.get(i1)==newlist_1.get(i))
                {
                    count++;
                }
            }
            newlist_2.add(String.valueOf(newlist_1.get(i))+"="+String.valueOf(count));
        }
        System.out.println(newlist_2);
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
    //            Task 6
    //            Create a void method that has an Arraylists of Integer as a parameter
    //
    //            Count how many each Integer object repeats. Print the result.
    //
    //            Example:
    //            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]
    //
    //            output should be:
    //            1 = 3; 2 = 2; 3 = 2, 4 = 2, 5 = 2, 6 = 1;
}
