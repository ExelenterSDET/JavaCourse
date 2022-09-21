package Day30.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    /*
   Create a method, which will have list of list of Strings as a parameter.
   Convert all String character to upper case.
   return the list of list of strings

   9:30 - 9:40
   */
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("USA","Canada","Mexico"));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York","Toronto","Mexico City"));
        ArrayList<String> language = new ArrayList<>(Arrays.asList("English","French","Spanish"));

        ArrayList<ArrayList<String>> arrayLists = t2.listOfList(countries, cities, language);
        System.out.println("arrayLists = " + arrayLists);



    }
    ArrayList<ArrayList<String>> listOfList (ArrayList<String> str1 ,ArrayList<String> str2, ArrayList<String> str3){
        ArrayList<ArrayList<String>> newList= new ArrayList<>();
        newList.add(str1);
        newList.add(str2);
        newList.add(str3);

        for (int i = 0; i < newList.size(); i++) {
            ArrayList<String>temp =new ArrayList<>();


        }
        return newList;
    }
}
