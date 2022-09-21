package Day31.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class arthur31hmwk {
    public static void main(String[] args) {
        HashSet<String> chemistry = new HashSet<>(Arrays.asList("andrea","arthur","anthony"));
        HashSet<String> physics = new HashSet<>(Arrays.asList("andrea","anthony"));
        HashSet<String> math = new HashSet<>(Arrays.asList("andrea","arthur","bill"));
        HashSet<String> dummy = new HashSet<>();

//        Create a Set of Strings, named as classes.
//    Chemistry, Physics, Math
//    Add random names to the classes.
//
//    Task1. How many students we have in total.
//    Task2. How many students are taking only Math
//    Task3. How many students are taking both Chemistry and Physics
//    Task4. How many students are taking all three classes.
        System.out.println("math students " + math);
        System.out.println("physics students " + physics);
        System.out.println("chemistry students " + chemistry);
        //    Task1. How many students we have in total.
        dummy.addAll(physics);
        dummy.addAll(math);
        dummy.addAll(chemistry);
        int total = dummy.size();
        System.out.println("total = " + total);
        //    Task2. How many students are taking only Math
        int totmath = math.size();
        System.out.println("totmath = " + totmath);
        //    Task3. How many students are taking both Chemistry and Physics
        dummy.clear();
        dummy.addAll(chemistry);
        dummy.retainAll(physics);
        int totalchemphys = dummy.size();
        System.out.println("totalchemphys = " + totalchemphys);

        //    Task4. How many students are taking all three classes.
        dummy.clear();
        chemistry.retainAll(physics);
        chemistry.retainAll(math);

        System.out.println("all three " + chemistry.size());


    }


}
