package Day41.Practice.Andrea.Mentoring;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {

    static String[] sortStringArray(String[] arr)
    {
        TreeMap<String, Integer> map = new TreeMap<>();
        int size = 0;
        for (String s : arr) {
            map.computeIfAbsent(s, k -> 0);
            map.computeIfPresent(s, (k, v)  -> v + 1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            size += entry.getValue();
        }
        String[] sortedArray = new String[size];
        int index = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                int counter = 1;
                while (counter <= entry.getValue()){
                    sortedArray[index++] = entry.getKey();
                    counter++;
                }
            }
            else {
                sortedArray[index++] = entry.getKey();
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        String[] string1 = {"dsdjf", "r", "agfsd", "kjhsdf", "r", "lkj"};
        System.out.println(Arrays.toString(sortStringArray(string1)));
    }
}
