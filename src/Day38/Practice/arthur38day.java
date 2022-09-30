package Day38.Practice;

import java.util.Map;

public class arthur38day {
    public static void main(String[] args) {

    }

    Map<String,String> mapAB(Map<String,String> mp){
        if(mp.containsKey("a")&&mp.containsKey("b")){
            mp.put("ab",mp.get("a").concat(mp.get("b")));
        }
        return mp;
    }

}
