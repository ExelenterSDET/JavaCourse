package Day50.Practice.Andrea;

public class JavaExceptions {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        try{
            int result = num1/num2; //will throw arithmetic exception
            System.out.println(result);
        }catch(ArithmeticException e){ //without catch block, code will run but exception will be thrown
            System.out.println("Arithmetic exception handled");
        }finally{ //optional
            System.out.println("Finally block");
        }

    }
}
