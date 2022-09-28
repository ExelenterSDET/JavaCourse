package Day35.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Class_Tasks2 {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
        while(list.size()>0) {
            ArrayList<String> temporary = new ArrayList<>(list);
            temporary.removeIf((a) -> !a.startsWith(list.get(0).substring(0,1)));
            String value = "";
            for(String str : temporary){
                value = value.concat(str);
            }
            map.put(value.substring(0,1), value);
            list.removeIf((a) -> a.startsWith(list.get(0).substring(0,1)));
        }
        return map;
    }
    public Map<String, String> firstChar2(String[] strings) {
        HashMap<String,String> map=new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String val="";
            for (int j = 1; j < strings.length; j++) {
                if (strings[i].charAt(0)==strings[j].charAt(0)){
                    val=strings[i]+strings[j];
                }
                map.put(String.valueOf(strings[i].charAt(0)),val);
            }

        }
        return map;
    }

    public Map<String, String> firstChar3(String[] strings) {
        HashMap<String,String> map=new HashMap<>();
        for (String str : strings) {
            map.computeIfPresent(str.substring(0,1), (k,v) -> v.concat(str));
            map.computeIfAbsent(str.substring(0,1), k-> str);
        }
        return map;
    }

    public Map<String, String> firstChar4(String[] strings) {
        HashMap<String,String> map=new HashMap<>();
        for (String str : strings) {
            map.put(str.substring(0,1), map.getOrDefault(str.substring(0,1), "")+str);
        }
        return map;
    }


}
