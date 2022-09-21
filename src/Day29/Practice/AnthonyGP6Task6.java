package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class AnthonyGP6Task6 {
    /*
        Task 6
            Create a void method that has an Arraylists of Integer as a parameter

            Count how many each Integer object repeats. Print the result.

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            1 = 3; 2 = 2; 3 = 2, 4 = 2, 5 = 2, 6 = 1;
         */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));

        repeatTask(list);
    }

    static int task1(Integer i, ArrayList<Integer> arg){
        int total=0;
        for (Integer f:arg ){
            if(i==f){
                ++total;
            }
        }return total;
    }

    static void repeatTask(ArrayList<Integer> arg){
        firstLoop:
        for (int i = 0; i <arg.size() ; i++) {
            secondLoop:
            for (int j = 0; j < i; j++) {
                if(arg.get(i)==arg.get(j)){
                    continue firstLoop ;
                }
            }
            System.out.print(arg.get(i) + "="+ task1(arg.get(i),arg)+", ");
        }
    }
}
