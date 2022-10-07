package Day43.Practice.Anthony.OCAinClassHour;

public class OCA2 {

    static int count =0;
    int i =0;

    public void changeCount () {
        while (i<5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        OCA2 check1 = new OCA2 ();
        OCA2 check2 = new OCA2 ();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " :" +  check2.count);
    }
}
