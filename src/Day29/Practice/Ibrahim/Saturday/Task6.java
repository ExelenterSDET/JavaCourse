package Day29.Practice.Ibrahim.Saturday;

import java.util.ArrayList;
import java.util.Arrays;

/*
        Task 6
        Create a void method that has an Arraylists of Integer as a parameter

        Count how many each Integer object repeats. Print the result.

        Example:
        [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

        output should be:
        1 = 3; 2 = 2; 3 = 2, 4 = 2, 5 = 2, 6 = 1;
 */
public class Task6 {

    static void counterOfInteger(ArrayList<Integer> a){

        while (!a.isEmpty()){
        int count = 0;
        int firstIndex = a.get(0);

        for (int i = 0; i < a.size(); i++) {
            count += firstIndex == a.get(i) ? 1 : 0;
        }
        System.out.print(a.get(0) + " = " + count + "; ");
        a.removeIf(s -> s == firstIndex);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        counterOfInteger(list);
    }
}
