package Day39.Practice.Arthur39Package;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SatTsk {
    public static void main(String[] args) {

        char s = ctr("aaaaaabbacccccdddccaaaddddaac");

    }
    public static char ctr(String str){
char s = 'a';
      HashMap<String,Integer> map = new HashMap<>();
        String[] substrings = str.split("");

       for (String ch : substrings) {


            map.computeIfAbsent(ch, (k) -> 0);
            map.put(ch,getlen(ch,substrings));

        }
        System.out.println(map);

        int maxValueInMap = (Collections.max(map.values()));

        // Iterate through HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {


        if (entry.getValue() == maxValueInMap) {

                // Print the key with max value
                System.out.println(entry.getKey());
            }
        }

//=====================================================
//        System.out.println(getTotConseCnt("a",substrings));
        System.out.println(getlen("a",substrings));

//        System.out.println(map);

return s;
    }



    public static int getlen(String ch, String[] substrings ){
        int ctr=0;
        int i=0;
        int dummy = 0;
        int total = 0;
        while(i<substrings.length){
            if (!ch.equals(substrings[i])) {
                i++;
            } else {
                    while (ch.equals(substrings[i]) )
                    {
                        total++;
                        i++;
                        if(i>substrings.length-1)
                        {
                            break;
                        }
                    }
                    if(total>ctr)
                    {
                        ctr = total;
                        total = 0;
                    } else {
                        total = 0;
                    }


                    }

        }
        return ctr;
    }


}
