package Day44.UfukSaturdayProject.Task4;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        System.out.println(palindrom(args));
    }

    public static boolean palindrom(String[] str){
        String newStr="";
        for (int i = 0; i < str.length; i++) {
            newStr=newStr.concat(str[i]);
        }
//        System.out.println("newStr = " + newStr);

        String reversed="";
        for (int i =newStr.length()-1; i>=0; i--) {
            reversed=reversed.concat(String.valueOf(newStr.charAt(i)));
        }
//        System.out.println("reversed = " + reversed);

        if(newStr.equals(reversed)){
            return true;
        }else
            return false;
    }
}
