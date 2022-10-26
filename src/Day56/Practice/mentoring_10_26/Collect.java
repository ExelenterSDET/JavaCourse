package Day56.Practice.mentoring_10_26;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 5, 1, 3, 6, 7, 3);
        Set<Integer> set = number.stream().collect(Collectors.toSet());
        System.out.println("set = " + set);

    }
}
