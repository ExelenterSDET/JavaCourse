package Day50.Java;

public class Task1_1 {
    static String str;
    public static void main(String[] args) {

        try {
            str = str.substring(0, 1);
            System.out.println("try block");
        }catch(NullPointerException e){
            System.out.println("catch block");
            System.out.println(e);
        }
    }
}
