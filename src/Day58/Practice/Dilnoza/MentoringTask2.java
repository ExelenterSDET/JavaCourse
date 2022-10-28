package Day58.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MentoringTask2 {
// Anagram
// ate is anagram to eat == true
// mom && mam == false

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






        public static void main(String[] args) {


            String []strings = {"eat", "tea","nat","ate","bat","tan"};

            List<List<String>> lists = groupAnagram(strings);
            System.out.println("lists = " + lists);
        }


    }


