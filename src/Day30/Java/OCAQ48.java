package Day30.Java;

import java.util.ArrayList;
import java.util.List;

public class OCAQ48 {
    public static void main(String[] args) {

        List colors = new ArrayList();
        colors.add("green"); //0
        colors.add("blue"); // 1
        colors.add("red"); //2 -> removed
        colors.add("yellow"); //3 // after remove this index will be 2
        colors.remove(2);
        colors.add(3, "cyan");
        colors.add(4, "black");
        System.out.println(colors);


    }
}
