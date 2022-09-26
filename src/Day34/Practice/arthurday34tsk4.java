package Day34.Practice;

import java.util.ArrayList;

public class arthurday34tsk4 {    public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        System.out.println(me(addRandos(),15));

    }

}

    static boolean me(ArrayList<Integer> dummy, int x){

        for (int i = 0; i < dummy.size(); i++) {
            int y = dummy.get(i);
            for (int i1 = 1; i1 < dummy.size(); i1++) {
                int z = dummy.get(i1);
                if((y+z)==x){
                    System.out.println(y + " " + z);
                    return true;
                }
            }

        }

        return false;
    }

    static ArrayList<Integer> addRandos(){
        ArrayList<Integer> dummy = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dummy.add( (int) (Math.random() * 10));

        }
        System.out.println(dummy);
        return dummy;
    }
}
