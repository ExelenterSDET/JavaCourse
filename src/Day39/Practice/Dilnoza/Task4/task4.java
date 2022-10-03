package Day39.Practice.Dilnoza.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class task4 {


   public  ArrayList<String> sortArrayInAscendingOrder(ArrayList<String> list){
       TreeSet<String> originalList=new TreeSet<>(list);
       ArrayList<String> sortedList = new ArrayList<>(originalList);


        return sortedList;
    }


    public static void main(String[] args) {
       task4 t4=new task4();
        ArrayList<String>list = new ArrayList<>(Arrays.asList("USA","GERMANY","JAPAN","ITALY","RUSSIA","KOREA","CHINA"));
        System.out.println(t4.sortArrayInAscendingOrder(list));
    }


}
