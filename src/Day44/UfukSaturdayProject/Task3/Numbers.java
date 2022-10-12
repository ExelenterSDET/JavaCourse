package Day44.UfukSaturdayProject.Task3;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public static boolean checkEvenNumber(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }

    public static List<Integer> evenNumbers(){
        List list=new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            if(checkEvenNumber(i)){
                list.add(i);
            }
        }
        return list;
    }
}
