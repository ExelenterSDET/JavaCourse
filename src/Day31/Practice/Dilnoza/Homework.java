package Day31.Practice.Dilnoza;

import java.util.Arrays;
import java.util.HashSet;

public class Homework {
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
        HashSet<String> Chemistry= new HashSet<>((Arrays.asList("Anthony","Dilnoza","Andrea","James","Peter","Kim")));
        HashSet<String> Physics= new HashSet<>((Arrays.asList("James","Dilnoza","Andrea","James","Malika","Ufuk")));
        HashSet<String> Math= new HashSet<>((Arrays.asList("Arthur","Kim","Malika","Anthony","Peter","Kim")));


        HashSet<String> total= new HashSet<>();
        total.addAll(Chemistry);
        total.addAll(Physics);
        total.addAll(Math);
        System.out.println("total number of students = " + total.size());
        System.out.println("total = " + total);
        System.out.println("=================================================");

        HashSet<String> math= new HashSet<>();
        math.addAll(Math);
        System.out.println("math = " + math);
        System.out.println("total number of students taking math = " + math.size());
        System.out.println("=================================================");

        HashSet<String> chemAndPhysics= new HashSet<>();
        chemAndPhysics.addAll(Physics);
        chemAndPhysics.addAll(Chemistry);
        System.out.println("chemAndPhysics = " + chemAndPhysics);
        System.out.println("total number of students taking chemAndPhysics = " + chemAndPhysics.size());


        System.out.println("=================================================");



    }
    }



