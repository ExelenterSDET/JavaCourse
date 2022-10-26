package Day56.Practice.mentoring_10_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SteamMap {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        List<Integer> list = squareList(number);
        System.out.println("list = " + list);

        List<Integer> newList = number.stream().map(eachNumber -> eachNumber * eachNumber).toList();
        System.out.println("newList = " + newList);




    }
    //1. create a method to return the list square numbers of list (number)
    static List<Integer> squareList(List<Integer> number){
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < number.size(); i++) {
            newList.add(number.get(i) * number.get(i));
        }
        return newList;
    }
}
