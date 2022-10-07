package Day43.Java;

public class StaticAttributesRecap {
    static int staticNum = 0;
    int nonStaticNum = 0;

    public static void main(String[] args) {
        StaticAttributesRecap sr1 = new StaticAttributesRecap();
        sr1.staticNum = 5;
        sr1.nonStaticNum = 5;
        StaticAttributesRecap sr2 = new StaticAttributesRecap();
        sr2.staticNum = 10;
        sr2.nonStaticNum = 10;
        StaticAttributesRecap sr3 = new StaticAttributesRecap();
        sr3.staticNum = 20;
        sr3.nonStaticNum = 20;
        StaticAttributesRecap sr4 = new StaticAttributesRecap();
        sr4.staticNum = 30;
        sr4.nonStaticNum = 30;

        System.out.println("sr1 static = " + sr1.staticNum + " non-static = " + sr1.nonStaticNum);
        System.out.println("sr2 static = " + sr2.staticNum + " non-static = " + sr2.nonStaticNum);
        System.out.println("sr3 static = " + sr3.staticNum + " non-static = " + sr3.nonStaticNum);
        System.out.println("sr4 static = " + sr4.staticNum + " non-static = " + sr4.nonStaticNum);

    }

}
