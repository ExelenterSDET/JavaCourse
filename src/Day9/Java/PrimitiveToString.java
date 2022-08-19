package Day9.Java;

public class PrimitiveToString {

    public static void main(String[] args) {
        int i = 5;

        String str = String.valueOf(i);
        String str2 = Integer.toString(i);
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        byte b = 1;
        String s = String.valueOf(b);
        String s1 = Byte.toString(b);

        short sh = 2;
        String s2 = String.valueOf(sh);
        String s3 = Short.toString(sh);

        long l = 100;
        String s4 = String.valueOf(l);
        String s5 = Long.toString(l);

        float fl = 10.5f;
        String s6 = String.valueOf(fl);
        String s7 = Float.toString(fl);

        double db = 100.55;
        String s8 = String.valueOf(db);
        String s9 = Double.toString(db);

        boolean bl = true;
        String s10 = String.valueOf(bl);
        String s11 = Boolean.toString(bl);

        char c = 'a';
        String s12 = String.valueOf(c);
        String s13 = Character.toString(c);
        System.out.println("s12 = " + s12);
        System.out.println("s13 = " + s13);

    }
}
