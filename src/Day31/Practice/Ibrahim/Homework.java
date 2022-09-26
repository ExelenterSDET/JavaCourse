package Day31.Practice.Ibrahim;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
    Create a Set of Strings, named as classes.
    Chemistry, Physics, Math
    Add random names to the classes.

    Task1. How many students we have in total.
    Task2. How many students are taking only Math
    Task3. How many students are taking both Chemistry and Physics
    Task4. How many students are taking all three classes.

     */
public class Homework {
    public static void main(String[] args) {

        HashSet<String> chemistry = new HashSet<>(Arrays.asList("Ibrahim", "Emrah", "Zubeyir", "Bayram", "Volkan"));
        System.out.println("Chemistry Students = " + chemistry);
        HashSet<String> math = new HashSet<>(Arrays.asList("Ibrahim", "Emrah", "Volkan", "Zubeyir", "Murat", "Yunus"));
        System.out.println("Math Students = " + math);
        HashSet<String> physics = new HashSet<>(Arrays.asList("Abdullah", "Samet", "Zubeyir", "Bayram"));
        System.out.println("Physic Students = " + physics);
        System.out.println();

        //Task1. How many students we have in total.

        HashSet<String> allStudents = new HashSet<>();
        allStudents.addAll(chemistry);
        allStudents.addAll(math);
        allStudents.addAll(physics);
        System.out.println("allStudents = " + allStudents);

        int total = allStudents.size();
        System.out.println("Total Students = " + total);
        System.out.println();

        //Task2. How many students are taking only Math

        HashSet<String> onlyMath = new HashSet<>(math);
        onlyMath.removeAll(chemistry);
        onlyMath.removeAll(physics);
        System.out.println("Only Math = " + onlyMath);
        System.out.println();

        //Task3. How many students are taking both Chemistry and Physics

        HashSet<String> chemAndPhysics = new HashSet<>(chemistry);
        chemAndPhysics.retainAll(physics);

        System.out.println("Chemistry and Physics = " + chemAndPhysics);
        System.out.println();

        //Task4. How many students are taking all three classes.

        HashSet<String> allThreeClasses = new HashSet<>(chemistry);
        allThreeClasses.retainAll(math);
        allThreeClasses.retainAll(physics);
        System.out.println("All Three Classes = " + allThreeClasses);

    }
}
