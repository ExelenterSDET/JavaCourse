package Day14.Java;

public class JavaMathMaxOrMin {
    /*
    Math.max() It returns the Largest of two values.
    Math.min() It is used to return the Smallest of two values.
     */
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        int largest = num1 > num2 ? num1 : num2;
        System.out.println("largest = " + largest);

        int smallest = num1 > num2 ? num2 : num1;
        System.out.println("smallest = " + smallest);

        int largestWMathMax = Math.max(num1, num2);
        System.out.println("largestWMathMax = " + largestWMathMax);

        int smallestWMathMin = Math.min(num1, num2);
        System.out.println("smallestWMathMin = " + smallestWMathMin);

    }
}
