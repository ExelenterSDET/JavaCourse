package Day56.Practice.mentoring_10_26;

import Day1.Java.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamSort {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(5, 2, 4, 3, 1);
        Collections.sort(number);
        System.out.println(number);

        List<Integer> newInt = number.stream().sorted().toList();
        System.out.println("sorted" + newInt);
    }
}
