package Day41.Practice.Andrea.Practice;

public class OCA2 {
    int ns; //instance of the class attribute
    static int s; //class attribute
    OCA2 (int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;

        }
    }
    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);;
    }

    public static void main(String[] args) {
        OCA2 ref1 = new OCA2(50); // ns = 50, s = 125 (originally 0, then 50, then 125)
        OCA2 ref2 = new OCA2(125); // ns = 125, s = 125
        OCA2 ref3 = new OCA2(100); // ns = 0, s = 125
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();

    }
}
