package Day43.Java;

public class OCAQ66 {
    static int count = 0; // 1 2 3 4 5 // 6 7 8 9 10
    int i = 0; // 1 2 3 4 5 // 1 2 3 4 5
    public void changeCount () {
        while (i<5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        OCAQ66 check1 = new OCAQ66();
        OCAQ66 check2 = new OCAQ66();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.i + " :" + check2.i);
        System.out.println(check1.count + " :" + check2.count);
    }
}
