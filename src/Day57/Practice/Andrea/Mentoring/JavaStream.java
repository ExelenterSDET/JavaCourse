package Day57.Practice.Andrea.Mentoring;

import java.util.Arrays;
import java.util.List;

public class JavaStream {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("John", "Mike", "Tom");
        str.stream().forEach(eachString -> System.out.println(eachString));
    }
}
