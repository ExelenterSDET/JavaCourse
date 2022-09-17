package Day29.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        
        Task1 ts = new Task1();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java","is","fun", "i", "love", "java"));
        System.out.println("list = " + list);
        ts.removeSmallWords(list);
        System.out.println("list = " + list);


    }

        ArrayList<String> removeSmallWords (ArrayList<String> list){

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()< 3){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
