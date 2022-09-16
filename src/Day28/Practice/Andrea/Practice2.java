package Day28.Practice.Andrea;

import java.util.ArrayList;

public class Practice2 {

    public static void main(String[] args) {

        String[] arr = new String[5]; //can have a maximum of 5 elements (length is set)

        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = 5;
        list.add(num); //autoboxing - automatically converts primitive to Wrapper class

        Integer integer = list.get(0);
        int num2 = list.get(0); //unboxing - wrapper class is converted to primitive
    }

}
