package OCA.Q68;

public class Q68 {

}

class Test{
    public static void doSum(Integer x, Integer y){
        System.out.println("Integer " + (x+y));
    }
    public static void doSum(double x, double y){
        System.out.println("double " + (x+y));
    }
    public static void doSum(float x, float y){
        System.out.println("float " + (x+y));
    }
    public static void doSum(int x, int y){
        System.out.println("int " + (x+y));
    }

    public static void doSum(long x, long y){
        System.out.println("long " + (x+y));
    }


    public static void main(String[] args) {
        doSum( 10, 20);
        doSum(10.0, 20.0);
    }
}