package Day3.Java;

public class JavaCharCasting {

    /*
    create different primitive data type variables and assign value to print "worlds"
     */
    public static void main(String[] args) {

        int num1 = 70;
        byte bt1 = 84;
        char ch1 = (char)num1;
        char ch2 = (char)bt1;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        double db1 = 97.6591321320;
        char ch3 = (char)db1;

        System.out.println("ch3 = " + ch3);

        //TASK1
        byte bt = 87;
        short sh = 79;
        int num = 82;
        long l = 76;
        float f = 68f;
        double d = 83;

        System.out.print((char)bt);
        System.out.print((char)sh);
        System.out.print((char)num);
        System.out.print((char)l);
        System.out.print((char)f);
        System.out.print((char)d);
        System.out.println();
        System.out.println(""+(char)bt + (char)sh + (char)num + (char)l + (char)f + (char)d);

        // Topic for the future
//        System.out.println(""+1+5+6);
//        System.out.println(1+5+6);
//        System.out.println(""+1+(5+6));


    }
}
