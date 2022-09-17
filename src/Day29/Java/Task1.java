package Day29.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        // create a method, which will have as a parameter ArrayList<String>
        // "java", "is", "fun", "i", "love", "java"
        // remove all strings which have less than 3 characters
        // use for loop
        // return ArrayList<String>

        Task1 ts = new Task1();
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("java", "is", "fun", "i", "love", "java"));

        System.out.println(ts.removeString(strings));

    }
    ArrayList<String> removeString(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() < 3){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
