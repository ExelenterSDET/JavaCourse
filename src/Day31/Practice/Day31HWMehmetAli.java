package Day31;
 /*
    Create a Set of Strings, named as classes.
    Chemistry, Physics, Math
    Add random names to the classes.
    Task1. How many students we have in total.
    Task2. How many students are taking only Math
    Task3. How many students are taking both Chemistry and Physics
    Task4. How many students are taking all three classes.
     */

import java.util.Arrays;
import java.util.HashSet;

public class Day31HWMehmetAli {

    public static void main(String[] args) {


        HashSet<String> Chemistry  = new HashSet<>(Arrays.asList("Cihat", "Ali", "Mehmet", "Hakan", "Sezayi", "Aydin", "Elif"));
        HashSet<String> Physics = new HashSet<>(Arrays.asList("Mehmet", "Ali", "Sezayi","Elisa"));
        HashSet<String> Math = new HashSet<>(Arrays.asList("Sezayi", "Hakan", "Mehmet","Elisa","Haydar"));



        System.out.println("Number of students taking Math: " + Math.size());
        Chemistry.addAll(Physics);
        System.out.println("Number of  students taking both Chemistry and Physics: "+Chemistry.size());
        Chemistry.addAll(Math);
        System.out.println("Number of  students taking all three courses: "+Chemistry.size());
        System.out.println("Total number of student is: "+Chemistry.size());

    }
}