package Day34.Java;

import java.util.HashMap;

public class ExampleJavaMapCompute {
    public static void main(String[] args) {

        char[] arr = {'a','b', 'w', 'x', 'o','a','l', 'c', 'd', 'e','a','b', 'c', 'd', 'e','a','b', 'w', 'x', 'o','a','l', 'c', 'd', 'e','a','b', 'c', 'd', 'e'};

        // Task Return all characters and how much they are repeated.

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], k-> 0);
            map.computeIfPresent(arr[i], (k,v)-> v+=1);
        }
        System.out.println(map);

//        Integer a = map.getOrDefault('c', 0);
//        System.out.println(a);
//
//        Integer a1 = map.get('z');
//        System.out.println(a1);

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map2.put(arr[i], map2.getOrDefault(arr[i], 0)+1);
        }

        System.out.println(map2);

        HashMap<Character, Integer> map3 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map3.get(arr[i]) == null){
                map3.put(arr[i], 1);
            }else{
                map3.replace(arr[i], map3.get(arr[i]) +1);
            }
        }
        System.out.println(map3);

    }
}
