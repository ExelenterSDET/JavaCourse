package Day10.Java;

public class JavaIfStatements {
/*
The Java if statement tests
the condition. It executes
the if block if condition
is true.

 */
    public static void main(String[] args) {

        boolean b = true;

        if (b){
            System.out.println("Condition is true");
        }

        String str = "Java is fun";
        boolean java = str.contains("Java1");

        if(java){
            System.out.println("string contains Java");
        }

        int number1 = 15;
        int number2 = 15;

        if(number1==number2){
            System.out.println("Two numbers are equal");
        }

    }
}
