package Day56.Practice.mentoring_10_26;

import java.util.Arrays;
import java.util.List;

public class JavaStream {
    // forEach, collect, filtered, map, sorted.

    public static void main(String[] args) {

        List<String> str = Arrays.asList("John", "Mike", "Tommy");
        str.stream().forEach(eachString -> System.out.println(eachString));

        System.out.println("===============================");

        for (String s: str) {
            System.out.println(s);
        }
    }

}
