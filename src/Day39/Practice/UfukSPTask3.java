package Day39.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*Task 3
        Create a method which will take a String as a parameter and return type is char.
        This method should return a character which is mostly consecutively repeated.

        Example:
        String = "aaaabbacccccdddccaaaddddaac"
        Output should be c.

        Explanation: c continuously / without breaking is repeated 5 times. more then a, b, or d.
 */
public class UfukSPTask3 {
    public static void main(String[] args) {

        String string = "aaaabbacuuuuuuuuutuuuccccdddccaaaddddaac";
        maxRepeated1(string);
        maxRepeated2(string);
        maxRepeated3(string);
        maxRepeated4(string);
    }

    static Character maxRepeated1(String str) {

        int count = 1;
        int max = 0;
        char maxChar = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    maxChar = str.charAt(i - 1);
                }
                count = 1;
            }
        }
        System.out.println(maxChar + "  " + max);
        return maxChar;
    }

    static Character maxRepeated2(String str) {
        char chr = str.charAt(0);
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            int newcount = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j))
                    break;
                newcount += 1;
            }
            if (newcount > count) {
                count = newcount;
                chr = str.charAt(i);
            }
        }
        System.out.println(chr + "  " + count);
        return chr;
    }

    static Character maxRepeated3(String str) {
        char maxChar = 0;
        int count = 1;
        int maxCount = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxChar = str.charAt(i - 1);
                }
                count = 1;
            }

        }
        System.out.println(maxChar + "  " + maxCount);
        return maxChar;
    }

    static Character maxRepeated4(String str) {
        ArrayList<String> arr = new ArrayList<>();
        int counter = 0;
        String subStr = "";                     //stringi her harf degisiminde bolup substringlerin listesi haline getirdik.
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
//                System.out.println("counter = " + (i-1));
                subStr = str.substring(counter, i);
                arr.add(subStr);
//                System.out.println("i = " + i);
                counter = i;
            }
        }
        subStr = str.substring(counter, str.length());  //array in sonundaki harfi eklemiyordu. manuel ekledik.
        arr.add(subStr);

//        System.out.println("subStr = " + arr);

        int index = 0;                    //en uzun olan substringi bulup, karakterini yazdirdik.
        int elementlen = arr.get(0).length();
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).length() > elementlen) {
                index = i;
                elementlen = arr.get(i).length();
            }
        }
        System.out.println(arr.get(index).charAt(0)+"  "+elementlen);
        return arr.get(index).charAt(0);
    }

}


