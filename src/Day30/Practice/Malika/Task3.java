package Day30.Practice.Malika;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        //TASK3
 /*
    Create a method, which will have list of list of Strings as a parameter.
    Convert all Strings to be Camel Case. Example dog => Dog, if cat => Cat
    return the list of list of strings*/

        ArrayList<ArrayList<String>> listoflists = new ArrayList<>();

        ArrayList<String> animals = new ArrayList<>(Arrays.asList("cat", "dog", "fox", "wolf", "tiger"));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Bishkek", "Istanbul", "Toshkent", "Almaty"));
        ArrayList<String> classes = new ArrayList<>(Arrays.asList("math","physics", "science"));

        listoflists.add(animals);
        listoflists.add(cities);
        listoflists.add(classes);

        ArrayList<ArrayList<String>> arrayLists = toCamelCase(listoflists);
        System.out.print(arrayLists + " ");

    }

    static ArrayList<ArrayList<String >> toCamelCase(ArrayList<ArrayList<String>> listofList){
        for (int row = 0; row < listofList.size(); row++) {
            for (int column = 0; column < listofList.get(row).size(); column++) {
                String strtoCamelCase = listofList.get(row).get(column);
                listofList.get(row).set(column,strtoCamelCase.substring(0,1).toUpperCase()+strtoCamelCase.substring(1).toLowerCase());
            }
        }
        return listofList;
    }
}
