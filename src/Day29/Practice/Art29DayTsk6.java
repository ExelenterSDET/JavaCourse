package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Art29DayTsk6 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                1,2,2,2,5,5,5,4,34,34,34,23,67
        ));

        howRpt(list);

    }



    static int me(Integer i, ArrayList<Integer> arg){
        int total=0;
        for (Integer s: arg) {
            if (i==s) {
                ++total;
            }
        }
        return total;
    }

    static void howRpt(ArrayList<Integer> arg){
        loop1:
        for (int i = 0; i < arg.size(); i++) {
            loop2:
            for (int j = 0; j < i; j++) {
                if (arg.get(i)==arg.get(j)) {
                    continue loop1;
                }
            }
            System.out.println(arg.get(i) +" " + me(arg.get(i),arg));

        }
    }

}
