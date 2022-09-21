package Day31.Practice.Andrea;

import java.util.Arrays;
import java.util.HashSet;

public class Homework {

    public static void main(String[] args) {

    HashSet<String> chemistry = new HashSet<>(Arrays.asList("Yusuf", "Canan", "Demir", "Yigit", "Samil"));
    HashSet<String> physics = new HashSet<>(Arrays.asList("Demir", "Ibo", "Emir", "Canan", "Emel"));
    HashSet<String> math = new HashSet<>(Arrays.asList("Ronza", "Demir", "Kubra", "Emel", "Yigit", "Aizhan"));
//        Task1. How many students we have in total.
//        Task2. How many students are taking only Math
//        Task3. How many students are taking both Chemistry and Physics
//        Task4. How many students are taking all three classes.

        HashSet<String> total = new HashSet<>();
        total.addAll(chemistry);
        total.addAll(physics);
        total.addAll(math);
        System.out.println("Total number of students = " + total.size());

        HashSet<String> onlyMath = new HashSet<>();
        onlyMath.addAll(chemistry);
        onlyMath.addAll(physics);
        onlyMath.addAll(math);
        onlyMath.removeAll(chemistry);
        onlyMath.removeAll(physics);
        System.out.println("Total number of students taking only math = " + onlyMath.size());
        System.out.println("Students who are taking only Math = " + onlyMath);

        chemistry.retainAll(physics);
        System.out.println("Total number of students taking Chemistry and Physics = " + chemistry.size());
        System.out.println("Students who are taking both Chemistry and Physics = " + chemistry);

        chemistry.retainAll(math);
        System.out.println("Total number of students taking all three classes = " + chemistry.size());
        System.out.println("Students who are taking all three = " + chemistry);









//        set1.addAll(set2);
//        System.out.println(set1);

//        set1.retainAll(set2);
//        System.out.println(set1);

//        set2.removeAll(set1);
//        System.out.println(set2);



}
}
