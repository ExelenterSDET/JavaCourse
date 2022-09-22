package Day32.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class arthur32day {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("a",12);
        map.put("b",13);

        HashMap<String, ArrayList<String>> employees = new HashMap<>();
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("mike","arthur","kevin"));


        HashMap<Integer, String> errorcode = new HashMap<Integer,String>();
        HashMap<Integer, String> errorcode2 = new HashMap<Integer,String>();

        errorcode.put(100,"continue");
        errorcode.put(101,"switching protocols");
        errorcode.put(102,"Webdav");

//        HashMap<Integer, String> errorcode3 = new HashMap<Integer,String>(errocode);


        System.out.println(errorcode);



    }
}
