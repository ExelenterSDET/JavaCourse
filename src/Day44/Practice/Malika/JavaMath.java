package Day44.Practice.Malika;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class JavaMath {
    @Test

    public static int getTotal(int num){
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total+=i;
        }
        return total;
    }


    @Test
    public static String returnFirstString(ArrayList<String> list, String firstLetter){
        for (String str : list){
            if(str.startsWith(firstLetter)){
                return str;
            }
        }
        return "";

    }
}
