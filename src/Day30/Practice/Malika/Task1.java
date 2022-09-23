package Day30.Practice.Malika;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        //TASK1
         /*
    Create listOfLists of String.
    1. have at least 3 lists within listOfLists
    2. Size of the list or values could be anything.
    3. print the list of lists, using enhanced for loop or regular for loop.
     */

        ArrayList<ArrayList<String>> listoflists = new ArrayList<>();

        ArrayList<String> animals = new ArrayList<>(Arrays.asList("cat", "dog", "fox", "wolf", "tiger"));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Bishkek", "Istanbul", "Toshkent", "Almaty"));
        ArrayList<String> classes = new ArrayList<>(Arrays.asList("math","physics", "science"));

        listoflists.add(animals);
        listoflists.add(cities);
        listoflists.add(classes);

        for (int row = 0; row < listoflists.size(); row++) {
            for (int column = 0; column < listoflists.get(row).size(); column++) {
                System.out.print(listoflists.get(row).get(column) + " ");
            }
            System.out.println();
        }
    }

    }

