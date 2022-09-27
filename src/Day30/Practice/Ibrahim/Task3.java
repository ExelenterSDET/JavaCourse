package Day30.Practice.Ibrahim;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Create a method, which will have list of list of Strings as a parameter.
    Convert all Strings to be Camel Case. Example dog => Dog, if cat => Cat
    return the list of list of strings
 */
public class Task3 {

    static void allCamelCase(ArrayList<ArrayList<String>> a){

        for (ArrayList<String> str : a) {
            for (String s : str) {
                str.set(str.indexOf(s), (s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()));
            }
        }
        System.out.println(a);
    }
    static void allUpperCase(ArrayList<ArrayList<String>> a){

        for (ArrayList<String> str : a) {
            for (String s : str) {
                str.set(str.indexOf(s), s.toUpperCase() );
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfList = new ArrayList<>();


        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("January", "February", "March"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("dog", "cat", "mouse", "rabbit"));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        allUpperCase(listOfList);
        allCamelCase(listOfList);
    }
}
