package Day39.Practice.Tohir_Week_8.Task3;

import java.util.Scanner;

public class Task3_oldschool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char max = MaxOccurance(str);
        System.out.println(max);
    }
    public static char MaxOccurance(String str)
    {
        String [] strSplit = str.split("");
        char max = ' ';
        int maxint = 0;
        int localmax = 0;
        for (int i = 0; i < strSplit.length-1; i++) {

                if (strSplit[i].equals(strSplit[i+1]))
                {
                    localmax++;
                }

            else if (maxint<localmax)
            {
                max =  strSplit[i].charAt(0);
                maxint=localmax;
            }
        }
        return max;
    }
}
/*        String [] strSplit = str.split("");
        char max = ' ';
        int maxint = 0;
        for (int i = 0; i < strSplit.length; i++) {
            int localmax = 0;
            for (int i1 = i+1; i1 < strSplit.length; i1++) {
                if (strSplit[i].equals(strSplit[i1]))
                {
                    localmax++;
                }
            }
            if (maxint<localmax)
            {
                max =  strSplit[i].charAt(0);
                maxint=localmax;
            }
        }*/