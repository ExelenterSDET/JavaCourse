package Day3.Java;

public class JavaUpCasting {

    // widening casting

    public static void main(String[] args) {

        byte bt1 = 50;
        short sh1 = bt1;
        int iNum1 = bt1;
        long l1 = bt1;
        float fl1 = bt1;
        double db1 = bt1;

        System.out.println("bt1 = " + bt1);
        System.out.println("sh1 = " + sh1);
        System.out.println("iNum1 = " + iNum1);
        System.out.println("l1 = " + l1);
        System.out.println("fl1 = " + fl1);
        System.out.println("db1 = " + db1);

        long l2 = 5000;
        double db2 = l2;
        int iNum2 = (int) l2;
        float fl2 = l2;
        short sh2 = (short) l2;
        System.out.println("l2 = " + l2);
        System.out.println("db2 = " + db2);
        System.out.println("iNum2 = " + iNum2);
        System.out.println("fl2 = " + fl2);
        System.out.println("sh2 = " + sh2);


    }
}
