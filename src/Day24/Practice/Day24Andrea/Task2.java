package Day24.Practice.Day24Andrea;

public class Task2 {

    public static void main(String[] args) {

    }

    static void getAverage (String name, int... grades){
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }
        System.out.println("The average for the student " + name + " is " + total/grades.length);
    }
}

