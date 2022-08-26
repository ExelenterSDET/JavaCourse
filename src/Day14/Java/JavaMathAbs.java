package Day14.Java;

public class JavaMathAbs {
    //Math.abs() It will return the Absolute value of the given value.

    public static void main(String[] args) {

        int num = -10;
        num = num < 0 ? -num : num;
        System.out.println("num 1= " + num);
        num = -10;
        System.out.println("num 2= " + num);
        if(num < 10) {
            num *= -1;
        }
        System.out.println("num 3= " + num);
        num = -10;
        System.out.println("num 4= " + num);
        num = Math.abs(num);
        System.out.println("num with Math.abs " + num);

        double db = -2.51;
        System.out.println(Math.abs(db));

    }
}
