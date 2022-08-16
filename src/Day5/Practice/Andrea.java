package Day5.Practice;

public class Andrea {
    public static void main(String[] args) {
        int z = 5;
        int y = 10;
        int x = (z++ + y++);
        System.out.println( x + y + z);
        System.out.println("result here: " + x + y + z);
        System.out.println("result here: " + x + (y + z));
        System.out.println("result here: " + (x + y + z));

        int num = 2345;
        int div = 10;
        int rem = num%div;
        System.out.println("num = " + num);

        System.out.println("rem = " + rem);
        num /= div;
        System.out.println("num = " + num);
        rem = num%div;
        System.out.println("rem = " + rem);
        num /= div;
        System.out.println("num = " + num);
        rem = num%div;
        System.out.println("rem = " + rem);
        num /= div;
        System.out.println("num = " + num);
        rem = num%div;
        System.out.println("rem = " + rem);

    }
}
