package Day44.UfukSaturdayProject.Task4;

public class q1 {
    public static void main(String[] args){

        System.out.println(reversedString(args));
    }

    public static String reversedString(String[] str){
        String reversed="";
        for (int i = str.length-1; i>=0; i--) {
            reversed=reversed.concat( str[i]+" ");
        }
        return reversed;

    }


}
