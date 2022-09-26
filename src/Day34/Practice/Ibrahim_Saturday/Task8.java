package Day34.Practice.Ibrahim_Saturday;

import com.sun.source.util.Trees;

import java.util.*;

/*
        Task 8

       Create a method which will have as a parameter an array of strings.
       Return a Map<String, Boolean> where each different string is a key and
       its value is true if that string appears 2 or more times in the array.

       Example:
       ["a", "b", "a", "c", "b"]
       Result:
       {"a": true, "b": true, "c": false}
 */
public class Task8 {

    static TreeMap<String, Boolean> stringsMoreThanTwo(String [] list){

        TreeMap<String , Boolean> hmap = new TreeMap<>();
        TreeSet<String> key = new TreeSet<>(Arrays.asList(list));


        System.out.println("key = " + key);


        for (String s : key) {
            int counter = 0;
            for (String s1 : list) {
                counter += s.equals(s1) ?  1 : 0;
            }
            if(counter > 1){
                hmap.put(s, true);
            }else{
                hmap.put(s, false);
            }
        }
        return hmap;
    }

    public static void main(String[] args) {
        String[] str = {"a", "b", "a", "c", "b"};
        System.out.println(stringsMoreThanTwo(str));
    }
}
