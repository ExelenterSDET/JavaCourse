package Day3.Java;

public class JavaArithmeticOperators {

    public static void main(String[] args) {

        // Plus, addition

        int num1 = 3;
        int num2 = 20;
        int total = num1 + num2;
        System.out.println("total = " + total);

        // minus, subtraction
        int subs = num2 - num1;
        System.out.println("subs = " + subs);

        // multiplication
        int mult = num1 * num2;
        System.out.println("mult = " + mult);

        // divide
        int div = num2 / num1;
        System.out.println("div = " + div);


        double dbDiv = 30 / 7.0;
        System.out.println("dbDiv = " + dbDiv);

        // double / int ===> ok
        // double / double ====> ok
        // int / double =====> ok
        // int / int =====>> wrong math calculation

        float fl = 50.0f / 7;
        System.out.println("fl = " + fl);

        int num3 = 100;
        double sh = 50.55;
        int result = (int)(num3 + sh);
        double dbresult = num3 + sh;



    }
}
