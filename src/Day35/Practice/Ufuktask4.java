package Day35.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]
 */
public class Ufuktask4 {
    public static void main(String[] args) {
//        math1([10]);
        List a=new ArrayList<>(Arrays.asList(1,2,3,5));

        math1(a);
    }
    public static List<Integer> math1(List<Integer> nums) {
        List<Integer> result= new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            result.add(i,(nums.get(i)+1)*10);
        }
        System.out.println("result = " + result);
            return result;
        }

    }

