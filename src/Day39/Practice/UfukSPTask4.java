package Day39.Practice;

import java.util.*;

/*      Given an array of Strings.
        Create a method, that will sort this array of Strings in ascending order.

       !!!!!!!! NOTE: Do not use any of built-in sort methods => (Arrays.sort, Collection.sort etc.) !!!!!!!!!
 */
public class UfukSPTask4 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Ali","ali","mehmet", "Berrin", "armut", "zeynep","zeynep", "ahmet", "ufuk", "bayram"));
        System.out.println("arr = " + arr);

        sortString1(arr);
//        sortString2(arr);


    }

    static ArrayList<String> sortString1(ArrayList<String> arrayList) {
//    static TreeSet<String> sortString1(ArrayList<String> arrayList) {
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            map.put(arrayList.get(i).toLowerCase(), map.getOrDefault(arrayList.get(i).toLowerCase(),0)+1);
        }
//        System.out.println("map = " + map);
        TreeSet<String> ts = new TreeSet<>();
        for (String s : arrayList) {
            ts.add(s.toLowerCase());
        }
//        System.out.println("ts = " + ts);

        ArrayList<String> arrSorted=new ArrayList<>(ts);
        ArrayList<String>lastArrSorted=new ArrayList<>();
        for (int i = 0; i < arrSorted.size(); i++) {
            for (int j = 0; j <map.get(arrSorted.get(i)) ; j++) {   //kac kere yazilacagini hesapla
                lastArrSorted.add(arrSorted.get(i));
            }
                }
//        System.out.println("arrSorted = " + arrSorted);
        System.out.println("lastArrSorted = " + lastArrSorted);
        return lastArrSorted;
    }

//    static ArrayList<String> sortString2(ArrayList<String> arr) {
//
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = i + 1; j < arr.size(); j++) {
//
//                if (arr.get(j).toLowerCase().charAt(0) < arr.get(i).toLowerCase().charAt(0)) {
//                    String temp = arr.get(i);
//                    arr.set(i, arr.get(j));
//                    arr.set(j, temp);
//                }
////                else if (arr.get(j).toLowerCase().charAt(0) == arr.get(i).toLowerCase().charAt(0)) {
////                    int n = Math.min(arr.get())
////                    while ()
////
////                }
//
//            }
//        }
//        System.out.println("sorted: "+arr);
//        return arr;
//    }
}


