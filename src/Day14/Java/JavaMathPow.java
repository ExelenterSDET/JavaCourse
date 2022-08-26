package Day14.Java;

public class JavaMathPow {

    /*
     Math.pow() It returns the value of first argument raised to the power to second argument.
     First parameter is a number, second is its power. Accepts double, returns double
     */
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;

        //Pow means 2 * 2 * 2

        double pow = Math.pow(num1, num2);

        System.out.println("pow = " + pow);

        double d = 5.4;
        int i = 3;
        System.out.println(Math.pow(d,i));

    }
}
