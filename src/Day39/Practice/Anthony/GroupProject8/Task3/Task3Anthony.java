package Day39.Practice.Anthony.GroupProject8.Task3;

public class Task3Anthony {
    /*
    Create a method which will take a String as a parameter and return type is char.
        This method should return a character which is mostly consecutively repeated.

        Example:
        String = "aaaabbacccccdddccaaaddddaac"
        Output should be c.

        Explanation: c continuously / without breaking is repeated 5 times. more then a, b, or d.

        note: This is a most recent interview question!!!
     */
//    public static void main(String[] args) {
//        String str = "aaaabbacccccdddccaaaddddaac";
//        Map<Character,Integer> map1 = new HashMap<Character,Integer>();
//
//        for(int k=0; k < str.length(); k++)
//        {
//            char currentChar = str.charAt(k);
//            map1.merge(currentChar, 1, Integer::sum);
//        }
//        int max=0;
//        char maxCharacter = 'c';
//        for (Map.Entry<Character, Integer> entry : map1.entrySet())
//        {
//            System.out.println("Key=" + entry.getKey() + ":Value" + entry.getValue());
//            if(max<entry.getValue()){
//                max=entry.getValue();
//                maxCharacter=entry.getKey();
//            }
//        }
//        System.out.println("Max Character=" + maxCharacter + "Max Count" + max);
//    }

    static char maxRepeating(String str) {
        int n = str.length();
        int count = 0;
        char result = str.charAt(0);
        int cur_count = 1;


        for (int i = 0; i < n; i++) {

            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
                cur_count++;



            else {
                if (cur_count > count) {
                    count = cur_count;
                    result = str.charAt(i);
                }
                cur_count = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("==============================  TASK3  ====================================");
        String str = "aaaabbacccccdddccaaaddddaac";
        System.out.println("Max Consecutively Repeating Character = " +maxRepeating(str));
    }
}





