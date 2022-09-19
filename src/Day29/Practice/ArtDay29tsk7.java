package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArtDay29tsk7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                1, 3, 5, 4, 2, 3, 1, 2, 4, 2, 5, 1, 6
        ));
        System.out.println("rmDup(list) = " + rmDup(list));

    }

    static ArrayList<Integer> rmDup(ArrayList<Integer> arr){
        int i = 0;

        arr.sort(Comparator.naturalOrder());

        System.out.println(arr);

        while(i<arr.size()-1){

            while(arr.get(i)==arr.get(i+1) ){
                arr.remove(i+1);
                if(i==arr.size()-1){
                    break;
                }
            }
            i++;
        }
        return arr;
    }

}
