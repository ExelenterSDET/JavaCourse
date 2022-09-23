package Day30.Practice.Malika;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

                //TASK2
         /*
    Create a method, which will have list of list of Strings as a parameter.
    Convert all String character to upper case.
    return the list of list of strings
     */

        ArrayList<ArrayList<String>> listoflists = new ArrayList<>();

        ArrayList<String> animals = new ArrayList<>(Arrays.asList("cat", "dog", "fox", "wolf", "tiger"));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Bishkek", "Istanbul", "Toshkent", "Almaty"));
        ArrayList<String> classes = new ArrayList<>(Arrays.asList("math","physics", "science"));

        listoflists.add(animals);
        listoflists.add(cities);
        listoflists.add(classes);

        ArrayList<ArrayList<String>> arrayLists = toUpperCase(listoflists);
        System.out.print(arrayLists + " ");
    }

    static ArrayList<ArrayList<String>> toUpperCase(ArrayList<ArrayList<String>> listofLists){
        for (int row = 0; row < listofLists.size(); row++) {
            for (int column = 0; column < listofLists.get(row).size(); column++) {
                String strtoUpperCase = listofLists.get(row).get(column).toUpperCase();
                listofLists.get(row).set(column, strtoUpperCase);
            }
        }
        return listofLists;
    }
}
