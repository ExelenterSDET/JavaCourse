package Day29.Practice.Ibrahim;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    // create a method, which will have as a parameter ArrayList<String>
    // "java", "is", "fun", "i", "love", "java"
    // remove all strings which have less than 3 characters
    // use for loop
    // return ArrayList<String>

    static ArrayList<String> removeLessThanThreeCharacter(ArrayList<String> str){


        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() < 3){
                str.remove(i);
                i--;
            }
        }

        return str;
    }

    static ArrayList<String> removeLessThanThreeCharacter2(ArrayList<String> str){


        str.removeIf(s -> s.length() < 3);

        return str;
    }

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(Arrays.asList("Java", "is", "fun", "i", "love", "java"));
        removeLessThanThreeCharacter2(str);
        System.out.println(str);
    }
}
