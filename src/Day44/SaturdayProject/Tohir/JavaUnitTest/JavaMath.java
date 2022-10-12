package Day44.SaturdayProject.Tohir.JavaUnitTest;

import java.util.ArrayList;

public class JavaMath {
    public static int sumuptointeger(int numb)
    {
        int sum = 0;
        for (int i = 0; i <= numb; i++) {
            sum += i;
        }
        return sum;
    }
    public static String firstletter(ArrayList<String> arrayList, String firstletter)
    {
        String str = null;
        for (String s : arrayList) {
            if(s.startsWith(firstletter))
            {
                str = (s.substring(0,1));
                break;
            }
        }
        return str;
    }
}
