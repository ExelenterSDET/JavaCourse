package Day41.Practice.Anthony;

public class OCA1 {

    public static int stVar = 100;
    public int var = 200;
    public String toString(){
        return stVar + ": " + var;
    }
    public static void main(String[] args) {
        OCA1 t1 = new OCA1 ();
        t1.var = 300;
        System.out.println(t1);
        OCA1 t2 = new OCA1();
        t2.stVar = 300;
        System.out.println(t1);
        System.out.println(t2);


    }
}


