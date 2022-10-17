package Day35.Practice;

import java.util.HashMap;
import java.util.Map;
/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}

 */
public class UfukTask3 {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        HashMap<String,Boolean> map=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        for(String str:strings){
            map2.put(str,map2.getOrDefault(str,0)+1);
        }
        for(String key:map2.keySet()){
            if(map2.get(key)>1){
                map.put(key,true);
            }else map.put(key,false);
        }
        return map;
    }

}
