package Day1.Java;

public class JavaByte {

 static byte defaultValue;
    public static void main(String[] args) {

        byte min = -128;
        byte max = 127;

        byte number1 = 100;
        byte number2 = 100;
        byte total = (byte) (number1 + number2);

        byte maximumValue = Byte.MAX_VALUE;
        byte minimumValue = Byte.MIN_VALUE;

        System.out.println("total = " + total);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("maximumValue = " + maximumValue);
        System.out.println("minimumValue = " + minimumValue);
        System.out.println("defaultValue = " + defaultValue);

    }
}
