package Day1.Java;

public class JavaBoolean {
    static boolean defaultBoolean;
    public static void main(String[] args) {

        boolean bl = true;
        boolean bl1 = false;

        boolean bl3 = (2==2);
        boolean bl4 = (100==255);

        boolean bl5 = (100*5 == 1000/3);

        System.out.println(bl3);
        System.out.println(bl4);
        System.out.println(bl5);
        System.out.println("defaultBoolean = " + defaultBoolean);
    }
}
