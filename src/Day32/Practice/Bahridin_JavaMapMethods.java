package Day32.Practice;

import java.util.HashMap;

public class Bahridin_JavaMapMethods {

    public static void main(String[] args) {

        HashMap<Integer,String> stCode=new HashMap<>();

        stCode.put(100,"Continue");
        stCode.put(101,"Switching Protocols");
        stCode.put(103,"Early Hints");
        stCode.put(200,"OK");
        //  stCode.put(202,"");

        System.out.println("stCode = " + stCode);

        HashMap<Integer,String> stCode1=new HashMap<>();
        //putAll()-method
        stCode1.putAll(stCode);
        System.out.println("stCode1 = " + stCode1);

        //remove()-method
        stCode1.remove(200);
        System.out.println("stCode1 = " + stCode1);

        //  public Set keySet(): This method is used to return the Set view containing all the keys.
        int size = stCode.keySet().size();
        System.out.println(size);

        // public Set entrySet(): This method is used to return the Set view containing all the keys and values.
        int size1 = stCode.entrySet().size();
        System.out.println(size1);


    }
}
