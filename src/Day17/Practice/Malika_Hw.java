package Day17.Practice;

public class Malika_Hw {
    public static void main(String[] args) {
         /*
    Homework
    String num1 = "368"
    String num2 = "1020304050"

    10 20 30 40 50 60
     3  3  3  3  3  3 = 12345
     6  6  6  6  6  6 = 42042
     8  8  8  8  8  8 = 24602
    */

        String num1 = "368";
        String num2 = "1020304050";

        for (int i = 0; i < num1.length(); i++) {
            int number1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
            String result = "";

            for (int j = 0; j < num2.length(); j+=2) {
                int number2 = Integer.parseInt(num2.substring(j, j+2));
                result += number2%number1;
            }
            System.out.println(result);
        }
    }
}
