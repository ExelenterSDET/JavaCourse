package Day57.Practice.Andrea.Mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMap {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        System.out.println(getSquares(number));

        List<Integer> newList = number.stream().map(eachNumber -> eachNumber*eachNumber).toList();
        System.out.println(newList);
    }

    public static List<Integer> getSquares(List<Integer> numList){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            newList.add(numList.get(i) * numList.get(i));
        }
        return newList;
    }
}
