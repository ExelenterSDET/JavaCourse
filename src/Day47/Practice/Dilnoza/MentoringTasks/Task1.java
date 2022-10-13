package Day47.Practice.Dilnoza.MentoringTasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /*
Write a program, that outputs the string represent numbers from 1 to N
        For multiples of 3 should print "Fizz"
        For multiples of 5 should print "Buzz"
        For multiples of 3 and 5 should print "FizzBuzz";

     */
    public static void main(String[] args) {
        List<String> list = fizBuzz(15);
        System.out.println("list = " + list);
    }
    static List<String> fizBuzz(int x) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= x; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(Integer.toString(i));
            }
        }return list;
    }

}