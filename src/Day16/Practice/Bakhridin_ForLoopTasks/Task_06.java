package Day16.Practice.Bakhridin_ForLoopTasks;

public class Task_06 {
    public static void main(String[] args) {

        String str = "Java is Fun";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'F') {
                break;

            }
            System.out.print(str.charAt(i));

        }

    }
}
