package Day24.Practice.Mustafa;

public class TaskN {
    // Create a void method which will have a String (student name) and int varargs (grade) as parameters.
    // print name of the student, and average of the grades.
    // (Furkat Ali, 50,60,70) => Furkat Ali : 60
    static void method(String Sname, int... grade){
        int total = 0;
        for (int i = 0; i < grade.length; i++) {
            total += grade[i];
        }
        System.out.println("The average of " +Sname + " is " + total/ grade.length );
    }

    public static void main(String[] args) {
        String Sname = "Mustafa";
        int Math = 100;
        int Biology = 20;

        method(Sname, Math, Biology);

    }
}
