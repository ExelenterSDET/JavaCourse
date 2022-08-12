package Day4.Java;

// Note:
// To mute code, you can use /* ...Code here ... */ OR Select area which you want to mute and press ctrl+/ (for windows) and command+/ (for mac)
public class JavaMultipleVariableInitialize {

    public static void main(String[] args) {

        double water = 1.2, soda = 1.5, bread = 1.99, chocolate = 0.99;
//        double soda = 1.5;
//        double bread = 1.99;
//        double chocolate = 0.99;

        System.out.println("water = " + water);
        System.out.println("soda = " + soda);
        System.out.println("bread = " + bread);
        System.out.println("chocolate = " + chocolate);

        int health = 10000, defense = 50000, salesTax = 5000;
        System.out.println("health = " + health);
        System.out.println("defense = " + defense);
        System.out.println("salesTax = " + salesTax);

        byte bt = 5;
        short sh = 10;
        int num = 50;
        long ln = 500;
        float fl = 100.5F;
        double db = 10.5;


        int num1 = bt, num2 = sh, num3 = num, num4 = (int)ln, num5 = (int)db, num6 = (int)fl;

        byte bt2 = (byte)num5;

        // Task1
        /*
        create byte variables and name them as members of your family. and assign values as their ages.

         */




    }
}
