package Day9.Java;

public class StringToPrimitive {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "20";
        int i = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        String s3 = s1+s2;
        System.out.println("s3 = " + s3);
        System.out.println(i+i2);

        byte b = Byte.parseByte(s1);
        byte b1 = Byte.valueOf(s1);
        System.out.println(b+b1);

        short sh = Short.parseShort(s1);
        short sh1 = Short.valueOf(s1);

        int i1 = Integer.parseInt(s1);
        int i11 = Integer.valueOf(s1);

        long l = Long.parseLong(s1);
        long l1 = Long.valueOf(s1);

        float fl = Float.parseFloat(s1);
        float fl1 = Float.valueOf(s1);

        double db = Double.parseDouble(s1);
        double db1 = Double.valueOf(s1);

        String bl3 = "True";
        boolean bl = Boolean.parseBoolean(bl3);
        boolean bl1 = Boolean.valueOf(s1);

    }
}
