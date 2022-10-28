package Day57.Practice.Mentoring_10_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task2 {
    //Task2 -> Grouped Anagram[List<List<String>>]
    //Anagram
    // ate is anagram to eat == true
    // mom && mam == false
    //String[] strings = {"eat", "tea", "nat", "ate", "bat", "tan"};
    //[{eat, ate, tea}, {nat, tan}, {bat}]
    // create List<List<String>>
    // create a HashMap<String, List<String>>
    //
    // if is map containKey add if not add to a new list

    public static void main(String[] args) {

        String []strings = {"eat", "tea","nat","ate","bat","tan"};

        List<List<String>> lists = groupAnagram(strings);
        System.out.println("lists = " + lists);

    }
    static List<List<String>> groupAnagram(String []arr){

        List<List<String>> newList=new ArrayList<>();
        HashMap<String,List<String>> newMap=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char[]newCharArr = arr[i].toCharArray();
            Arrays.sort(newCharArr);
            String sort= new String(newCharArr);
            if(!newMap.containsKey(sort)){
                newMap.put(sort,new ArrayList<>());
            }
            newMap.get(sort).add(arr[i]);

        }
        newList.addAll(newMap.values());

        return newList;
    }

}
