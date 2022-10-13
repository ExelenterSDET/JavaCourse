package ExerciseTasks;
import java.util.HashMap;
import java.util.Map;
/*Task#6
          Create a method which will take a String as a parameter and return type is char.
          This method should return a character which is mostly repeated.

          Example:
          String = "aaaabbaccccccccccdddccaaaddddaac"
          Output should be c.
 */
public class UfukTask25 {
    public static void main(String[] args) {
        cokTekrarBul("aabbaccccddc");
    }

    public static char cokTekrarBul(String str){
        HashMap<Character,Integer> map1=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map1.put(str.charAt(i), map1.getOrDefault(str.charAt(i),0)+1);
        }
       System.out.println("map = " + map1);
        int max=0;
        Character chr = null;
        for(Map.Entry<Character,Integer> row: map1.entrySet()){
            if(row.getValue()>max){
                max= row.getValue();
                chr= row.getKey();
            }
        }
        System.out.println(chr);
        return chr;
    }
}
