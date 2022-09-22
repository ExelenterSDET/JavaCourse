package Day31.Practice;

import java.util.*;

public class Anthony {
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
        Set<String> students = new HashSet<String>();
        students.add("Andrea");
        students.add("Anthony");
        students.add("Arthur");
        students.add("Bakhridin");
        students.add("Besime");
        students.add("Dilnoza");
        students.add("Ibrahim");
        students.add("Malika");
        students.add("Mustafa");
        students.add("Sebahattin");
        students.add("Tohir");
        students.add("Ufuk");

        System.out.println("students = " + students);

        System.out.println("TASK 1 = Number of students = " + students.size());

        System.out.println("===========================================================");

        Set<String> classes = new HashSet<String>();
        classes.add("Chemistry");
        classes.add("Physics");
        classes.add("PE");
        classes.add("Math");

        System.out.println("Classes = " + classes);

        System.out.println("TASK 1A - How many classes are available = " + classes.size());
        System.out.println("===========================================================");

//        Set<String> combination = new HashSet<String>(classes);
//        combination.addAll(students);
//        System.out.println("combination = " + combination);

        HashSet<String> mathClass = new HashSet<>();
        mathClass.add("Tohir");
        mathClass.add("Ufuk");

        System.out.println("TASK 2 - mathClass Students = "+ mathClass + " # of students = " + mathClass.size());

        HashSet<String> chemistryAndPhysics = new HashSet<>();
        chemistryAndPhysics.add("Anthony");
        chemistryAndPhysics.add("Arthur");
        chemistryAndPhysics.add("Bakhridin");
        chemistryAndPhysics.add("Besime");
        chemistryAndPhysics.add("Dilnoza");
        chemistryAndPhysics.add("Ibrahim");

        System.out.println("TASK 3 - Chemistry and Physics Students = " + chemistryAndPhysics + " # of students = " + chemistryAndPhysics.size());

        HashSet<String> allClasses = new HashSet<>();
        allClasses.add("Andrea");
        allClasses.add("Malika");
        allClasses.add("Mustafa");
        allClasses.add("Sebahattin");

        System.out.println("TASK 4 - Students taking all Classes = " + allClasses + " # of students = " + allClasses.size());

        System.out.println("===========================================================");

        System.out.println("Random Element: " + getElement(students) +" "+ getElement(classes));
        System.out.println("Random Element: " + getElement(students) +" "+ getElement(classes));
        System.out.println("Random Element: " + getElement(students) +" "+ getElement(classes));

        System.out.println("===========================================================");
    }

    private static <E> E getElement(Set <? extends E> set) {

        Random random = new Random();

        int randomNumber = random.nextInt(set.size());

        Iterator<? extends E> iterator = set.iterator();

        int currentIndex = 0;
        E randomElement = null;

        while (iterator.hasNext()) {
            randomElement = iterator.next();

        if (currentIndex == randomNumber)
            return randomElement;
        currentIndex++;
        }
        return randomElement;
    }
}


