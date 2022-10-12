package Day44.Practice.Ibrahim.Saturday.Task3;

import java.util.ArrayList;

public class Numbers {

    public static boolean checkEvenNumber(int num){
        return num %2 == 0;
    }

    public static ArrayList<Integer> evenNumbers(){
        ArrayList<Integer> evenNumberList = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            if(i %2 == 0){
                evenNumberList.add(i);
            }
        }
        return evenNumberList;
    }

    public static void main(String[] args) {
//        System.out.print(checkEvenNumber(20));

        evenNumbers();
    }
}
