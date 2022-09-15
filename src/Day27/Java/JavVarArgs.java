package Day27.Java;

import java.util.ArrayList;

public class JavVarArgs {

    int getNumber(int... nums){
        return 0;
    }
    String getString(String... strs){
        return "";
    }
    double getDouble (double... dbs){
        return 0;
    }
    float getFloat(float... flts){
        return 0.0f;
    }
    boolean getBoolean(boolean... bls){
        return false;
    }
    char getChar(char... chars){
        return 'a';
    }
    int[] getIntArr(int[]... multiDimArray ){ // int[][]
//        for (int[] ints : multiDimArray) {
//            for (int anInt : ints) {
//                System.out.println(anInt);
//            }
//        }
        return new int[0];
    }

    void getIntArr(int[][]... arrs){ // int[][][]

    }

    void getIntArrList(ArrayList<Integer>... list){

    }


    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        JavVarArgs jv = new JavVarArgs();
        jv.getIntArr(arr, arr2);

    }

}
