package Day30.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    /*
         Create a method, which will have list of list of Strings as a parameter.
       Convert all String character to camel case.
       return the list of list of strings
        */
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("USA","Canada","Mexico"));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York","Toronto","Mexico City"));
        ArrayList<String> language = new ArrayList<>(Arrays.asList("English","French","Spanish"));

        ArrayList<ArrayList<String>> arrayLists = t2.listOfList(countries, cities, language);
        System.out.println("arrayLists = " + arrayLists);



    }
    ArrayList<ArrayList<String>> listOfList (ArrayList<ArrayList<String>> str1 ){
        for (int i = 0; i < str1.size(); i++) {
            for (int j = 0; j < str1.get(i).size(); j++) {
                String str = str1.get(i).get(j);
                str= str.substring(0,1).toUpperCase().substring(1).toLowerCase();
                str1.get(i).set(j,str);


            }

        }return str1;
    }

}
