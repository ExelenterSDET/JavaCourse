package Day3.Java;

public class JavaDownCasting {
    //NarrowCasting

    /*

    1. double db1 = 105.3268;
        down cast it with all other primitive data types. (byte, short, int, long, float)
    2. long fl1 = 500;
        down cast it to byte, short, int
     */

    public static void main(String[] args) {

        long l1 = 50000;
        long l2 = l1;


        int iNum = 100;
        int iNum2 = iNum;
        int iNum4 = (int) l1;
        System.out.println("iNum4 = " + iNum4);

        System.out.println("iNum2 = " + iNum2);
        System.out.println("iNum = " + iNum);

        byte bt1 = 5;
        byte bt2 = bt1;
        byte bt3 = (byte) iNum;

        System.out.println("bt1 = " + bt1);
        System.out.println("bt2 = " + bt2);
        System.out.println("bt3 = " + bt3);

        short sh1 = 1500;
        short sh2 = sh1;
        short sh3 = (short) iNum;

        System.out.println("sh1 = " + sh1);
        System.out.println("sh2 = " + sh2);

        double db1 = 10.995;
        double db2 = db1;
        System.out.println("db1 = " + db1);
        System.out.println("db2 = " + db2);

        float fl1 = 11.0f;
        float fl2 = fl1;
        float fl3 = (float) db1;
        System.out.println("fl1 = " + fl1);
        System.out.println("fl2 = " + fl2);
        System.out.println("fl3 = " + fl3);

        int iNum3 = (int) db1;
        System.out.println("iNum3 = " + iNum3);


        int maximum = Integer.MAX_VALUE;
        int minimum = Integer.MIN_VALUE;
        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);

        long l3 = 2147483657l;
        System.out.println("l3 = " + l3);

        int iNum5 = (int) l3;
        System.out.println("iNum5 = " + iNum5);


        // TASK Solution
        double db11 = 105.3268;
        byte bt11 = (byte) db11;
        short sh11 = (short) db11;
        int inum11 = (int) db11;
        long l11 = (long) db11;
        float f11 = (float) db11;

        long fl12 = 500;
        byte bt12 = (byte) fl12;
        short sh12 = (short) fl12;
        int iNum12 = (int) fl12;

    }
}
