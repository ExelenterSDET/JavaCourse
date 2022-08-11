package Day1.Practice;

public class JavaDownCasting {
    public static void main(String[] args) {
        double dbl = 105.3268;
        double dbl2 = dbl;

        byte bt1 = (byte) dbl;
        short sh1 = (short) dbl;
        int iNum = (int) dbl;
        long l1 = (long) dbl;
        float fl1 = (float) dbl;

        System.out.println("dbl = " + dbl);
        System.out.println("dbl2 = " + dbl);
        System.out.println("bt1 = " + bt1);
        System.out.println("sh1 = " + sh1);
        System.out.println("iNum = " + iNum);
        System.out.println("l1 = " + l1);
        System.out.println("fl1 = " + fl1);

        byte bt2 = 119;
        short sh2 = 111;
        int num2 = 114;
        long l2 = 108;
        float fl2 = 100;
        double dbl3 = 115;
        char ch1 = (char) bt2;
        char ch2 = (char) sh2;
        char ch3 = (char) num2;
        char ch4 = (char) l2;
        char ch5 = (char) fl2;
        char ch6 = (char) dbl3;

        System.out.print("" + ch1+ch2+ch3+ch4+ch5+ch6);


         char ch7 = 'M';
        System.out.print(ch7);
        ch7 = 'A';
        System.out.print(ch7);
        ch7 = 'L';
        System.out.print(ch7);
        ch7 = 'I';
        System.out.print(ch7);
        ch7 = 'K';
        System.out.print(ch7);
        ch7 = 'A';
        System.out.print(ch7);

    }
}
