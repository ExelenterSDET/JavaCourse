package Day43.Practice.Anthony.PracticeTasks;

public class JavaMath {

    public static void main(String[] args){
        int total = 0;

        for(String arg: args){
            total += convert(arg);
        }
        System.out.println(total);
    }
    public static int convert(String str){
        return Integer.parseInt(str);

    }
}
