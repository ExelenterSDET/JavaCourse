package Day14.Java;

public class JavaMathRound {
    // Math.round() It is used to round of the decimal numbers to the nearest value.
    // Math.round with double returns long. Math.round with float return int.

    public static void main(String[] args) {

        double db = 5.1;
        float fl = 5.6f;

        int roundDouble = (int)Math.round(db);
        int roundFloat = Math.round(fl);

        System.out.println("roundDouble = " + roundDouble);
        System.out.println("roundFloat = " + roundFloat);


    }
}
