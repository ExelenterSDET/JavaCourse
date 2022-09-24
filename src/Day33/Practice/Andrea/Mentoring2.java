package Day33.Practice.Andrea;

import java.util.HashMap;

public class Mentoring2 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.println(map1);
        System.out.println(doStuff(map1));


    }

    static HashMap<String, String> doStuff (HashMap<String, String> map){
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;

    }
}
