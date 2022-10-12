package Day44.Practice.Ibrahim.Test;

import java.util.ArrayList;

public class JavaMath {

    public static int getTotal(int num){
        return (num * (num + 1))/2;
    }

    public static String getFirstString(ArrayList<String> list, String firstString){
        for (String s : list) {
            if(firstString.equalsIgnoreCase(s.substring(0,1))){
                return s;
            }
        }
        return null;
    }
}
