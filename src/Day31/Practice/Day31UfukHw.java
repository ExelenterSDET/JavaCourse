package Day31.Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;

public class Day31UfukHw {
    /*

    Create a Set of Strings, named as classes.
    Chemistry, Physics, Math
    Add random names to the classes.

    Task1. How many students we have in total.
    Task2. How many students are taking only Math
    Task3. How many students are taking both Chemistry and Physics
    Task4. How many students are taking all three classes.

     */
    public static void main(String[] args) {


        HashSet<String> Math = new HashSet<>(Arrays.asList("Ahmet", "Oruc", "Omer", "Fatma", "Seyma", "Busra", "Ufuk", "Bayram"));
        HashSet<String> Physics = new HashSet<>(Arrays.asList("Ufuk", "Yasar", "Serdar", "Fatma", "Ali", "Ayse", "Omer"));
        HashSet<String> Chemistry = new HashSet<>(Arrays.asList("Seyma", "Ufuk", "Serdar", "Oruc"));

        System.out.println("# of students taking only Math: " + Math.size());
        Chemistry.addAll(Physics);
        System.out.println("# of students taking both Chemistry and Physics: "+Chemistry.size());
        Chemistry.addAll(Math);
        System.out.println("# of students taking all three courses: "+Chemistry.size());
        System.out.println("Total number of student is: "+Chemistry.size());

    }
}