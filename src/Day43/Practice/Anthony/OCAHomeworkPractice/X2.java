package Day43.Practice.Anthony.OCAHomeworkPractice;

public class X2 {
    static int i;
    int j;
    public static void main (String[] args){
        X2 x1 = new X2();
        X2 x2 = new X2();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j);
    }
}

