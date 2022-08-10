package Day1.Practice;

public class Hamid {


    public static void main (String [] args){


        byte num = 127;  // range of the byte is -128  to  127
        byte num2 = -128;
        byte total = (byte) (num + num2);

        boolean b = num == num2;

        System.out.println(total);

        System.out.println(" \"Hello world\"\t Hi \\ ");


        System.out.println(total);


        byte min = Byte.MIN_VALUE;

        byte max = Byte.MAX_VALUE;
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }

}
