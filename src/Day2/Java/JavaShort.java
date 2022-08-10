package Day2.Java;

public class JavaShort {

    static short defaultShortValue;

    public static void main(String[] args) {

        short minimumValue = Short.MIN_VALUE;
        short maximumValue = Short.MAX_VALUE;

        System.out.println("minimumValue = " + minimumValue);
        System.out.println("maximumValue = " + maximumValue);
        System.out.println("defaultShortValue = " + defaultShortValue);

        short example = (short) (30000 + 10000);
        System.out.println("example = " + example);
    }

}
