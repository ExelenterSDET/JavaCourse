package Day41.Practice.Andrea.Practice;

public class OCA {

    public static int stVar = 100;
    public int var = 200;
    public String toString(){
        return stVar + ": " + var;
    }
    public static void main(String[] args) {
        OCA t1 = new OCA ();
        t1.var = 300;
        System.out.println(t1);
        OCA t2 = new OCA();
        t2.stVar = 300;
        System.out.println(t2);
    }
}
