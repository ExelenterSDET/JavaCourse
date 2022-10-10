package Day44.Practice.Andrea;

import java.util.ArrayList;

public class JavaMath {

    public static int getTotal(int num){
        int total = 0;
        for (int i = 0; i <= num; i++) {
            total += i;
        }
        return total;
    }

    public static String getString (ArrayList<String> list, String firstLetter){
        String firstStr = "";
        for (String str : list) {
            if (str.startsWith(firstLetter)){
                return str;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getTotal(8));
    }
}
