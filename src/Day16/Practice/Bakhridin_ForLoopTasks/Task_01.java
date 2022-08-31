package Day16.Practice.Bakhridin_ForLoopTasks;

public class Task_01 {
    public static void main(String[] args) {

        String str = "Java";
        String str2 = "";

        for (int i = str.length()-1; i >=0 ; i--) {
//            str2=String.valueOf(str.charAt(i));
            str2+=str.charAt(i);

        }
        System.out.println("str2 = " + str2);

    }
}
