package Day44.SaturdayProject.Andrea.Task3;

import java.util.ArrayList;

public class Numbers {

//    -   create class Numbers
//    -- create method named as "checkEvenNumber",which returns true if provided integer is even
//    -- create a method "evenNumbers" which will return all even number b
    public static boolean checkEvenNumber(int num){
        return num%2 == 0;
    }

    public static ArrayList<Integer> evenNumbers () {
        ArrayList<Integer> evenNums = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            if (i%2 == 0){
                evenNums.add(i);
            }
        }
        return evenNums;
    }

    public static void main(String[] args) {
        System.out.println(checkEvenNumber(13));
        System.out.println(evenNumbers());
    }
}
