package Day16.Practice.Bakhridin_ForLoopTasks;

public class Task_02 {
    public static void main(String[] args) {

        String n = "12321";
        String nReverse = "";

        for (int i = n.length()-1; i >=0; i--) {

            nReverse+=n.charAt(i);


        }
        System.out.println(n.equals(nReverse));


    }
}
