package Day24.Practice.Malika_Tasks;

public class Tasks_1and2 {
    //TASK1
    //Create a method which will return the perimeter of the triangle

    public static int getParameter(int a, int b, int c){
        return a+b+c;

    }
    //TASK2
    //Create a method which will return the perimeter of the rectangle
    public static int getParameter(int width, int length) {
        return 2 * (width + length);
    }
    //TASK3
    //Create a method which will return the perimeter of pentagon, octagon or decagon
    public static int getPerimeter(byte numSides, int side) {
        return numSides * side;
    }

    //TASK4
    // Create a void method which will have a String (student name) and int varargs (grade) as parameters.
    // print name of the student, and average of the grades.
    // (Furkat Ali, 50,60,70) => Furkat Ali : 60
    static void getStudentAverage(String student, int... grades) {
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total+=grades[i];
        }
        System.out.println("The Average for the student " + student + " is " + total/grades.length);
    }

    public static void main(String[] args) {
        String student = "Andrea";
        int physics = 100;
        int math = 98;
        int science = 80;
        getStudentAverage(student, physics, math,science);
}
    }