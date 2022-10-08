package Day44.Java.test;

import java.util.ArrayList;

public class JavaMath {
    public static int getTotal(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        return total;
    }

    public static String getString(ArrayList<String> list, String firstLetter){
        for(String str : list){
            if(str.startsWith(firstLetter)){
                return str;
            }
        }
        return null;
    }
}
