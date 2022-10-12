package Day44.UfukSaturdayProject.Task4;

public class q3 {
    public static void main(String[] args) {
        System.out.println(totalNumOfStrings(args));
    }

    public static int totalNumOfStrings(String[] strs){
        int counter=0;
        for (String str : strs) {
            counter+=str.length();
        }
        return counter;
    }
}
