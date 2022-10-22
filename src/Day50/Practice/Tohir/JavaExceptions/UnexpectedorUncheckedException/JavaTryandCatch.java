package Day50.JavaExceptions.UnexpectedorUncheckedException;

public class JavaTryandCatch {
    public static void main(String[] args) {
    int numb1 = 10;
    int numb2 = 0;
    try {
        int result = numb1/numb2;
        System.out.println("Try Block");
    }
    catch (ArithmeticException e)//can run without catch,after finally block gives returns error
    {
        System.out.println("ArithmeticException handled");
    }
    finally {//
        System.out.println("Finally Block runs");
    }

        System.out.println("try and catch\n");
        try {
            int result = numb1/numb2;
            System.out.println("Try Block");
        }
        catch (Exception e)//can run without catch,after finally block gives returns error
        {
            System.out.println("Exception handled");
        }
        System.out.println("try and finally\n");

        try {
            int result = numb1/numb2;
            System.out.println("Try Block");
        }
        finally {
            System.out.println("Finally Block runs");
        }
    }
}
