package Day44.SaturdayProject.Sebahattin.Task3;

import java.util.ArrayList;

public class Numbers {

    public boolean checkEvenNumber(int num){
        return (num%2 == 0);
    }
    public ArrayList<Integer> evenNumbers (){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            if (i%2 == 0){
                    arr.add(i);
                }
            }
        return arr;
    }
}
