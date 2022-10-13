package Day47.Practice.Andrea.Mentoring;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(getFizzBuzz(15));
    }

    static List<String> getFizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }


}



