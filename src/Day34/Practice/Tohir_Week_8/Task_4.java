package Day34.Practice.Tohir_Week_8;

import java.util.ArrayList;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        Task_4 asg = new Task_4();
        System.out.println(asg.numlist());
        System.out.println(asg.TrueFalse(asg.numlist(),1));

    }
    ArrayList<Integer> numlist()
    {
        ArrayList<Integer> num = new ArrayList<>();
        Random ram = new Random();
        for (int i = 0; i < 10; i++) {
            num.add(ram.nextInt(0,10));
        }
        return num;
    }
    Boolean TrueFalse(ArrayList<Integer> numlist, int numb)
    {
        Boolean status = false;
        for (int i = 0; i < numlist.size(); i++) {
            for (int i1 = 0; i1 < numlist.size(); i1++) {
                if (i!=i1)
                {
                    if ((numlist.get(i)+numlist.get(i1))==numb)
                    {
                        status = true;
                        break;
                    }
                }
            }
        }
        return status;
    }
    /*
        Task 4
        1. Create a method which will return ArrayList<Integer> with no parameters.
           Add 10 random numbers between 0 and 10 to the list.

        2. Create a method which will return true or false.
           Parameter is ArrayList<Integer>, and int (X).
           Determine whether there exist two elements in the list whose sum is exactly X.

          Example:

          {1, 4, 45, 6, 10, 8} and X = 16
          Result = true;

          {1, 2, 4, 3, 6} and X = 11
          Result = false;
     */
}
