package Day14.Java;

public class JavaMathCeilAndFloor {
    /*
    Math.ceil() It is used to find the smallest integer value that is greater than or equal to the argument
    or mathematical integer.
    Math.floor() It is used to find the largest integer value which is less than
    or equal to the argument and is equal to the mathematical integer of a double value.
     */
    public static void main(String[] args) {

        double d = 3.99999999;

        double mathCeil = Math.ceil(d);
        double mathFloor = Math.floor(d);

        System.out.println("mathCeil = " + mathCeil);
        System.out.println("mathFloor = " + mathFloor);



    }
}
