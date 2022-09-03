package Day16.Practice.Bakhridin_ForLoopTasks;

public class Task_07 {
    public static void main(String[] args) {

        String str = "Hello World";



        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='l') {
                continue;
            }
            System.out.print(str.charAt(i));

        }
    }
}
