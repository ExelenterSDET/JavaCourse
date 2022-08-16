package Day6.Practice.Mentoring;

public class Task_Increments {

    public static void main(String[] args) {
        int i = 11;
        i = i++ + ++i;  // 11 + 1+12 = 24
        System.out.println(i);
    }
}
