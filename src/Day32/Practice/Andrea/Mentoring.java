package Day32.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Mentoring {

    //Task 9
    static void getUniqueInteger(Integer[] nums){
        ArrayList<Integer> listOfArray = new ArrayList<>(Arrays.asList(nums));

        for (int i = 1; i < listOfArray.size(); i++) {
            int value = listOfArray.get(i);
            listOfArray.removeIf(n -> n == value);
            i--;
        }
        System.out.println(listOfArray);
    }



    public static void main(String[] args) {
        Integer[] numbers = {4,2,2,1,1,4,5};
        getUniqueInteger(numbers);
    }


}
