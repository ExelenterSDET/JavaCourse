package Day34.Practice;

import java.util.*;

public class arthurday34tsk6 {

    public static void main(String[] args) {
    ArrayList<Character> ch = new ArrayList<>(Arrays.asList('a', 'b', 'c' ,'e', 'f' ,'a' ,'t', 'd', 'a', 'l' ,'m' ,'u', 'v', 'x', 'a', 'e', 'b' ,'d'));
        System.out.println(uq(ch));

        System.out.println(me(ch));
        System.out.println(avg(me(ch)));
}

    static ArrayList<Character> uq(ArrayList<Character> lst){

        HashSet<Character> hashSet = new HashSet<>();
        hashSet.addAll(lst);
        ArrayList<Character> dummy = new ArrayList<>(hashSet);
        Collections.sort(dummy);
        Collections.reverse(dummy);
        return dummy;
    }

    static HashMap<Character, Integer> me(ArrayList<Character> c){
        HashMap<Character, Integer> dummy = new HashMap<>();

        for (Character s : c) {
            int ascii = (int) s;
            dummy.put(s, ascii);
        }

        return dummy;
    }

//     3. Create a method which will have HashMap<Character, Integer> as a parameter and will return a double.
//       Return the average of all values of a map. double number must have only 2 decimals. (Example: 10.25)

    static double avg(HashMap<Character, Integer> inMap){
        double sum = 0.0;
        for(Map.Entry<Character, Integer> row: inMap.entrySet()){
            sum = sum + row.getValue();
        }
        double dblSize = inMap.size();
        return ((int)(sum/dblSize*100))/100.0;

//        (int)(d*100) int gets rid of decimals then divide by 100.0


    }



}
