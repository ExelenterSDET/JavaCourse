package Day46.SP;

import org.testng.annotations.Test;

public class SPTask4_3 {

    static int getTotal(String str){
        String[] arrStr = str.split(" ");
        int total = 0;
        for (int i = 0; i < arrStr.length; i++) {
            total += arrStr[i].length();
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(getTotal("Java is Fun 2005"));
    }

}
