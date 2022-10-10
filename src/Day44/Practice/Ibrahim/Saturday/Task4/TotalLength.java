package Day44.Practice.Ibrahim.Saturday.Task4;

public class TotalLength {

    public static void main(String[] args){
        int total = 0;

        for(String arg : args){

            total += arg.length();

        }

        System.out.println(total);
    }
}
