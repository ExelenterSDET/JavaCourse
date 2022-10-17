package Day49.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MentoringTasksDilnoza {
/*
 Task 1.
        Using random class, create a random number up to 100
        return list and count of numbers divisible by 8;
 */
    public static void main(String[] args) {
        Random random = new Random();
      int num= random.nextInt(100);
        for (int i = 0; i < num ; i++) {
            if(i%8==0){
                System.out.print(i+", ");
            }

        }




        /*
         List<Integer> newList= new ArrayList<>();
        newList.add(random.nextInt(100));
        int count=0;
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i)%8==0){
                count+=newList.get(i);
                System.out.println( i+", ");
            }

        }
        System.out.println("count = " + count);
         */


    }
}
