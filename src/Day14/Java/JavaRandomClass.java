package Day14.Java;

import java.util.Random;

public class JavaRandomClass {
        /*
        same as Math Random
         */
    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt();
        System.out.println("i = " + i);
        double d = random.nextDouble();
        System.out.println("d = " + d);
        long l = random.nextLong();
        System.out.println("l = " + l);


        // to have a random number between 0 and your number, just pass your number as parameter

        int i2 = random.nextInt(3);
        System.out.println("i2 = " + i2);

        // to have a random number between two numbers. example: 25 and 30
        // (max - min) + min (max number is not included)
        // (max - min + 1) + min (max number is included)

        int i3 = random.nextInt(30-28+1) + 28;
        System.out.println("i3 = " + i3);

        // random number between two double numbers  25 and 27
        // (random * (max - min) + min);
        double db = random.nextDouble();
        double randomDb = db * (27-25) + 25;
        System.out.println("randomDb = " + randomDb);

       double db3 = (random.nextDouble() * 2) + 25;
        System.out.println("db3 = " + db3);


    }
}
