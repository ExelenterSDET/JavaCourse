package Day30.Java;

import java.util.ArrayList;
import java.util.List;

public class OCAQ41 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")){
            names.remove("Jon");
        }
        System.out.println(names);
    }
}
