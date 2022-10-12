package Day44.SaturdayProject.Tohir.TohirTask3;

import java.util.ArrayList;
import java.util.Arrays;

public class Number {
    public static boolean checkEvenNumber(int numb) {
        return (numb % 2 == 0);
    }

    public static ArrayList<Integer> evenNumbers()
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
        return list;
    }

    public static int sumuptointeger(int even)
    {
        int sum = 0;
        if(checkEvenNumber(even))
        {
            for (int i = 0; i <= even/2; i++) {

                sum += 2*i;
            }
        }
        return sum;
    }

}
