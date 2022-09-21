package Day31.Practice;

import java.util.Arrays;
import java.util.HashSet;

public class Sebahattin {
    public static void main(String[] args) {


    /*
    Create a Set of Strings, named as classes.
    Chemistry, Physics, Math
    Add random names to the classes.

    Task1. How many students we have in total.
    Task2. How many students are taking only Math
    Task3. How many students are taking both Chemistry and Physics
    Task4. How many students are taking all three classes.
     */

        HashSet<String> lesssonChemistry = new HashSet<>(Arrays.asList("Alperen", "Gozde", "Dilek", "Sinan", "Cem"));
        HashSet<String> lessonPhysics = new HashSet<>(Arrays.asList("Sebahattin", "Sinan", "Gozde", "Alperen", "Kadir", "Egemen"));
        HashSet<String> lessonMath = new HashSet<>(Arrays.asList("Sinan", "Sebahattin", "Beyza", "Cem", "Gozde"));

        HashSet<String> lessonsAll = new HashSet<>();
        lessonsAll.addAll(lesssonChemistry);
        lessonsAll.addAll(lessonPhysics);
        lessonsAll.addAll(lessonMath);
        System.out.println("All lessons --> "+lessonsAll);
        System.out.println("All lessons --> "+lessonsAll.size());

        HashSet<String> chemistryAndPhysics = new HashSet<>();
        chemistryAndPhysics.addAll(lesssonChemistry);
        chemistryAndPhysics.addAll(lessonPhysics);
        System.out.println("Both Chemistry and Physics --> "+chemistryAndPhysics);
        System.out.println("Both Chemistry and Physics size--> "+chemistryAndPhysics.size());

        HashSet<String> onlyMath = new HashSet<>(lessonsAll);
        onlyMath.removeAll(chemistryAndPhysics);
        System.out.println("Math only--> "+onlyMath);
        System.out.println("Math size only--> "+onlyMath.size());

        HashSet<String> retainAllLessons = new HashSet<>();
        retainAllLessons.addAll(lesssonChemistry);
        retainAllLessons.retainAll(lessonPhysics);
        retainAllLessons.retainAll(lessonMath);
        System.out.println("All three classes --> "+retainAllLessons);
        System.out.println("All three classes size --> "+retainAllLessons.size());

    }
}
