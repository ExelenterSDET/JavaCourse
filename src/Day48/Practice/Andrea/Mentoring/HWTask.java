package Day48.Practice.Andrea.Mentoring;

import java.util.LinkedHashMap;
import java.util.Map;

public class HWTask {

    static int firstNonRepeatingCharacter(String str){
        str = str.toLowerCase().replaceAll("[^\\w]", "");
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.computeIfAbsent(ch, k -> 0);
            map.computeIfPresent(ch, (k, v) -> v+1);
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = firstNonRepeatingCharacter("zzxxvvcczzbttxxyyzzvvy");
        System.out.println("n = " + n);

    }
}
